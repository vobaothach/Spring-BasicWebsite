package SpringMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringMVC.Dao.AcountDao;

@Controller
public class HomeController {
	@Autowired
	AcountDao acd;
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("user", acd.getAllAccount());
		return mv;
	}
}
