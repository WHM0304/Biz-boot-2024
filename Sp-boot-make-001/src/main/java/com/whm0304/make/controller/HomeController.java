package com.whm0304.make.controller;


import com.whm0304.make.models.HiVO;
import com.whm0304.make.service.HiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private final HiService hiService;

    public HomeController(HiService hiService) {
        this.hiService = hiService;
    }

    @ResponseBody
    @GetMapping(value= {""})
    public HiVO home(){
        HiVO vo = HiVO.builder()
                .h_seq("1")
                .h_name("whm0304")
                .h_nick("whm")
                .build();
        return hiService.createHi(vo);
    }
}
