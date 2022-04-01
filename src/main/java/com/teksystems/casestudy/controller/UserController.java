package com.teksystems.casestudy.controller;

import com.teksystems.casestudy.database.dao.UserDAO;
import com.teksystems.casestudy.database.entity.User;
import com.teksystems.casestudy.formbean.RegisterFormBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class UserController {

    @Autowired
    private UserDAO userDAO;

    /**
     * This is the controller method for the entry point of the user registration page.
     * It does not do anything really other than provide a route to the register.jsp page
     **/

    @RequestMapping(value = "/user/register", method = RequestMethod.GET)
    public ModelAndView register() throws Exception {
        ModelAndView response = new ModelAndView();
        response.setViewName("user/register");

        return response;
    }

    @RequestMapping(value = "/user/registerSubmit", method = RequestMethod.POST)
    public ModelAndView registerSubmit(RegisterFormBean form) throws Exception {
        ModelAndView response = new ModelAndView();
        response.setViewName("user/register");

        User user = new User();

        user.setEmail(form.getEmail());
        user.setFirstName(form.getFirstName());
        user.setLastName(form.getLastName());
        user.setPassword(form.getPassword());

        userDAO.save(user);

        log.info(form.toString());

        return response;
    }
}
