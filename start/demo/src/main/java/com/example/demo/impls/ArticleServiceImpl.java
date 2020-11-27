package com.example.demo.impls;

import com.example.demo.domains.ArticleDTO;
import com.example.demo.domains.ReplyDTO;
import com.example.demo.services.ArticleService;

import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Override
    public void writeArticle(ArticleDTO article) {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateArticle(ArticleDTO article) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteArticle(ArticleDTO article) {
        // TODO Auto-generated method stub

    }

    @Override
    public void writeReply(ReplyDTO reply) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteReply(ReplyDTO reply) {
        // TODO Auto-generated method stub

    }

    @Override
    public ArticleDTO readArticle(int artId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ReplyDTO[] readReply(int artId) {
        // TODO Auto-generated method stub
        return null;
    }

}