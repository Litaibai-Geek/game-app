package com.game.api.web.entity.game.vo;

import com.game.api.web.entity.game.GameApp;
import com.game.api.web.entity.game.GameTheme;
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
    List<GameTheme> gameThemeList;

    // 推荐
    List<GameApp> gameAppList;

    // 每日一荐
    List<GameApp> gameAppShareList;


}
