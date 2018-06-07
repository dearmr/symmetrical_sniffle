package com.charter.enterprise.motd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class MotdController {

	@Autowired
	private MsgOfTheDay message;
	
	//private String messageOfTheDay = "Welcome to Charter.  All systems are nominal.";
	
	@GetMapping 
    public String getMotd() {
        return message.getValue();
    }
    
    @PutMapping 
    public ResponseEntity<String>  putMotd(@RequestBody String newMsg) {
    	message.setValue(newMsg);
        return new ResponseEntity<String>("Message Updated", HttpStatus.OK);
    }
}
