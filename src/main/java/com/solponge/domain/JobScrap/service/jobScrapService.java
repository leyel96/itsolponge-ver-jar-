package com.solponge.domain.JobScrap.service;

import com.solponge.domain.JobScrap.InfScrapRepository;
import com.solponge.domain.JobScrap.companyScrapRepository;
import com.solponge.domain.JobScrap.InfScrapVO;
import com.solponge.domain.JobScrap.companyScrapVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class jobScrapService {

    @Autowired
    private InfScrapRepository infscraprepository;
    @Autowired
    private companyScrapRepository companyscraprepository;

    public List<InfScrapVO> infosearchAll(Long MEMBER_NO) {
        return infscraprepository.findAllById(Collections.singleton(MEMBER_NO));
    }
    public List<companyScrapVO> companysearchAll(Long MEMBER_NO) {
        return companyscraprepository.findAllById(Collections.singleton(MEMBER_NO));
    }
    public void insert_scrap_info(InfScrapVO infscrapvO) {
        System.out.println("insert_scrap_info");
        infscraprepository.save(InfScrapVO.builder().MEMBER_NO(infscrapvO.getMEMBER_NO()).infoname(infscrapvO.getInfoname()).scrap_time(infscrapvO.getScrap_time()).build());
    }

    public void delete_scrap_info(Long MEMBER_NO) {
        System.out.println("delete_scrap_info");
        infscraprepository.deleteById(MEMBER_NO);
    }

    public void insert_scrap_company(companyScrapVO companyscrapvo){
        System.out.println("insert_scrap_info");
        companyscraprepository.save(companyScrapVO.builder().MEMBER_NO(companyscrapvo.getMEMBER_NO()).companyName(companyscrapvo.getCompanyName()).scrap_time(companyscrapvo.getScrap_time()).build());
    }

    public void delete_scrap_company(Long MEMBER_NO){
        System.out.println("delete_scrap_company");
        companyscraprepository.deleteById(MEMBER_NO);
    }
}
