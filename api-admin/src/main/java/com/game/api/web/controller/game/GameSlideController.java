package com.game.api.web.controller.game;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import com.game.api.web.entity.game.GameSlide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.game.api.web.service.game.GameSlideService;

/**
 *
 */
@RestController
@RequestMapping("/gameSlides")
@Api(tags = "")
public class GameSlideController {
    @Autowired
    private GameSlideService gameSlideService;

    @GetMapping("/{id}")
    @ApiOperation("通过ID查询单个")
    public GameSlide findById(@ApiParam("ID") @PathVariable("id") Integer id) {
        return gameSlideService.findById(id);
    }

    @GetMapping
    @ApiOperation("分页查询")
    public PageInfo<GameSlide> findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                          @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer pageSize) {
        GameSlide gameSlide = new GameSlide();
        return gameSlideService.findByPage(gameSlide,pageNum, pageSize);
    }

    @PostMapping
    @ApiOperation("新增")
    public void insert(@RequestBody GameSlide gameSlide) {
        gameSlideService.insert(gameSlide);
    }

    @PutMapping
    @ApiOperation("修改")
    public void update(@RequestBody GameSlide gameSlide) {
        gameSlideService.update(gameSlide);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("通过ID删除单个")
    public void deleteById(@ApiParam("ID") @PathVariable("id") Integer id) {
        gameSlideService.deleteById(id);
    }
}
