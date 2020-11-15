package com.paathshala.messageservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paathshala.messageservice.model.Message;
import com.paathshala.messageservice.model.MessagePublish;
import com.paathshala.messageservice.service.MessageService;

@RestController
public class MessageResource {
	
	@Autowired
	private MessageService messageService;

	/*@RequestMapping(value = "/publish-message", method = RequestMethod.POST ,
			produces="application/json", consumes="application/json")*/
	@PostMapping("/publish-message")
	public MessagePublish publishMessage(@RequestBody Message message){
		return messageService.publishMessage(message);
	}
	
	@GetMapping("/ping")
	public String ping(){
		return "working";
	}
	
}
