package com.xrgx.courseonline.component;

import com.xrgx.courseonline.domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//设置登录拦截

public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取session中的对象
        Object loginStu = request.getSession().getAttribute("loginStu");
//        System.out.println(loginStu);

        if (loginStu == null) {//对象为空，转发到首页
            request.setAttribute("msg", "没有权限，请登录");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;//不放行
        } else {//对象不为空则放行
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
