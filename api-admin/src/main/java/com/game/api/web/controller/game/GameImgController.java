package com.game.api.web.controller.game;

import com.game.api.common.res.BaseResponse;
import com.game.api.common.util.ResultVOUtils;
import com.game.api.web.entity.game.GameImg;
import com.game.api.web.service.game.GameImgService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequestMapping("/gameImgs")
@Api(tags = "")
public class GameImgController {
    @Autowired
    private GameImgService gameImgService;

    @GetMapping("/{id}")
    @ApiOperation("通过ID查询单个")
    public BaseResponse findById(@ApiParam("ID") @PathVariable("id") Integer id) {
        return ResultVOUtils.success(gameImgService.findById(id));
    }

    @GetMapping
    @ApiOperation("分页查询")
    public BaseResponse findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                        @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer pageSize) {
       return ResultVOUtils.success(gameImgService.findByPage(pageNum, pageSize));
    }

    @PostMapping
    @ApiOperation("新增")
    public BaseResponse insert(@RequestBody GameImg gameImg) {
        gameImgService.insert(gameImg);
        return ResultVOUtils.success();
    }

    @PutMapping
    @ApiOperation("修改")
    public BaseResponse update(@RequestBody GameImg gameImg) {
        gameImgService.update(gameImg);
        return ResultVOUtils.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation("通过ID删除单个")
    public BaseResponse deleteById(@ApiParam("ID") @PathVariable("id") Integer id) {
        gameImgService.deleteById(id);
        return ResultVOUtils.success();
    }
}
