package com.ssm.controller;

import com.ssm.po.CommentsCustom;
import com.ssm.po.Lecture;
import com.ssm.po.Student;
import com.ssm.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @date 2019-04-06-21-45
 */

@Controller
@RequestMapping("comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping("queryAllComment")
    public @ResponseBody
    List<CommentsCustom> queryAllComment(@RequestParam(value = "classid")Integer classid) throws Exception {
        List<CommentsCustom> commentList = commentService.queryCommentByClassid(classid);
        for(CommentsCustom com:commentList){
            System.out.println(com);
        }
        return commentList;
    }


    @RequestMapping("queryAllCommentByVoteid")
    public @ResponseBody
    List<CommentsCustom> queryAllCommentByVoteid(@RequestParam(value = "voteid")Integer voteid) throws Exception {
        List<CommentsCustom> commentList = commentService.queryCommentByVoteid(voteid);
        return commentList;
    }


    @RequestMapping("insertComment")
    public String insertComment(CommentsCustom commentsCustom, HttpSession session,@RequestParam(value = "classid")Integer classid) throws Exception {

        //just to get id ,not just student or lecture
        Integer status = (Integer)session.getAttribute("admin");
        if(status == 0) {
            Student student = (Student) session.getAttribute("user");
            commentsCustom.setUsername(student.getUsername());
        }else{
            Lecture lecture = (Lecture) session.getAttribute("user");
            commentsCustom.setUsername(lecture.getUsername());
        }

        //        request.getParameter("")
        commentService.insertComment(commentsCustom);
        return "redirect:/course/queryOneCourse.action?id="+classid;
    }

    @RequestMapping("deleteComment")
    public String deleteComment(@RequestParam(value = "commentid")Integer commentid,@RequestParam(value = "classid")Integer classid){
        try {
            commentService.deleteComment(commentid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/course/queryOneCourse.action?id="+classid;
    }
}
