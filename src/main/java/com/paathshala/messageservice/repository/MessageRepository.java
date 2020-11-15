package com.paathshala.messageservice.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.paathshala.messageservice.model.Message;

@Repository
public class MessageRepository {

	// @Autowired
	// private SNSUtil util;

	private static final Logger logger = LoggerFactory.getLogger(MessageRepository.class);

	public void publishMessageOnSNS(Message message) {
		// util.publishSNSMessage(message.toString());
		logger.debug(message.toString());
		logger.info(message.toString());
	}

}
