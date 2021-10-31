package com.game.api.web.service.game;

import com.github.pagehelper.PageInfo;
import com.game.api.web.entity.game.GameSlide;

/**
 *
 */
public interface GameSlideService {

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
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link GameSlide}
     */
    PageInfo<GameSlide> findByPage(GameSlide gameSlide,int pageNum, int pageSize);

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