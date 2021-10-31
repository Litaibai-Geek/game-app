package com.game.api.web.entity.game;

import lombok.Data;

import java.util.Date;

/**
 *
 */
@Data
public class GameLabel {
    /**
     *
     */
    private Integer id;
    /**
     * 标签名称
     */
    private String labelName;
    /**
     * 标签类型：1：app  2：攻略
     */
    private Integer labelType;
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
    private Integer labelStatus;
}