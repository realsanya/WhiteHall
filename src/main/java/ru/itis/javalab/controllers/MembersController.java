package ru.itis.javalab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.javalab.services.interfaces.TeamMemberService;

@Controller
public class MembersController {

    @Autowired
    public TeamMemberService teamMemberService;

    @RequestMapping(value = "/members", method = RequestMethod.GET)
    public String getProfilePage(@RequestParam(value = "page", required = false) Integer page,
                                 @RequestParam(value = "size", required = false) Integer size,
                                 Model model) {
        if (page != null && size != null) {
            System.out.println(teamMemberService.getAllMembers(page, size));
            model.addAttribute("members", teamMemberService.getAllMembers(page, size));
        } else {
            System.out.println(teamMemberService.getAllMembers());
            model.addAttribute("members", teamMemberService.getAllMembers());
        }

        return "members";
    }
}
