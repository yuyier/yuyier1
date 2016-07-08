package java;

/**
 * Created by chenliqing on 2016/7/7.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chenliqing on 2016/7/7.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/index")
class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
        //DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime="2014-10-09 10:29:01";
        req.setAttribute("currentTime",currentTime);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}

