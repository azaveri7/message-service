package com.paathshala.messageservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paathshala.messageservice.model.Message;
import com.paathshala.messageservice.model.MessagePublish;
import com.paathshala.messageservice.service.MessageService;

@RestController
public class MessageResource {
	
	@Autowired
	private MessageService messageService;

	@PostMapping("/publish-message")
	public MessagePublish publishMessage(Message message){
		return messageService.publishMessage(message);
	}
	
}
