package com.itis.dz.controllers;

import com.itis.dz.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Regina on 28.12.2015.
 */
@Controller
@RequestMapping(value = "/")
public class MainPageController extends BaseController {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private MovieService movieService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String renderMainPage() {
        request.setAttribute("movieList", movieService.getMovies());
        return "main_page";
    }
}
