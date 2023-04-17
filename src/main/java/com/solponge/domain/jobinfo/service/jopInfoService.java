package com.solponge.domain.jobinfo.service;

import com.solponge.domain.jobinfo.JopInfoVo;
import com.solponge.domain.jobinfo.jopInfoRepository;
import com.solponge.domain.product.productRepository;
import com.solponge.domain.product.productVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jopInfoService {

    @Autowired
    private jopInfoRepository jopinforepository;

    public List<JopInfoVo> jopinfosearchAll(){
        return jopinforepository.findAll();
    }

    public List<JopInfoVo> jopinfosearchNew8(){
        return jopinforepository.jopInfoNew8();
    }
}
