package com.game.api.web.controller.game;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import com.game.api.web.entity.game.GameLabel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.game.api.web.service.game.GameLabelService;

/**
 *
 */
@RestController
@RequestMapping("/gameLabels")
@Api(tags = "")
public class GameLabelController {
    @Autowired
    private GameLabelService gameLabelService;

    @GetMapping("/{id}")
    @ApiOperation("通过ID查询单个")
    public GameLabel findById(@ApiParam("ID") @PathVariable("id") Integer id) {
        return gameLabelService.findById(id);
    }

    @GetMapping
    @ApiOperation("分页查询")
    public PageInfo<GameLabel> findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                          @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer pageSize) {
        return gameLabelService.findByPage(pageNum, pageSize);
    }

    @PostMapping
    @ApiOperation("新增")
    public void insert(@RequestBody GameLabel gameLabel) {
        gameLabelService.insert(gameLabel);
    }

    @PutMapping
    @ApiOperation("修改")
    public void update(@RequestBody GameLabel gameLabel) {
        gameLabelService.update(gameLabel);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("通过ID删除单个")
    public void deleteById(@ApiParam("ID") @PathVariable("id") Integer id) {
        gameLabelService.deleteById(id);
    }
}
