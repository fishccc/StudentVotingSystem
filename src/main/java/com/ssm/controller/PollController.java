package com.ssm.controller;

import com.ssm.po.Poll;
import com.ssm.po.Vote;
import com.ssm.service.PollService;
import com.ssm.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @date 2019-04-07-21-09
 */

@Controller
@RequestMapping("poll")
public class PollController {

    @Autowired
    private PollService pollService;
    @Autowired
    private VoteService voteService;

    @RequestMapping("insertPoll")
    public String insertPoll( HttpServletRequest request) throws Exception{
        Poll poll = new Poll();
        poll.setVoteId(Integer.parseInt(request.getParameter("voteid")));
        String option=request.getParameter("optionsRadios");
        if(option.equals("option1")){
            poll.setOption1Num(1);
        }else if(option.equals("option2")){
            poll.setOption2Num(1);
        }else if(option.equals("option3")){
            poll.setOption3Num(1);
        }else{
            poll.setOption4Num(1);
        }
        pollService.insertPoll(poll);
        return "redirect:showPoll.action?voteid="+poll.getVoteId();
    }

    @RequestMapping("showPoll")
    public ModelAndView showPoll(@RequestParam(value = "voteid")Integer voteid)throws Exception{
        ModelAndView modelAndView =new ModelAndView();
        Poll poll = pollService.selectPoll(voteid);
        Vote vote =voteService.queryOneVote(voteid);
        modelAndView.addObject("poll",poll);
        modelAndView.addObject("vote",vote);
        modelAndView.setViewName("/vote/infoPoll");
        return modelAndView;
    }
}
