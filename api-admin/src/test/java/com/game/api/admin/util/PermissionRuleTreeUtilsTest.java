package com.game.api.admin.util;

import com.game.api.BaseApiAdminApplicationTest;
import com.game.api.admin.entity.auth.AuthPermissionRule;
import com.game.api.admin.service.auth.AuthPermissionRuleService;
import com.game.api.admin.res.auth.AuthPermissionRuleMergeResponse;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

public class PermissionRuleTreeUtilsTest extends BaseApiAdminApplicationTest {

    @Resource
    private AuthPermissionRuleService authPermissionRuleService;

    @Test
    public void merge() {

        List<AuthPermissionRule> authPermissionRules = authPermissionRuleService.listAll();
        List<AuthPermissionRuleMergeResponse> merge = PermissionRuleTreeUtils.merge(authPermissionRules,0L);
        System.out.println(merge);

    }
}