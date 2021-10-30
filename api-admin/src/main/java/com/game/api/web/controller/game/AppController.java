package com.game.api.web.controller.game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 全局跳转控制器
 * @author: 李太白
 * @date: 2021-10-30 19:26
 **/
@Controller
public class AppController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }


    @RequestMapping("/html/sjyx/index")
    public String sjyxIndex(){
        return "/html/sjyx/index";
    }

}
