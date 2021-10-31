package com.game.api.web.entity.game.vo;

import com.game.api.web.entity.game.GameApp;
import com.game.api.web.entity.game.GameSlide;
import com.game.api.web.entity.game.GameStrategy;
import com.game.api.web.entity.game.GameType;
import lombok.Data;

import java.util.List;

/**
 * @description: 生成静态文件VO类
 * @author: 李太白
 * @date: 2021-10-30 20:37
 **/
@Data
public class IndexVO {


    // 标题
    List<GameType> gameTypeList;

    // 推荐
    List<GameApp> gameAppList;

    // 每日一荐
    GameAppShareVO gameAppShare;

    // 热门
    List<GameApp> gameAppHotList;

    // 点击
    List<GameApp> gameAppClickList;

    // 最新
    List<GameApp> gameAppNewList;

    // 幻灯片
    List<GameSlide> gameSlideList;

    // 手游排行
    List<GameApp> gameAppScoreList;

    // 手机游戏
    List<GameApp> gameAppMobileList;

    // 手游动态
    List<GameStrategy> gameStrategyNewList;

    // 手游攻略
    List<GameStrategy> gameStrategyList;

    // 最新手游资讯
    List<GameStrategy> gameStrategyInfoList;

    // 手游资料
    List<GameStrategy> gameStrategyDataList;


}
