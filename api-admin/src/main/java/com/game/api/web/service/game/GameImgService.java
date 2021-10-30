package com.game.api.web.service.game;

import com.game.api.web.entity.game.GameImg;
import com.github.pagehelper.PageInfo;

/**
 *
 */
public interface GameImgService {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link GameImg}
     */
    GameImg findById(Integer id);

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link GameImg}
     */
    PageInfo<GameImg> findByPage(int pageNum, int pageSize);

    /**
     * 新增
     *
     * @param gameImg
     */
    void insert(GameImg gameImg);

    /**
     * 修改
     *
     * @param gameImg
     */
    void update(GameImg gameImg);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}