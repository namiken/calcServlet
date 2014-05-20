package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		process(req, res);
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		process(req, res);
	}

	private void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String request = req.getParameter("request");
		
		if (request == null) {
			
			ServletContext context = this.getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher("/jsp/inputCalc.jsp");
			dispatcher.forward(req, res);
		} else {
			calc(req);
			ServletContext context = this.getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher("/jsp/outputCalc.jsp");
			dispatcher.forward(req, res);
		}
	}

	/**
	 * 計算を行い、結果をnum3として送信する
	 * @param req
	 */
	private void calc(HttpServletRequest req) {
		double num1 = Double.parseDouble((String)req.getParameter("num1"));
		double num2 = Double.parseDouble((String)req.getParameter("num2"));
		
		String kind = req.getParameter("kind");
		
		double num3 = 0;
		
		if (kind.equals("+")) {
			num3 = num1 + num2;
		} else if (kind.equals("-")) {
			num3 = num1 - num2;
		} else if (kind.equals("/")) {
			num3 = num1 / num2;
		} else if (kind.equals("*")) {
			num3 = num1 * num2;
		}
		
		req.setAttribute("num3", num3);
	}
}
