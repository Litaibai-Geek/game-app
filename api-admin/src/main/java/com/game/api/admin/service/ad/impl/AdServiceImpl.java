package com.game.api.admin.service.ad.impl;

import com.game.api.admin.req.ad.AdQueryRequest;
import com.github.pagehelper.PageHelper;
import com.game.api.admin.dao.ad.AdDao;
import com.game.api.admin.entity.ad.Ad;
import com.game.api.admin.service.ad.AdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class AdServiceImpl implements AdService {

    @Resource
    private AdDao adDao;

    @Override
    public List<Ad> listAdminPage(AdQueryRequest adQueryRequest) {
        if (adQueryRequest == null) {
            return Collections.emptyList();
        }
        int offset = (adQueryRequest.getPage() - 1) * adQueryRequest.getLimit();
        PageHelper.offsetPage(offset, adQueryRequest.getLimit());
        return adDao.listAdmin(adQueryRequest);
    }

    @Override
    public List<Ad> listAdminByAdIdsIn(List<Long> adIds) {
        return adDao.listAdminByAdIdsIn(adIds);
    }

    @Override
    public boolean insertAd(Ad ad) {
        return adDao.insertAd(ad);
    }

    @Override
    public boolean updateAd(Ad ad) {
        return adDao.updateAd(ad);
    }

    @Override
    public boolean deleteByAdId(Long adId) {
        return adDao.deleteByAdId(adId);
    }
}
