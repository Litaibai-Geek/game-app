package com.game.api.admin.service.auth;


import com.game.api.admin.entity.auth.AuthRole;
import com.game.api.admin.req.auth.AuthRoleQueryRequest;

import java.util.List;

public interface AuthRoleService {

    List<AuthRole> listAdminPage(AuthRoleQueryRequest authRoleQueryRequest);

    List<AuthRole> listAuthAdminRolePage(Integer page, Integer limit, Integer status);

    AuthRole findByName(String name);

    boolean insertAuthRole(AuthRole authRole);

    boolean updateAuthRole(AuthRole authRole);

    boolean deleteById(Long id);

}
