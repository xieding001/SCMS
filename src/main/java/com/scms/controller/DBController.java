package com.scms.controller;

import com.scms.model.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xieding001 on 2017/8/28.
 */

@Controller
public class DBController {


    @RequestMapping("/channel")
    public @ResponseBody
    String saveChannel(Channel c){
        System.out.println(c.getSiteID());
        System.out.println(c.getChannelName());

        return null;
    }
}
