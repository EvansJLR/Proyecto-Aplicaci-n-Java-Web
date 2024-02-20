package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Formulario</title></head>");
		out.println("<body>");
		out.println("<h1>Formulario.</h1>");

		out.println("<form action=\"/myServlet2\">");
		out.println("<label for=\"nombre\">Nombre:</label><br>");
		out.println("<input type=\"text\" id=\"nombre\" name=\"nombre\"><br><br>" );
		out.println("<label for=\"apellidos\">Apellidos:</label><br>");
		out.println("<input type=\"text\" id=\"apellidos\" name=\"apellidos\"><br><br>" );
		out.println("<label for=\"genero\">Género:</label><br>");
		out.println("<input type=\"radio\" id=\"genero\" name=\"genero\" value=\"Bienvenido\"/>Hombre" );
		out.println("<input type=\"radio\" id=\"genero\" name=\"genero\" value=\"Bienvenida\"/>Mujer<br><br>" );
		out.println("<input type=\"submit\" value=\"Enviar\">");
		out.println("</form>");
		out.println("</body></html>");

}}