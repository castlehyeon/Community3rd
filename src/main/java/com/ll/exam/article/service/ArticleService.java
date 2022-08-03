package com.ll.exam.article.service;

import com.ll.exam.article.annotation.Autowired;
import com.ll.exam.article.annotation.Service;
import com.ll.exam.article.repository.ArticleRepository;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;
}
