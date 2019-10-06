import javax.servlet.http.HttpServlet;

public class AddServlet extends HttpServlet
{
  public void service (HttpServlet req, HttpServlet res) 
  {
	  int i=Integer.parseInt(req.getInitParameter("num1"));
	  int j=Integer.parseInt(req.getInitParameter("num2"));
	  int k=i+j;
	  System.out.println("result is"+k);
  }
}
