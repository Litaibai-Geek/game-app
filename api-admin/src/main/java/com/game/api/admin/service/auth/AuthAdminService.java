package com.game.api.admin.service.auth;


import com.game.api.admin.entity.auth.AuthAdmin;
import com.game.api.admin.req.auth.AuthAdminQueryRequest;

import java.util.List;

public interface AuthAdminService {

    List<AuthAdmin> listAdminPage(AuthAdminQueryRequest authAdminQueryRequest);

    AuthAdmin findByUserName(String userName);


    AuthAdmin findById(Long id);


    AuthAdmin findPwdById(Long id);

    boolean insertAuthAdmin(AuthAdmin authAdmin);

    boolean updateAuthAdmin(AuthAdmin authAdmin);

    boolean deleteById(Long id);

}
