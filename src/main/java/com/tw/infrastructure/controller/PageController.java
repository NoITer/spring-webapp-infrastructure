package com.tw.infrastructure.controller;

import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.tw.infrastructure.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tw.infrastructure.service.EmployeeManager;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PageController {

    @RequestMapping(value = "/components-page", method = RequestMethod.GET)
    public String renderPage(){
        return "page-components";
    }

    @RequestMapping(value="rest/allComments", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody String getAllComments() {

        List<Comment> response = ImmutableList.<Comment>builder().
                add(new Comment.CommentBuilder().withAuthor("Pete Hunt").withContent("This is one comment").build()).
                add(new Comment.CommentBuilder().withAuthor("Jordan Walke").withContent("This is another comment").build()).build();

        return new Gson().toJson(response);

    }
}
