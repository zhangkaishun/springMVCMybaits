package com.siping.Identify.action;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.siping.Identify.bean.Identify;
import com.siping.Identify.service.IdentifyService;

@Controller
@RequestMapping("/identify")
public class IdentifyController {
    @Autowired
    private IdentifyService identifyService;

    @RequestMapping("/get_identify")
    public ModelAndView getIdentify(HttpServletResponse response) {
        Identify identify = identifyService.getIdentifyByUserid(1);
        System.out.println(identify);
        return null;
    }
}
