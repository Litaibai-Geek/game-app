package com.game.api.web.controller.game;

import com.game.api.HelloWorldMainApplication;
import com.game.api.common.res.BaseResponse;
import com.game.api.common.util.ResultVOUtils;
import com.game.api.web.entity.game.GameApp;
import com.game.api.web.entity.game.GameTheme;
import com.game.api.web.entity.game.vo.IndexVO;
import com.game.api.web.service.game.GameAppService;
import com.game.api.web.service.game.GameThemeService;
import com.game.api.web.service.game.GameTypeService;
import com.github.pagehelper.PageInfo;
import freemarker.cache.FileTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * @description:
 * @author: 李太白
 * @date: 2021-10-30 17:36
 **/
@RestController
@RequestMapping("/indexPage")
@Api(tags = "")
public class IndexController {

    @Autowired
    private GameThemeService gameThemeService;

    @Autowired
    private GameAppService gameAppService;

    @GetMapping
    @ApiOperation("首页生成")
    public BaseResponse indexPage() {

        try {
            Configuration config = new Configuration();

            String path = "D:\\GitWork\\vue-admin-java\\api-admin\\src\\main\\resources\\templates\\ftl";
            TemplateLoader templateLoader = new FileTemplateLoader(new File(path));
            config.setTemplateLoader(templateLoader);

            Template template = config.getTemplate("index.ftl", Locale.SIMPLIFIED_CHINESE);

            IndexVO indexVOs = new IndexVO();

            // 标题
            List<GameTheme> gameThemeList = gameThemeService.findByPage(1, Integer.MAX_VALUE).getList();
            Map<String,List<GameTheme>> gameThemeMap = new HashMap<String,List<GameTheme>>();
            gameThemeMap.put("gameThemeList", gameThemeList);
            indexVOs.setGameThemeList(gameThemeList);

            // 推荐
            List<GameApp> gameAppList = gameAppService.findByPage(1,10).getList();
            Map<String,List<GameApp>> gameAppMap = new HashMap<String,List<GameApp>>();
            gameAppMap.put("gameAppList",gameAppList);
            indexVOs.setGameAppList(gameAppList);

            // 每日一荐
            List<GameApp> gameAppShareList = gameAppService.findByPage(1,1).getList();
            Map<String,List<GameApp>> gameAppShareMap = new HashMap<String,List<GameApp>>();
            gameAppShareMap.put("gameAppShareList",gameAppShareList);
            indexVOs.setGameAppList(gameAppList);

            FileWriter fileWriter = new FileWriter("D:\\GitWork\\vue-admin-java\\api-admin\\src\\main\\resources\\templates\\index.html");
            template.process(indexVOs, fileWriter);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return ResultVOUtils.success();
    }


}
