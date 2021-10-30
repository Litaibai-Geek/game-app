package com.game.api.web.service.game;

import com.game.api.web.entity.game.GameTheme;
import com.github.pagehelper.PageInfo;

/**
 *
 */
public interface GameThemeService {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link GameTheme}
     */
    GameTheme findById(Integer id);

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link GameTheme}
     */
    PageInfo<GameTheme> findByPage(int pageNum, int pageSize);

    /**
     * 新增
     *
     * @param gameTheme
     */
    void insert(GameTheme gameTheme);

    /**
     * 修改
     *
     * @param gameTheme
     */
    void update(GameTheme gameTheme);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}