package by.epam.cafe.controller.command.getimpl;

import by.epam.cafe.controller.command.Command;
import by.epam.cafe.controller.command.PermissionDeniedException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogOut extends Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, PermissionDeniedException {
        request.getSession().invalidate();
        response.sendRedirect(request.getContextPath() + request.getServletPath());
    }
}
