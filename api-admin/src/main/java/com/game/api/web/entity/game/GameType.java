package com.game.api.web.entity.game;

import lombok.Data;

import java.util.Date;

/**
 *
 */
@Data
public class GameType {
    /**
     *
     */
    private Integer id;
    /**
     * 游戏类型名称
     */
    private String typeName;
    /**
     * 排序
     */
    private Integer sortNum;
    /**
     * 主题id
     */
    private Integer themeId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 游戏类型状态 0：禁用  1：启用
     */
    private String status;
}