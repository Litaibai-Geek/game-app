package com.game.api.web.controller.game;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import com.game.api.web.entity.game.GameStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.game.api.web.service.game.GameStrategyService;

/**
 *
 */
@RestController
@RequestMapping("/gameStrategys")
@Api(tags = "")
public class GameStrategyController {
    @Autowired
    private GameStrategyService gameStrategyService;

    @GetMapping("/{id}")
    @ApiOperation("通过ID查询单个")
    public GameStrategy findById(@ApiParam("ID") @PathVariable("id") Integer id) {
        return gameStrategyService.findById(id);
    }

    @GetMapping
    @ApiOperation("分页查询")
    public PageInfo<GameStrategy> findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                             @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer pageSize) {
        GameStrategy gameStrategy = new GameStrategy();
        return gameStrategyService.findByPage(gameStrategy,pageNum, pageSize);
    }

    @PostMapping
    @ApiOperation("新增")
    public void insert(@RequestBody GameStrategy gameStrategy) {
        gameStrategyService.insert(gameStrategy);
    }

    @PutMapping
    @ApiOperation("修改")
    public void update(@RequestBody GameStrategy gameStrategy) {
        gameStrategyService.update(gameStrategy);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("通过ID删除单个")
    public void deleteById(@ApiParam("ID") @PathVariable("id") Integer id) {
        gameStrategyService.deleteById(id);
    }
}
