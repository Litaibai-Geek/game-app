package com.game.api.web.dao.game;

import com.game.api.web.entity.game.GameTheme;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 */
@Mapper
public interface GameThemeDAO {

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
     * @return {@link GameTheme}
     */
    Page<GameTheme> findByPage();

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