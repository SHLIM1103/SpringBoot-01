package com.example.demo.controllers;

import java.util.List;

import com.example.demo.domains.ArticleDTO;
import com.example.demo.domains.ReplyDTO;
import com.example.demo.impls.ArticleServiceImpl;
import com.example.demo.services.ArticleService;

public class ArticleController {
    private ArticleService articleService;
    public ArticleController(){
        articleService = new ArticleServiceImpl();
    }
    public void postArticle(ArticleDTO article){
        articleService.writeArticle(article);
    }
    public void putArticle(ArticleDTO article){
        articleService.updateArticle(article);
    }
    public void deleteArticle(ArticleDTO article){
        articleService.deleteArticle(article);
    }
    public void postReply(ReplyDTO reply){
        articleService.writeReply(reply);
    }
    public void deleteReply(ReplyDTO reply){
        articleService.deleteReply(reply);
    }
    public ArticleDTO getReadArticle(int artId){
        return articleService.readArticle(artId);
    }
    public List<ArticleDTO> getReadReply(int artId){
        return articleService.readReply(artId);
    }
}
