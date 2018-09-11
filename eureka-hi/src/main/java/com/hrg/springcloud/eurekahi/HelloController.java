package com.hrg.springcloud.eurekahi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	
	@RequestMapping("/hi")
	@ResponseBody
	public String home(@RequestParam String name) {
		
		return "hi" + name + "port:" + 8762;
		
	}

}
