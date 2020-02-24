package dev.hwiveloper.ssjwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResourceController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	@ResponseBody
	public String hello() {
		return "HELLO WORLD!";
	}
}
