package com.game.api.web.entity.game;

import lombok.Data;

import java.util.Date;

/**
 *
 */
@Data
public class GameTheme {
    /**
     *
     */
    private Integer id;
    /**
     * 主题名称
     */
    private String themeName;
    /**
     * 路径
     */
    private String path;
    /**
     * 排序
     */
    private Integer sortNum;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 主题状态 0：禁用  1：启用
     */
    private Integer status;
}