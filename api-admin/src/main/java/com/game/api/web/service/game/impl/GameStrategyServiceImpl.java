package com.game.api.web.service.game.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.game.api.web.dao.game.GameStrategyDAO;
import com.game.api.web.entity.game.GameStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.game.api.web.service.game.GameStrategyService;

@Service
@Transactional(rollbackFor = Exception.class)
public class GameStrategyServiceImpl implements GameStrategyService {

    @Autowired
    private GameStrategyDAO gameStrategyDAO;

    @Transactional(readOnly = true)
    @Override
    public GameStrategy findById(Integer id) {
        return gameStrategyDAO.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<GameStrategy> findByPage(GameStrategy gameStrategy,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(gameStrategyDAO.findByPage(gameStrategy));
    }

    @Override
    public void insert(GameStrategy gameStrategy) {
        gameStrategyDAO.insert(gameStrategy);
    }

    @Override
    public void update(GameStrategy gameStrategy) {
        gameStrategyDAO.update(gameStrategy);
    }

    @Override
    public void deleteById(Integer id) {
        gameStrategyDAO.deleteById(id);
    }

}