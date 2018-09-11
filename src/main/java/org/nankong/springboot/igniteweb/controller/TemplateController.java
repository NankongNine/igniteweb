package org.nankong.springboot.igniteweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/template")
public class TemplateController {
    //templates的展示
    @RequestMapping(value = {"/t","/temp","/template"} ,method = RequestMethod.GET)
    public String showIndexHtml(){
        return "index";
    }


}
