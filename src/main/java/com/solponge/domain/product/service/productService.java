package com.solponge.domain.product.service;

import com.solponge.domain.product.productRepository;
import com.solponge.domain.product.productVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService {

    @Autowired
    private productRepository productrepository;

    public List<productVo> searchAll(){
        return productrepository.findAll();
    }

    public List<productVo> searchNew8(){
        return productrepository.productNwe8();
    }
    public List<productVo> searchPop6(){
        return productrepository.productPopular6();
    }
}
