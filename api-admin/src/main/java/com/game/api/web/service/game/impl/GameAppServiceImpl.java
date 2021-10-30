package com.game.api.web.service.game.impl;

import com.game.api.web.dao.game.GameAppDAO;
import com.game.api.web.entity.game.GameApp;
import com.game.api.web.service.game.GameAppService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class GameAppServiceImpl implements GameAppService {

    @Autowired
    private GameAppDAO gameAppDAO;

    @Transactional(readOnly = true)
    @Override
    public GameApp findById(Integer id) {
        return gameAppDAO.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<GameApp> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(gameAppDAO.findByPage());
    }

    @Override
    public void insert(GameApp gameApp) {
        gameAppDAO.insert(gameApp);
    }

    @Override
    public void update(GameApp gameApp) {
        gameAppDAO.update(gameApp);
    }

    @Override
    public void deleteById(Integer id) {
        gameAppDAO.deleteById(id);
    }

}