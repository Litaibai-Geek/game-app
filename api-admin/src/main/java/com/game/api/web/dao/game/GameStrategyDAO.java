package com.game.api.web.dao.game;

import com.github.pagehelper.Page;
import com.game.api.web.entity.game.GameStrategy;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 *
 */
@Mapper
public interface GameStrategyDAO {

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
     * @return {@link GameStrategy}
     */
    Page<GameStrategy> findByPage(@Param("e")GameStrategy gameStrategy);

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