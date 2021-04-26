package net.javaguides.login.web;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.javaguides.login.bean.LoginBean;
import net.javaguides.login.database.LoginDao;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private LoginDao loginDao;

    public void init() {
        loginDao = new LoginDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String rollno = request.getParameter("rollno");
        String password = request.getParameter("password");
        LoginBean loginBean = new LoginBean();
        loginBean.setUname(rollno);
        loginBean.setPassword(password);

        try {
            if (loginDao.validate(loginBean)) {
            	//response.sendRedirect("questForm.jsp");
              response.sendRedirect("success.jsp");
            } else {
                HttpSession session = request.getSession();
             
                response.sendRedirect("error.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}