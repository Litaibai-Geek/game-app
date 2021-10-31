package com.game.api.web.dao.game;

import com.github.pagehelper.Page;
import com.game.api.web.entity.game.GameSlide;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 *
 */
@Mapper
public interface GameSlideDAO {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link GameSlide}
     */
    GameSlide findById(Integer id);

    /**
     * 分页查询
     *
     * @return {@link GameSlide}
     */
    Page<GameSlide> findByPage(@Param("e") GameSlide gameSlide);

    /**
     * 新增
     *
     * @param gameSlide
     */
    void insert(GameSlide gameSlide);

    /**
     * 修改
     *
     * @param gameSlide
     */
    void update(GameSlide gameSlide);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}