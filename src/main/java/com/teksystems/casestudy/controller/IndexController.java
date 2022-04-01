package com.teksystems.casestudy.controller;

import com.teksystems.casestudy.database.dao.UserDAO;
import com.teksystems.casestudy.database.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() throws Exception{
        ModelAndView response = new ModelAndView();

        List<User> users = userDAO.findByFirstName("Eric");
//        List<User> users2 = userDAO.findByFirstNameAndLastName("Betty", "Larson");
//        List<User> users3 = userDAO.findByFirstNameContainsAndLastNameContains("y", "o");
//        List<User> users4 = userDAO.findAll();
//
//
//        for( User user : users ) {
//            log.info(user.toString());
//        }
//
//        for( User user : users2 ) {
//            log.info(user.toString());
//        }
//
//        for( User user : users3 ) {
//            log.info(user.toString());
//        }


        response.setViewName("index");
        response.addObject("users", users);
//        response.addObject("users3", users3);
        return response;
    }
}
