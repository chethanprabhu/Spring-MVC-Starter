package spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping("/mainPage")
	public String home() {
		return "form";
	}
	
	@RequestMapping("/welcome-user")
	public String welcomePage(HttpServletRequest request , Model model, @RequestParam("name") String name) {
		name = name.toUpperCase();
		model.addAttribute("UPPERNAME", name);
		return "welcome-user";
	}
}
