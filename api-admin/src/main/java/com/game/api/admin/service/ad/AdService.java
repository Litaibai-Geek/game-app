package com.game.api.admin.service.ad;


import com.game.api.admin.req.ad.AdQueryRequest;
import com.game.api.admin.entity.ad.Ad;

import java.util.List;

public interface AdService {

    List<Ad> listAdminPage(AdQueryRequest adQueryRequest);

    List<Ad> listAdminByAdIdsIn(List<Long> adIds);

    boolean insertAd(Ad ad);

    boolean updateAd(Ad ad);

    boolean deleteByAdId(Long id);

}
