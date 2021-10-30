package com.game.api.web.dao.game;

import com.game.api.web.entity.game.GameApp;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 */
@Mapper
public interface GameAppDAO {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link GameApp}
     */
    GameApp findById(Integer id);

    /**
     * 分页查询
     *
     * @return {@link GameApp}
     */
    Page<GameApp> findByPage();

    /**
     * 新增
     *
     * @param gameApp
     */
    void insert(GameApp gameApp);

    /**
     * 修改
     *
     * @param gameApp
     */
    void update(GameApp gameApp);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}