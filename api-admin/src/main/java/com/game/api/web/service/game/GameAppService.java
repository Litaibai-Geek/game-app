package com.game.api.web.service.game;

import com.game.api.web.entity.game.GameApp;
import com.game.api.web.entity.game.vo.GameAppShareVO;
import com.github.pagehelper.PageInfo;

/**
 *
 */
public interface GameAppService {

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
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link GameApp}
     */
    PageInfo<GameApp> findByPage(GameApp gameApp,int pageNum, int pageSize);

    PageInfo<GameApp> findByList(GameApp gameApp,int pageNum, int pageSize);

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

    /**
     * 每日一荐
     */
    GameAppShareVO findOneShare();

}