package delete;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteDemo extends HttpServlet {
	@Resource(name="dsjndi")
	private DataSource ds;
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		try {
		int sid;
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		
		PrintWriter pw=null;
		pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("<html><formt target='display'>");
		sid=Integer.parseInt(req.getParameter("stu_id"));
		con=ds.getConnection();
		ps=con.prepareStatement("delete from student_info where stu_id=?");
		ps.setInt(1, sid);
		result=ps.executeUpdate();
		if(result!=1) 
			pw.println("<h2>Record has Problem</h2>");
		else
			pw.println("<h2 style='position: absolute;left=50;top=50'>Record Deleted Sucessfully</h2>");
		
		ps.close();
		con.close();
		
		
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}//dopost

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}


}//class
