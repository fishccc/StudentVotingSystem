package com.ssm.controller;

import com.ssm.po.VoteCustom;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @date 2019-04-03-11-16
 */
@Controller
public class RequestJsonController {

    @RequestMapping("requestJson")
    public @ResponseBody
    VoteCustom requestJson(@RequestBody VoteCustom voteCustom) {
        return voteCustom;
    }

    @RequestMapping("responseJson")
    public @ResponseBody
    VoteCustom responseJson(VoteCustom voteCustom) {
        return voteCustom;
    }
}
