package com.game.api.web.entity.game;

import com.game.api.common.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 *
 */
@Data
public class GameSlide extends BaseEntity {
    /**
     *
     */
    private Integer id;
    /**
     * 幻灯片名称
     */
    private String slideName;
    /**
     * 幻灯片跳转路径
     */
    private String slidePath;
    /**
     * 幻灯片图片路径
     */
    private String imgPath;
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
     * 图片状态 0：禁用  1：启用
     */
    private Integer slideStatus;
}