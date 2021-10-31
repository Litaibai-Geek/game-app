package com.game.api.web.service.game.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.game.api.web.dao.game.GameSlideDAO;
import com.game.api.web.entity.game.GameSlide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.game.api.web.service.game.GameSlideService;

@Service
@Transactional(rollbackFor = Exception.class)
public class GameSlideServiceImpl implements GameSlideService {

    @Autowired
    private GameSlideDAO gameSlideDAO;

    @Transactional(readOnly = true)
    @Override
    public GameSlide findById(Integer id) {
        return gameSlideDAO.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<GameSlide> findByPage(GameSlide gameSlide,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(gameSlideDAO.findByPage(gameSlide));
    }

    @Override
    public void insert(GameSlide gameSlide) {
        gameSlideDAO.insert(gameSlide);
    }

    @Override
    public void update(GameSlide gameSlide) {
        gameSlideDAO.update(gameSlide);
    }

    @Override
    public void deleteById(Integer id) {
        gameSlideDAO.deleteById(id);
    }

}