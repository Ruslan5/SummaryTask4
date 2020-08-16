package ua.nure.mirzoiev.summaryTask4.controller.admin.doctor;

import ua.nure.mirzoiev.summaryTask4.db.UtilServlet;
import ua.nure.mirzoiev.summaryTask4.entity.Person;
import ua.nure.mirzoiev.summaryTask4.entity.Role;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin/patients")
public class ReadAllPatients extends HttpServlet {
    private static final UtilServlet utilServlet = new UtilServlet();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	List<Person> patientList = null;
		try {
			patientList = utilServlet.getAllByRole(Role.PATIENT);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        req.setAttribute("clientsList", patientList);
        req.setAttribute("role", Role.PATIENT.getName());


        req.getRequestDispatcher("/patients.jsp").forward(req, resp);
    }
}
