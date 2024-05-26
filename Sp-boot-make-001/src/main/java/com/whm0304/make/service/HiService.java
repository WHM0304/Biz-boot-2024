package com.whm0304.make.service;

import com.whm0304.make.dao.HiDao;
import com.whm0304.make.models.HiVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HiService {

    private final HiDao hiDao;

    public HiService(HiDao hiDao) {
        this.hiDao = hiDao;
    }


    public List<HiVO> selectAll(){
        return hiDao.findAll();
    }

    public HiVO createHi(HiVO hiVO){
        return hiDao.save(hiVO);
    }

}
