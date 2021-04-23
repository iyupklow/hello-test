package com.shitiankexin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Linkexin on 2018/3/8.
 */
@RestController
public class HellloController {

	@GetMapping("/hello")
	public String hello(){
		return "Hello World!!!";
	}

}
