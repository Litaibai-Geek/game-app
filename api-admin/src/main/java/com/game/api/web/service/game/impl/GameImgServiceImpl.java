package com.game.api.web.service.game.impl;

import com.game.api.web.dao.game.GameImgDAO;
import com.game.api.web.entity.game.GameImg;
import com.game.api.web.service.game.GameImgService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class GameImgServiceImpl implements GameImgService {

    @Autowired
    private GameImgDAO gameImgDAO;

    @Transactional(readOnly = true)
    @Override
    public GameImg findById(Integer id) {
        return gameImgDAO.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<GameImg> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(gameImgDAO.findByPage());
    }

    @Override
    public void insert(GameImg gameImg) {
        gameImgDAO.insert(gameImg);
    }

    @Override
    public void update(GameImg gameImg) {
        gameImgDAO.update(gameImg);
    }

    @Override
    public void deleteById(Integer id) {
        gameImgDAO.deleteById(id);
    }

}