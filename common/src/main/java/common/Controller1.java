package common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
	
	@GetMapping("/test")
	public String test() {
		return "code is changed";
	}

}
