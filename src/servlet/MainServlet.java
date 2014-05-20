package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}
	
	
	private void process(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			// 応答文字コードのセット
			res.setContentType("text/html; charset=Shift_JIS");
			
//			PrintWriter out = res.getWriter();
			
			req.setAttribute("name", "ナミケン");
			
			//文字を出力
//			out.println("おはようございます。");
//			out.println("私は元気です。");
			
			req.setAttribute("name", "namiken");
			
			
			ServletContext context = this.getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher("/jsp/sample.jsp");
			dispatcher.forward(req, res);
			
	}
}
