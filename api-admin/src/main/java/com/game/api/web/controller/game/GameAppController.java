package com.game.api.web.controller.game;

import com.game.api.common.enums.ResultEnum;
import com.game.api.common.res.BaseResponse;
import com.game.api.common.util.ResultVOUtils;
import com.game.api.web.entity.game.GameApp;
import com.game.api.web.service.game.GameAppService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/gameApps")
@Api(tags = "")
public class GameAppController {
    @Autowired
    private GameAppService gameAppService;

    @GetMapping("/{id}")
    @ApiOperation("通过ID查询单个")
    public BaseResponse findById(@ApiParam("ID") @PathVariable("id") Integer id) {
        return ResultVOUtils.success(gameAppService.findById(id));
    }

    @GetMapping
    @ApiOperation("分页查询")
    public BaseResponse findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                        @ApiParam("每页大小") @RequestParam(defaultValue = "10") Integer pageSize) {
        GameApp gameApp = new GameApp();
        gameApp.setOrderByStr("score desc");
        return ResultVOUtils.success(gameAppService.findByPage(gameApp,pageNum, pageSize));
    }

    @PostMapping
    @ApiOperation("新增")
    public BaseResponse insert(@RequestBody GameApp gameApp) {
        gameAppService.insert(gameApp);
        return ResultVOUtils.success();
    }

    @PutMapping
    @ApiOperation("修改")
    public BaseResponse update(@RequestBody GameApp gameApp) {
        gameAppService.update(gameApp);
        return ResultVOUtils.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation("通过ID删除单个")
    public BaseResponse deleteById(@ApiParam("ID") @PathVariable("id") Integer id) {
        gameAppService.deleteById(id);
        return ResultVOUtils.success();
    }
}
