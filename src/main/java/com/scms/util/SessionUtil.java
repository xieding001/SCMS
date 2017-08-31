package com.scms.util;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletContext;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * Created by xieding001 on 2017/8/29.
 */
public class SessionUtil {
    /**
     * 向PrintWriter中输入数据
     * @param info
     */
    private static PrintWriter writer=null;
    public static void write2PrintWriter(String info){
        try{
            getHttpServletResponse().setCharacterEncoding("UTF-8");
            writer= getHttpServletResponse().getWriter();

            writer.write(info);//响应输出
            //释放资源，关闭流
            writer.flush();
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 获取当前请求request
     * @return
     */
    public static HttpServletRequest getHttpServletRequest(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes())
                .getRequest();
        return request;
    }

    /**
     * 获取当前请求session
     * @return
     */
    public static HttpSession getHttpSession(){
        return getHttpServletRequest().getSession();
    }

    /**
     * 获取当前response
     * @return
     */
    public static HttpServletResponse getHttpServletResponse(){
        HttpServletResponse response = ((ServletRequestAttributes)RequestContextHolder
                .getRequestAttributes())
                .getResponse();
        return response;
    }

    /**
     * 获取当前context
     * @return
     */
    public static ServletContext getServletContext(){
        ServletContext context = ContextLoader.getCurrentWebApplicationContext().getServletContext();
        return context;
    }
}
