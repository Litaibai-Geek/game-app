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
     * 类型名称
     */
    private String typeName;
    /**
     * 路径
     */
    private String typePath;
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
    private Integer typeStatus;
}