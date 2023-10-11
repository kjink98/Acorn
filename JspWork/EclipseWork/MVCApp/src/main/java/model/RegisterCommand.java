package model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterCommand implements ICommand {

    @Override
    public Object processCommand(HttpServletRequest req, HttpServletResponse  resp) throws ServletException, IOException {
        return "/WEB-INF/views/member/register.html";
    }

}
