package com.example.demo.services;

import java.util.List;

import com.example.demo.domains.ArticleDTO;
import com.example.demo.domains.ReplyDTO;

import org.springframework.stereotype.Component;

@Component
public interface ArticleService {
    public void writeArticle(ArticleDTO article);
    public void updateArticle(ArticleDTO article);
    public void deleteArticle(ArticleDTO article);
    public void writeReply(ReplyDTO reply);
    public void deleteReply(ReplyDTO reply);
    public ArticleDTO readArticle(int artId);
    public List<ReplyDTO> readReply(int artId);
}