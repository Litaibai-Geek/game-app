package com.game.api.admin.service.auth;

import java.util.List;

public interface AuthLoginService {

    List<String> listRuleByAdminId(Long adminId);

}
