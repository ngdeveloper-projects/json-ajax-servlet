package in.javadomain;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class JSONAjaxServlet
 */
@WebServlet("/JSONAjaxServlet")
public class JSONAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
         	request.setCharacterEncoding("utf8");
             response.setContentType("application/json");
             JSONObject json =  WriteJson();
             PrintWriter out = response.getWriter();
             response.getWriter().print(json);
         } catch (IOException e) {
             e.printStackTrace();
         }
	}
	
	// sample method with JSON return
	private JSONObject WriteJson() {
		JSONObject obj = new JSONObject();
		obj.put("SiteName", "javadomain.in");
		obj.put("URL", "http://www.javadomain.in");
		obj.put("Content", "Programming Tutorials");
		return obj;
	}

}
