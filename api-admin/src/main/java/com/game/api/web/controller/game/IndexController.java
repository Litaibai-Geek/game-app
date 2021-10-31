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
 * @description: 首页生成
 * @author: 李太白
 * @date: 2021-10-30 17:36
 **/
@RestController
@RequestMapping("/indexPage")
@Api(tags = "")
public class IndexController {

    @Autowired
    private GameTypeService gameTypeService;

    @Autowired
    private GameAppService gameAppService;

    @Autowired
    private GameSlideService gameSlideService;

    @Autowired
    private GameStrategyService gameStrategyService;

    @GetMapping
    @ApiOperation("首页生成")
    public BaseResponse indexPage() {

        try {
            Configuration config = new Configuration();

            String path = "D:\\GitWork\\game-app\\api-admin\\src\\main\\resources\\templates\\ftl";
            TemplateLoader templateLoader = new FileTemplateLoader(new File(path));
            config.setTemplateLoader(templateLoader);

            Template template = config.getTemplate("index.ftl", Locale.SIMPLIFIED_CHINESE);

            IndexVO indexVOs = new IndexVO();

            // 标题
            List<GameType> gameTypeList = gameTypeService.findByPage(1, Integer.MAX_VALUE).getList();
            Map<String,List<GameType>> gameTypeMap = new HashMap<String,List<GameType>>();
            gameTypeMap.put("gameTypeList", gameTypeList);
            indexVOs.setGameTypeList(gameTypeList);

            // 推荐
            GameApp gameApp = new GameApp();
            List<GameApp> gameAppList = gameAppService.findByPage(gameApp,1,10).getList();
            Map<String,List<GameApp>> gameAppMap = new HashMap<String,List<GameApp>>();
            gameAppMap.put("gameAppList",gameAppList);
            indexVOs.setGameAppList(gameAppList);

            // 每日一荐
            GameAppShareVO oneShare = gameAppService.findOneShare();
            Map<String,GameAppShareVO> gameAppShareMap = new HashMap<String,GameAppShareVO>();
            gameAppShareMap.put("gameAppShare",oneShare);
            indexVOs.setGameAppShare(oneShare);

            // 热门
            GameApp gameAppHot = new GameApp();
            gameAppHot.setOrderByStr("down_num desc");
            List<GameApp> gameAppHotList = gameAppService.findByPage(gameAppHot,1,10).getList();
            Map<String,List<GameApp>> gameAppHotMap = new HashMap<String,List<GameApp>>();
            gameAppHotMap.put("gameAppHotList",gameAppHotList);
            indexVOs.setGameAppHotList(gameAppHotList);

            // 点击
            GameApp gameAppClick = new GameApp();
            gameAppClick.setOrderByStr("click_num desc");
            List<GameApp> gameAppClickList = gameAppService.findByPage(gameAppClick,1,10).getList();
            Map<String,List<GameApp>> gameAppClickMap = new HashMap<String,List<GameApp>>();
            gameAppClickMap.put("gameAppClickList",gameAppClickList);
            indexVOs.setGameAppClickList(gameAppClickList);

            // 最新
            GameApp gameAppNew = new GameApp();
            gameAppNew.setOrderByStr("create_time desc");
            List<GameApp> gameAppNewList = gameAppService.findByPage(gameAppNew,1,10).getList();
            Map<String,List<GameApp>> gameAppNewMap = new HashMap<String,List<GameApp>>();
            gameAppNewMap.put("gameAppNewList",gameAppNewList);
            indexVOs.setGameAppNewList(gameAppNewList);

            // 幻灯片
            GameSlide gameSlide = new GameSlide();
            gameSlide.setOrderByStr("sort_num asc");
            List<GameSlide> gameSlideList = gameSlideService.findByPage(gameSlide,1,10).getList();
            Map<String,List<GameSlide>> gameSlideMap = new HashMap<String,List<GameSlide>>();
            gameSlideMap.put("gameSlideList",gameSlideList);
            indexVOs.setGameSlideList(gameSlideList);

            // 手游排行
            GameApp gameAppScore = new GameApp();
            gameAppScore.setOrderByStr("score desc");
            List<GameApp> gameAppScoreList = gameAppService.findByPage(gameAppScore,1,10).getList();
            Map<String,List<GameApp>> gameAppScoreMap = new HashMap<String,List<GameApp>>();
            gameAppScoreMap.put("gameAppScoreList",gameAppScoreList);
            indexVOs.setGameAppScoreList(gameAppScoreList);

            // 手机游戏
            GameApp gameAppMobile = new GameApp();
            List<GameApp> gameAppMobileList = gameAppService.findByPage(gameAppMobile,1,10).getList();
            Map<String,List<GameApp>> gameAppMobileMap = new HashMap<String,List<GameApp>>();
            gameAppMobileMap.put("gameAppMobileList",gameAppMobileList);
            indexVOs.setGameAppMobileList(gameAppMobileList);

            // 手游动态
            GameStrategy gameStrategyNew = new GameStrategy();
            List<GameStrategy> gameStrategyNewList = gameStrategyService.findByPage(gameStrategyNew,1,5).getList();
            Map<String,List<GameStrategy>> gameStrategyNewMap = new HashMap<String,List<GameStrategy>>();
            gameStrategyNewMap.put("gameStrategyNewList",gameStrategyNewList);
            indexVOs.setGameStrategyNewList(gameStrategyNewList);

            // 游戏攻略
            GameStrategy gameStrategy = new GameStrategy();
            List<GameStrategy> gameStrategyList = gameStrategyService.findByPage(gameStrategy,1,5).getList();
            Map<String,List<GameStrategy>> gameStrategyMap = new HashMap<String,List<GameStrategy>>();
            gameStrategyMap.put("gameStrategyList",gameStrategyList);
            indexVOs.setGameStrategyList(gameStrategyList);

            // 最新手游资讯
            GameStrategy gameStrategyInfo = new GameStrategy();
            List<GameStrategy> gameStrategyInfoList = gameStrategyService.findByPage(gameStrategyInfo,1,10).getList();
            Map<String,List<GameStrategy>> gameStrategyInfoMap = new HashMap<String,List<GameStrategy>>();
            gameStrategyInfoMap.put("gameStrategyInfoList",gameStrategyInfoList);
            indexVOs.setGameStrategyInfoList(gameStrategyInfoList);

            // 手游资料
            GameStrategy gameStrategyData = new GameStrategy();
            List<GameStrategy> gameStrategyDataList = gameStrategyService.findByPage(gameStrategyData,1,10).getList();
            Map<String,List<GameStrategy>> gameStrategyDataMap = new HashMap<String,List<GameStrategy>>();
            gameStrategyDataMap.put("gameStrategyDataList",gameStrategyDataList);
            indexVOs.setGameStrategyDataList(gameStrategyDataList);


            FileWriter fileWriter = new FileWriter("D:\\GitWork\\game-app\\api-admin\\src\\main\\resources\\templates\\index.html");
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
