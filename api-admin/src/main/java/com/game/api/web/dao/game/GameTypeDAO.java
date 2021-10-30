package com.game.api.web.dao.game;

import com.game.api.web.entity.game.GameType;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 */
@Mapper
public interface GameTypeDAO {

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
     * @return {@link GameType}
     */
    Page<GameType> findByPage();

    /**
     * 新增
     *
     * @param gameType
     */
    void insert(GameType gameType);

    /**
     * 修改
     *
     * @param gameType
     */
    void update(GameType gameType);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}