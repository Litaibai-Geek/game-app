package com.game.api.web.service.game;

import com.github.pagehelper.PageInfo;
import com.game.api.web.entity.game.GameStrategy;

/**
 *
 */
public interface GameStrategyService {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link GameStrategy}
     */
    GameStrategy findById(Integer id);

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link GameStrategy}
     */
    PageInfo<GameStrategy> findByPage(GameStrategy gameStrategy,int pageNum, int pageSize);

    /**
     * 新增
     *
     * @param gameStrategy
     */
    void insert(GameStrategy gameStrategy);

    /**
     * 修改
     *
     * @param gameStrategy
     */
    void update(GameStrategy gameStrategy);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}