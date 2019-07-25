package com.ssm.controller;

import com.ssm.po.Vote;
import com.ssm.po.VoteCustom;
import com.ssm.po.VoteQueryVo;
import com.ssm.service.PollService;
import com.ssm.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @date 2019-03-30-18-29
 */
@Controller
@RequestMapping("vote")
public class VoteController {

    @Autowired
    private VoteService voteService;
    @Autowired
    private PollService pollService;

    @RequestMapping("queryVote")
    public ModelAndView queryVote(VoteQueryVo voteQueryVo) throws Exception {

        List<VoteCustom> voteList = voteService.findVoteList(voteQueryVo);
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("voteList", voteList);
        modelAndView.setViewName("vote/voteList");
        return modelAndView;
    }

    @RequestMapping("queryAllVote")
    public @ResponseBody
    List<Vote> queryAllVote() throws Exception{
        List<Vote> voteList = voteService.findAllVoteList();
        return voteList;
    }

    @RequestMapping("queryOneVote")
    public ModelAndView queryOneVote(@RequestParam(value = "id")Integer voteid)throws Exception{

        VoteCustom voteCustom = voteService.queryOneVote(voteid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("voteCustom",voteCustom);
        modelAndView.setViewName("vote/voteAndPoll");
        return modelAndView;
    }

    @RequestMapping(value = "editVote", method = {RequestMethod.GET, RequestMethod.POST})
    public String editVote(Model model, @RequestParam(value = "id") Integer voteid) throws Exception {


        VoteCustom voteCustom = voteService.findVoteById(voteid);
        model.addAttribute("voteCustom", voteCustom);
        return "vote/editvoteList";
    }

    @RequestMapping("submitVote")
    public String submitVote(Integer voteId,
                              VoteCustom voteCustom ) throws Exception {


        voteService.updateVote(voteId, voteCustom);
        return "forward:queryVote";
    }

    @RequestMapping("deleteVote")
    public String deleteVote(@RequestParam(value = "id") Integer id) throws Exception {
        voteService.deleteVote(id);
        return "forward:queryVote.action";
    }


    @RequestMapping("insertVote")
    public String insertVote(HttpServletRequest request)throws Exception{

        VoteCustom voteCustom = new VoteCustom();
        voteCustom.setTitle(request.getParameter("title"));
        voteCustom.setDescription(request.getParameter("description"));
        voteCustom.setOption1(request.getParameter("option1"));
        voteCustom.setOption2(request.getParameter("option2"));
        voteCustom.setOption3(request.getParameter("option3"));
        voteCustom.setOption4(request.getParameter("option4"));


        voteService.insertVote(voteCustom);
        Integer voteId = voteCustom.getVoteId();
        pollService.createPoll(voteId);
        return "forward:queryVote.action";
    }
}
