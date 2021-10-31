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

    // 热门手游
    @RequestMapping("/rmsy")
    public String rmsyIndex(){return "/html/rmsy/index";}

    // fps动作
    @RequestMapping("/fpsdz")
    public String fpsdzIndex(){return "/html/fpsdz/index";}

    // 休闲益智
    @RequestMapping("/xxyz")
    public String xxyzIndex(){
        return "/html/xxyz/index";
    }

    // 冒险解密
    @RequestMapping("/mxjm")
    public String mxjmIndex(){
        return "/html/mxjm/index";
    }

    // 模拟经营
    @RequestMapping("/mnjy")
    public String mnjyIndex(){
        return "/html/mnjy/index";
    }

    // 射击飞行
    @RequestMapping("/sjfx")
    public String sjfxIndex(){
        return "/html/sjfx/index";
    }

    // 生成养成
    @RequestMapping("/scyc")
    public String scycIndex(){
        return "/html/scyc/index";
    }

}
