package SpringMVC.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response) {
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
		if(username!=null && pass!=null) {
			if(username.equalsIgnoreCase("admin")&& pass.equals("admin")) {
				return new ModelAndView("confirmation","username",username);
			} else {
				return new ModelAndView("Login","error","username or password is invalid");
			}
		} else {
			return new ModelAndView("Login","error","Please enter username and password");
		}
	}
}
