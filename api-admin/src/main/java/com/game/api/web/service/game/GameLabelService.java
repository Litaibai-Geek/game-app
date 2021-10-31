package com.game.api.web.service.game;

import com.github.pagehelper.PageInfo;
import com.game.api.web.entity.game.GameLabel;

/**
 *
 */
public interface GameLabelService {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link GameLabel}
     */
    GameLabel findById(Integer id);

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link GameLabel}
     */
    PageInfo<GameLabel> findByPage(int pageNum, int pageSize);

    /**
     * 新增
     *
     * @param gameLabel
     */
    void insert(GameLabel gameLabel);

    /**
     * 修改
     *
     * @param gameLabel
     */
    void update(GameLabel gameLabel);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}