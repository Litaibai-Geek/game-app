package com.game.api.web.dao.game;

import com.game.api.web.entity.game.GameImg;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 */
@Mapper
public interface GameImgDAO {

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
     * @return {@link GameImg}
     */
    Page<GameImg> findByPage();

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