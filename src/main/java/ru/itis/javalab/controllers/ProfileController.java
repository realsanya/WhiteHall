package ru.itis.javalab.controllers;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.itis.javalab.models.Image;
import ru.itis.javalab.models.User;
import ru.itis.javalab.services.interfaces.ImageService;
import ru.itis.javalab.services.interfaces.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

@Controller
public class ProfileController {

    private String UPLOAD_DIR = "C:\\Users\\Asus\\Desktop\\ITISPROJECTS\\Donut\\Donuts\\PuffyDonut\\src\\main\\webapp\\assets\\img";

    @Autowired
    public ImageService imageService;

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String getProfilePage(HttpServletRequest request, Model model) {
        User user = (User) request.getSession().getAttribute("user");
        if (user != null) {
            model.addAttribute("image", imageService.getImage(user.getImage_id().getId()));
            model.addAttribute("user", user);
            return "profile";
        }
        return "login";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void updateImage(HttpServletRequest request) throws IOException, ServletException {
        Part file = request.getPart("file");
        String path = UUID.randomUUID().toString() + "-" + file.getSubmittedFileName();

        User user = (User) request.getSession().getAttribute("user");

        Image image = Image.builder()
                .type(file.getContentType())
                .path(path).build();
        imageService.addImage(image);

        user.setImage_id(imageService.getImageByPath(path));
        userService.addUser(user);

        IOUtils.copyLarge(
                file.getInputStream(),
                new FileOutputStream(UPLOAD_DIR + File.separator + path)
        );
    }
}
