package com.game.api.web.service.game.impl;

import com.game.api.web.dao.game.GameThemeDAO;
import com.game.api.web.entity.game.GameTheme;
import com.game.api.web.service.game.GameThemeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class GameThemeServiceImpl implements GameThemeService {

    @Autowired
    private GameThemeDAO gameThemeDAO;

    @Transactional(readOnly = true)
    @Override
    public GameTheme findById(Integer id) {
        return gameThemeDAO.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public PageInfo<GameTheme> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(gameThemeDAO.findByPage());
    }

    @Override
    public void insert(GameTheme gameTheme) {
        gameThemeDAO.insert(gameTheme);
    }

    @Override
    public void update(GameTheme gameTheme) {
        gameThemeDAO.update(gameTheme);
    }

    @Override
    public void deleteById(Integer id) {
        gameThemeDAO.deleteById(id);
    }

}