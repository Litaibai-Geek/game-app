package com.game.api.admin.controller;

import com.game.api.common.res.BaseResponse;
import com.game.api.common.util.ResultVOUtils;
import com.game.api.admin.service.auth.AuthAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private AuthAdminService authAdminService;

    @GetMapping("/hello")
    public BaseResponse hello(
            @RequestParam(value = "offset") Integer offset
            , @RequestParam("offset") Integer limit
    ) {
        return ResultVOUtils.error(1, "ssss");
    }

}
