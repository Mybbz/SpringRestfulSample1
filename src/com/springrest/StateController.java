package com.springrest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//Controller class is used to implement Web Service method
@Controller
@RequestMapping("/state")
public class StateController {
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public @ResponseBody String getState(@PathVariable String code){
		String result;
		if(code.equals("test")){
			result = "Here is Test";
		}else{
			result = "State by Default";
		}
		return result;
		
	}

}
