package com.siping.Identify.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.siping.Identify.bean.Identify;
import com.siping.Identify.dao.IdentifyDao;
import com.siping.Identify.service.IdentifyService;
import com.siping.test.Pagination;

@Controller
@RequestMapping("/identify")
public class IdentifyController {
    @Autowired
    private IdentifyService identifyService;
    @Autowired
    private IdentifyDao identifyDao;

    @RequestMapping("/get_identify")
    public ModelAndView getIdentify(HttpServletResponse response) {
        Identify identify = identifyService.getIdentifyByUserid(1);
        System.out.println(identify);
        return null;
    }

    @RequestMapping("/update_identify")
    public void updateIdentify(HttpServletResponse response) {
        Identify identify = identifyService.getIdentifyByUserid(1);
        identify.setAddress("四川");
        identifyDao.updateIdentify(identify);
        try {
            response.getWriter().write("success");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        };
    }
    @RequestMapping("/add_identify")
    public void addIdentify(HttpServletResponse response)
    {
        Identify identify=new Identify();
        identify.setAddress("攀枝花");
        identify.setUserId(3);
        identifyDao.addIdentify(identify);
        try {
            response.getWriter().write("success");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    @RequestMapping("/delete_identify")
    public void deleteIdentify(HttpServletResponse response)
    {
        identifyDao.deleteIdentify(7);
        try {
            response.getWriter().write("success");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @RequestMapping("/get_all_identify")
    public void getAllIdentify(HttpServletResponse response)
    {
        List<Identify> identifys=identifyDao.getAllIdentify();
        try {
            if(identifys!=null&&identifys.size()>0)
            for(int i=0;i<identifys.size();i++)
            {
                System.out.println(identifys.get(i));
            }
            
            response.getWriter().write("success");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    @RequestMapping("/get_all_page_identify")
    public void getAllPageIdentify(HttpServletResponse response)
    {
        Pagination pagination=new Pagination();
        pagination.setPageSize(3);
        pagination.setPageStart(0);
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("address", "成都");
        params.put("pagination", pagination);
        List<Identify> identifys=identifyDao.getIdentifyByPage(params);
        try {
            if(identifys!=null&&identifys.size()>0)
            for(int i=0;i<identifys.size();i++)
            {
                System.out.println(identifys.get(i));
            }
            
            response.getWriter().write("success");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
