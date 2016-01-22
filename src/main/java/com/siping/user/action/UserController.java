package com.siping.user.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.siping.user.bean.User;
import com.siping.user.dao.UserDao;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("get_user_by_name")
    public void getUserByName(HttpServletResponse response) {
        List<User> users = userDao.getByName("lilili");
        if (users != null && users.size() > 0) {
            for (int i = 0; i < users.size(); i++) {
                System.out.println(users.get(i));
            }
        }
        try {
            response.getWriter().write("Success");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    @RequestMapping("get_user_by_name2")
    public void getUserByName2(HttpServletResponse response) {
        List<User> users = userDao.getByNamee("lilili");
        if (users != null && users.size() > 0) {
            for (int i = 0; i < users.size(); i++) {
                System.out.println(users.get(i));
            }
        }
        try {
            response.getWriter().write("Success");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
