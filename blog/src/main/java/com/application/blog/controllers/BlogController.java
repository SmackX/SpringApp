package com.application.blog.controllers;

import com.application.blog.Repo.ArticleRepo;
import com.application.blog.models.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {

    @Autowired
    private ArticleRepo repo;

    @GetMapping("/blog")
    public String blogMain(Model model) {
        Iterable<Article> articles = repo.findAll();
        model.addAttribute("articles", articles);
        return "blog-main";
    }
    @GetMapping("/blog/add")
    public String blogAdd(Model model) {
       return "blog-add";
    }
    @GetMapping("/error")
    public String Error(Model model) {
        return "Error in your code code or in DB";
    }

    @PostMapping()
    public String blogPostAdd(@RequestParam String title,@RequestParam String anons,@RequestParam String full_text, Model model){
        Article article = new Article(title, anons, full_text);
        repo.save(article);
        return "/blog";
    }
}
