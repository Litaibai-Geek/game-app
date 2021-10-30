package com.game.api.web.entity.game;

import lombok.Data;

import java.util.Date;

/**
 *
 */
@Data
public class GameApp {
    /**
     *
     */
    private Integer id;
    /**
     * app名称
     */
    private String appName;
    /**
     * app图片
     */
    private String appImg;
    /**
     * app路径
     */
    private String path;
    /**
     * 描述
     */
    private String details;
    /**
     * 支持平台
     */
    private String platform;
    /**
     * app类型id
     */
    private Integer typeId;
    /**
     * 大小
     */
    private String size;
    /**
     * 版本
     */
    private String version;
    /**
     * 评分
     */
    private String score;
    /**
     * 语言
     */
    private String language;
    /**
     * 下载量
     */
    private Integer downNum;
    /**
     * 发布时间
     */
    private Date releaseDate;
    /**
     * 安卓下载链接
     */
    private String androidUrl;
    /**
     * ios下载链接
     */
    private String iosUrl;
    /**
     * 二维码下载地址
     */
    private String qrUrl;
    /**
     * 来源
     */
    private String sourceName;
    /**
     * 来源地址
     */
    private String sourceUrl;
    /**
     * 阅读量
     */
    private Integer readNum;
    /**
     * 点击量
     */
    private Integer clickNum;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * app状态 0：禁用  1：启用
     */
    private Integer status;
}