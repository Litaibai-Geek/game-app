package com.game.api.admin.service.ad;


import com.game.api.admin.req.ad.AdSiteQueryRequest;
import com.game.api.admin.entity.ad.AdSite;
import com.game.api.admin.res.ad.AdSimpleResponse;

import java.util.List;

public interface AdSiteService {

    List<AdSite> listAdminPage(AdSiteQueryRequest adSiteQueryRequest);

    List<AdSimpleResponse> listAdminByAdIdsIn(List<Long> adIds);

    boolean insertAdSite(AdSite adSite);

    boolean updateAdSite(AdSite adSite);

    boolean deleteBySiteId(Long siteId);

}
