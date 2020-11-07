package com.paathshala.messageservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.paathshala.messageservice.model.Message;
import com.paathshala.messageservice.model.MessagePublish;
import com.paathshala.messageservice.repository.MessageRepository;

@Service
public class MessageService {

	@Autowired
	private Environment env;

	@Autowired
	private MessageRepository messageRepository;

	public MessagePublish publishMessage(Message message) {
		MessagePublish msgPublish = new MessagePublish();
		msgPublish.setMessage(message);
		messageRepository.publishMessageOnSNS(message);
		msgPublish.setHostname(
				env.getProperty("local.server.host") + " is running on " + env.getProperty("local.server.port"));
		return msgPublish;
	}

}
