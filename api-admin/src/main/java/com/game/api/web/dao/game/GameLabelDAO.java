package com.game.api.web.dao.game;

import com.github.pagehelper.Page;
import com.game.api.web.entity.game.GameLabel;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 */
@Mapper
public interface GameLabelDAO {

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
     * @return {@link GameLabel}
     */
    Page<GameLabel> findByPage();

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