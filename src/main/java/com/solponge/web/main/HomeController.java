package com.solponge.web.main;

import com.solponge.domain.JobScrap.responseScrap;
import com.solponge.domain.JobScrap.service.jobScrapService;
import com.solponge.domain.product.productVo;
import com.solponge.domain.product.service.productService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.solponge.domain.jobinfo.service.jopInfoService;

import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("/com.solponge")
public class HomeController {
    @Autowired
    private jopInfoService jopinfoservice;
    @Autowired
    private productService productservice;
    @Autowired
    private jobScrapService jobscrapService;
    @GetMapping("main")
    public String items(Model model) {
        model.addAttribute("getproductNewTop8List", productservice.searchNew8());
        model.addAttribute("getJopInfoNewTop8List", jopinfoservice.jopinfosearchNew8());
        model.addAttribute("getproductpopularTop8List", productservice.searchPop6());
        try{
           System.out.println("s");
        }catch (Exception e){
            System.out.println("오류발생");
        }
        return "page/main";
    }
}
