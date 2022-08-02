package com.ll.exam;

import com.ll.exam.article.annotation.Controller;
import com.ll.exam.article.controller.ArticleController;
import com.ll.exam.home.controller.HomeController;
import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Container {
    private static Map<Class, Object> objects;

    static {
        objects = new HashMap<>();
        objects.put(ArticleController.class, new ArticleController());
        objects.put(HomeController.class, new HomeController());
    }
//        articleController = Ut.cls.newObj(ArticleController.class, null);
//        homeController = Ut.cls.newObj(HomeController.class, null);
//        articleController = (ArticleController) Ut.cls.newObj(ArticleController.class, null);
//        homeController = (HomeController) Ut.cls.newObj(HomeController.class, null);
    public static Object getObj(Class cls) {
        return objects.get(cls);
}

//    public static ArticleController getArticleController() {
//        return articleController;
//    }
//    public static HomeController getHomeController() {
//        return homeController;
//    }
    public static List<String> getControllerNames() throws InvocationTargetException, IllegalAccessException {
//        return List.of("home", "article");
//        Reflections reflections = new Reflections("com.ll.exam");
        //List<String> names;

//
        List<String> names = new ArrayList<>();

        Reflections ref = new Reflections("com.ll.exam");
        for (Class<?> cls : ref.getTypesAnnotatedWith(Controller.class)) {
            String name = cls.getSimpleName(); // HomeController
            name = name.replace("Controller", ""); // Home
            name = Ut.str.decapitalize(name); // home

            names.add(name.replace("Controller", name));
        }

        return names;
    }
}