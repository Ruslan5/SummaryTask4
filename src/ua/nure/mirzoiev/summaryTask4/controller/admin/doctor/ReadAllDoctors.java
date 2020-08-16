package ua.nure.mirzoiev.summaryTask4.controller.admin.doctor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.nure.mirzoiev.summaryTask4.db.UtilServlet;
import ua.nure.mirzoiev.summaryTask4.entity.Person;
import ua.nure.mirzoiev.summaryTask4.entity.Role;

import java.io.IOException;
import java.util.List;

/**
 * Read all person where role equals DOCTOR servlet controller.
 * 
 * @author R.Mirzoiev
 * 
 */
@WebServlet("/admin/doctors")
public class ReadAllDoctors extends HttpServlet {
	
	private static final long serialVersionUID = 975240572606395472L;
	private static final UtilServlet utilServlet = new UtilServlet();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Person> personsList = null;
		try {
			personsList = utilServlet.getAllByRole(Role.DOCTOR);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		req.setAttribute("clientsList", personsList);
		req.setAttribute("role", Role.DOCTOR.getName());
		req.setAttribute("action", "/admin/sortPerson");

		req.getRequestDispatcher("/WEB-INF/doctors.jsp").forward(req, resp);
	}
}
