package controllers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GameController
 */
@WebServlet("/game")
public class GameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GameController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		if (null != request.getParameter("startButton")){
//			response.getWriter().append("  Start game " );
//		}
		response.getWriter().append("    Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (null != request.getParameter("startButton")){
			response.getWriter().append("  Start game " );
			RequestDispatcher rd = request.getRequestDispatcher
				    ("pages/jsp/Game.jsp");
			rd.forward(request, response);
		}
	}

}
