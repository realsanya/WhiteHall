package ru.itis.javalab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.itis.javalab.services.interfaces.ReviewService;

@Controller
public class ReviewsController {
    @Autowired
    private ReviewService reviewService;

    @RequestMapping(value = "/reviews", method = RequestMethod.GET)
    public String getReviewsPage(Model model) {
        model.addAttribute("reviews", reviewService.getAllReviews());
        return "reviews";
    }
}
