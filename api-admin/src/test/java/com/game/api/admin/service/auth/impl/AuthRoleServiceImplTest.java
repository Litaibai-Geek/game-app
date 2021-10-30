package com.game.api.admin.service.auth.impl;

import com.game.api.BaseApiAdminApplicationTest;
import com.game.api.admin.entity.auth.AuthRole;
import com.game.api.admin.service.auth.AuthRoleService;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class AuthRoleServiceImplTest  extends BaseApiAdminApplicationTest {

    @Resource
    private AuthRoleService authRoleService;

    @Test
    public void listAdminPage() {
    }

    @Test
    public void listAuthAdminRolePage() {

        Integer page = 1;
        Integer limit = 20;

        List<AuthRole> authRoleList = authRoleService.listAuthAdminRolePage(page, limit, null);
        assertTrue(authRoleList.size() > 0);
    }
}