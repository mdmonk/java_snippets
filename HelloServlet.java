// A Hello, World Servlet example.
// Written 3/2001 by Wayne Pollock, Tampa Florida USA.

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet
{
   public void doPost ( HttpServletRequest req, HttpServletResponse res )
      throws IOException, ServletException
   {
      doGet( req, res );
   }

   public void doGet ( HttpServletRequest req, HttpServletResponse res )
      throws IOException, ServletException
   {
      res.setContentType( "text/html" );  // Can also use "text/plain" or others.
      PrintWriter out = res.getWriter();

      // Get the requestor's IP address (See JavaDocs to see how to get other info):
      String addr = req.getRemoteAddr();

      // Create output (the response):
      out.println( "<HTML><HEAD><TITLE>HelloServlet in myServletWAR</TITLE></HEAD>" );
      out.println( "<BODY><H1 ALIGN=\"CENTER\">" );
      out.println( "Hello " + addr + ", from HelloServlet in myServletWAR!" );
      out.println( "</H1></BODY></HTML>" );
      out.close();
   }
}
