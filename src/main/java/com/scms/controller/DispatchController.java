package com.scms.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by xieding001 on 2017/8/30.
 */
@Controller
public class DispatchController {

    @RequestMapping("/")
    public String index1() {
        return "index";
    }

    @RequestMapping("/channelMgr")
    public String channelMgr() {
        return "panel/content/channelMgr";
    }

    @RequestMapping("/contentMgr")
    public String contentMgr() {
        return "panel/contentMgr";
    }
}
