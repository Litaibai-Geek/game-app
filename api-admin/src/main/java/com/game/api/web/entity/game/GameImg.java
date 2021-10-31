package com.game.api.web.entity.game;

import lombok.Data;

import java.util.Date;

/**
 *
 */
@Data
public class GameImg {
    /**
     *
     */
    private Integer id;
    /**
     * 图片地址
     */
    private String imgUrl;
    /**
     * 图片类型 1：头像  2：截图
     */
    private Integer imgType;
    /**
     * 图片排序
     */
    private Integer sortNum;
    /**
     * 图片描述
     */
    private String imgDesc;
    /**
     * 图片来源地址
     */
    private String imgSourceAddr;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 图片状态 0：禁用  1：启用
     */
    private Integer imgStatus;
}