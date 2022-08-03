package com.ll.exam;

import lombok.AllArgsConstructor;

import java.lang.reflect.Method;

@AllArgsConstructor //롬복의 AllArgsContstructor?
public class RouteInfo {
    private String path;
    private String actionPath;// actionPath는 무슨역할??
    private Method method;// reflect의 Method?


}
