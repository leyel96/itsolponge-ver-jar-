package com.solponge.domain.JobScrap;

import com.solponge.domain.JobScrap.service.jobScrapService;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class responseScrap {

    public responseScrap(Model model, Long userNo, jobScrapService jobscrapService, String AttriButeParams_company, String AttriButeParams_info){
        System.out.println("비교시작");
        List<companyScrapVO> cvo = jobscrapService.companysearchAll(userNo);
        List<InfScrapVO> ivo = jobscrapService.infosearchAll(userNo);
        Map<String, String> params_company = new HashMap<>();
        Map<String, String> params_info = new HashMap<>();
        for(companyScrapVO c :cvo){
            params_company.put("response_"+c.getCompanyName(), c.getCompanyName());
        }
        for(InfScrapVO c :ivo){
            params_info.put("response_"+c.getInfoname(), c.getInfoname());
        }
        model.addAttribute(AttriButeParams_company, params_company);
        model.addAttribute(AttriButeParams_info, params_info);

    }
}
