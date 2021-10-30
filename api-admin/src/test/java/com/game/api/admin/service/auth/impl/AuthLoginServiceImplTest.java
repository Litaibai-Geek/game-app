package com.game.api.admin.service.auth.impl;

import com.game.api.BaseApiAdminApplicationTest;
import com.game.api.admin.service.auth.AuthLoginService;
import org.junit.Test;

import javax.annotation.Resource;


import java.util.List;

public class AuthLoginServiceImplTest extends BaseApiAdminApplicationTest {

    @Resource
    private AuthLoginService authLoginService;

    @Test
    public void listRuleByAdminId() {

        Long adminId = 2L;

        List<String> strings = authLoginService.listRuleByAdminId(adminId);


    }
}