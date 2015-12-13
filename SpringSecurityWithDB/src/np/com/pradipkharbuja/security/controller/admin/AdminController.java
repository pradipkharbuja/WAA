package np.com.pradipkharbuja.security.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping("")
	public @ResponseBody String index() {
		return "Hello I am admin";
	}

}
