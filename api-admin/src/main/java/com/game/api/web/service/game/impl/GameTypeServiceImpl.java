package com.game.api.web.service.game.impl;

import com.game.api.web.dao.game.GameTypeDAO;
import com.game.api.web.entity.game.GameType;
import com.game.api.web.service.game.GameTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class GameTypeServiceImpl implements GameTypeService {

    @Autowired
    private GameTypeDAO gameTypeDAO;

    @Transactional(readOnly = true)
    @Override
    public GameType findById(Integer id) {
        return gameTypeDAO.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<GameType> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(gameTypeDAO.findByPage());
    }

    @Override
    public void insert(GameType gameType) {
        gameTypeDAO.insert(gameType);
    }

    @Override
    public void update(GameType gameType) {
        gameTypeDAO.update(gameType);
    }

    @Override
    public void deleteById(Integer id) {
        gameTypeDAO.deleteById(id);
    }

}