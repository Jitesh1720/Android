package com.example.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/board/insert")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		String author = request.getRemoteUser();
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/authority", "root", "apmsetup");
			String sql = "INSERT INTO `authority`.`boardtbl` (`id`, `author`, `title`, `content`) VALUES (NULL, ?, ?, ?);";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, author);
			statement.setString(2, title);
			statement.setString(3, content);
			statement.executeUpdate();
			response.setContentType("text/plain");
			response.getWriter().println("OK");
			return;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("text/plain");
		response.getWriter().println("Fail");
	}

}