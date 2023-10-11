package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CompleteCommand;
import model.ConfirmCommand;
import model.FactoryBean;
import model.ICommand;
import model.MainCommand;
import model.RegisterCommand;

@WebServlet("/mem")
public class MemberController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*req.setCharacterEncoding("utf-8");
        String url = "";
        String command = req.getParameter("command");
        
        ICommand cmd = null;
        
        if(cmd.equals("MAIN")) {
              cmd = new MainCommand();
        }
        else if(cmd.equals("CONFIRM")) {
            cmd = new ConfirmCommand();
        }
        else if(cmd.equals("COMPLETE")) {
            cmd = new CompleteCommand();
        }
        else if(cmd.equals("REGISTER")) {
            cmd = new RegisterCommand();
        }
        else {
            // 잘못된 접근에 대한 처리
        }
        url = (String)cmd.processCommand(req, resp);
        RequestDispatcher view = 
                req.getRequestDispatcher(url);
        view.forward(req, resp);*/
        
        String url = "";
        String command = req.getParameter("command");
        ICommand cmd = null;
        
        FactoryBean factory = FactoryBean.newInstance();
        cmd = factory.createInstance(command);
        
        url = (String)cmd.processCommand(req, resp);
        RequestDispatcher view = 
                req.getRequestDispatcher(url);
        view.forward(req, resp);
    }

}
