package com.game.api.web.service.game;

import com.game.api.web.entity.game.GameType;
import com.github.pagehelper.PageInfo;

/**
 *
 */
public interface GameTypeService {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link GameType}
     */
    GameType findById(Integer id);

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link GameType}
     */
    PageInfo<GameType> findByPage(int pageNum, int pageSize);

    /**
     * 新增
     *
     * @param gameTheme
     */
    void insert(GameType gameTheme);

    /**
     * 修改
     *
     * @param gameTheme
     */
    void update(GameType gameTheme);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}