package com.ll.exam;

import com.ll.exam.article.controller.ArticleController;

public class Container {
    public static ArticleController getArticleController() {
        ArticleController articleController = new ArticleController();


        return articleController;
    }
}
