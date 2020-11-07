package com.paathshala.messageservice.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.paathshala.messageservice.model.Message;
import com.paathshala.messageservice.util.SNSUtil;

@Repository
public class MessageRepository {

	@Autowired
	private SNSUtil util;
	
	public void publishMessageOnSNS(Message message){
		util.publishSNSMessage(message);
	}
	
}
