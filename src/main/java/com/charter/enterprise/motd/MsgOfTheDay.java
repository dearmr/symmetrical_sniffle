package com.charter.enterprise.motd;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "singleton")
@Component
public class MsgOfTheDay {
	
	private String value;
	
	public MsgOfTheDay() {
		this.value = "Welcome to Charter.  All systems are nominal.";
	}
	
	public MsgOfTheDay(String inValue) {
		this.value = inValue;
	}
	
    public synchronized String getValue () {
    	return this.value;
    }
    
    public synchronized void setValue (String inMsg) {
    	this.value = inMsg;
    }

}
