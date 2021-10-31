package com.game.api.web.service.game.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.game.api.web.dao.game.GameLabelDAO;
import com.game.api.web.entity.game.GameLabel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.game.api.web.service.game.GameLabelService;

@Service
@Transactional(rollbackFor = Exception.class)
public class GameLabelServiceImpl implements GameLabelService {

    @Autowired
    private GameLabelDAO gameLabelDAO;

    @Transactional(readOnly = true)
    @Override
    public GameLabel findById(Integer id) {
        return gameLabelDAO.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<GameLabel> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(gameLabelDAO.findByPage());
    }

    @Override
    public void insert(GameLabel gameLabel) {
        gameLabelDAO.insert(gameLabel);
    }

    @Override
    public void update(GameLabel gameLabel) {
        gameLabelDAO.update(gameLabel);
    }

    @Override
    public void deleteById(Integer id) {
        gameLabelDAO.deleteById(id);
    }

}