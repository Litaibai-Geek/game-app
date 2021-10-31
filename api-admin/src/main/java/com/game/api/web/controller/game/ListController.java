package com.game.api.web.controller.game;

import com.game.api.common.res.BaseResponse;
import com.game.api.common.util.ResultVOUtils;
import com.game.api.web.entity.game.GameApp;
import com.game.api.web.entity.game.GameSlide;
import com.game.api.web.entity.game.GameStrategy;
import com.game.api.web.entity.game.GameType;
import com.game.api.web.entity.game.vo.GameAppShareVO;
import com.game.api.web.entity.game.vo.IndexVO;
import com.game.api.web.service.game.GameAppService;
import com.game.api.web.service.game.GameSlideService;
import com.game.api.web.service.game.GameStrategyService;
import com.game.api.web.service.game.GameTypeService;
import com.github.pagehelper.PageInfo;
import freemarker.cache.FileTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * @description: 列表页生成
 * @author: 李太白
 * @date: 2021-10-31 23:11
 **/
@RestController
@RequestMapping("/listPage")
@Api(tags = "")
public class ListController {

    @Autowired
    private GameTypeService gameTypeService;

    @Autowired
    private GameAppService gameAppService;

    @Autowired
    private GameSlideService gameSlideService;

    @Autowired
    private GameStrategyService gameStrategyService;

    @GetMapping
    @ApiOperation("列表页生成")
    public BaseResponse ListPage() {

        List<GameType> gameTypeList = gameTypeService.findByPage(1, Integer.MAX_VALUE).getList();
        for (GameType gameType : gameTypeList) {
            String typeName = gameType.getTypeName().replace("/", "");
            try {
                Configuration config = new Configuration();

                String path = "D:\\GitWork\\game-app\\api-admin\\src\\main\\resources\\templates\\ftl\\"+typeName;
                TemplateLoader templateLoader = new FileTemplateLoader(new File(path));
                config.setTemplateLoader(templateLoader);

                Template template = config.getTemplate("index.ftl", Locale.SIMPLIFIED_CHINESE);

                IndexVO indexVOs = new IndexVO();

                // 推荐
                GameApp gameApp = new GameApp();
                List<GameApp> gameAppList = gameAppService.findByPage(gameApp,1,10).getList();
                Map<String,List<GameApp>> gameAppMap = new HashMap<String,List<GameApp>>();
                gameAppMap.put("gameAppList",gameAppList);
                indexVOs.setGameAppList(gameAppList);




                FileWriter fileWriter = new FileWriter("D:\\GitWork\\game-app\\api-admin\\src\\main\\resources\\templates\\index.html");
                template.process(indexVOs, fileWriter);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (TemplateException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }



        return ResultVOUtils.success();

    }

}