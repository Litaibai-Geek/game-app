package com.game.api.web.entity.game;

import lombok.Data;

import java.util.Date;

/**
 *
 */
@Data
public class GameStrategy {
    /**
     *
     */
    private Integer id;
    /**
     * 标题
     */
    private String strategyTitle;
    /**
     * 正文
     */
    private String strategyText;
    /**
     * 攻略路径
     */
    private String strategyPath;
    /**
     * 封面图
     */
    private String strategyImg;
    /**
     * 发布人
     */
    private String sendUserName;
    /**
     * 浏览量
     */
    private Integer viewsNum;
    /**
     * 留言数量
     */
    private Integer leavMsgNum;
    /**
     * 本文链接
     */
    private String strategyUrl;
    /**
     * 标签id
     */
    private Integer labelId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 状态 0：禁用  1：启用
     */
    private Integer strategyStatus;
}