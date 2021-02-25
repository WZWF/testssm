package com.czc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {
    private static Logger log = LoggerFactory.getLogger(HomeController.class.getName());

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home(){
        log.info("进入了首页！");
        return "redirect:index.jsp";
    }

}
