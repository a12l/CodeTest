package com.crossover.trial.journals.service.helpers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.crossover.trial.journals.builders.MailMessage;

@Service
public class EmailServiceImpl implements EmailService {
	@Autowired
	private JavaMailSender javaMailService;

	public void sendMessage(MailMessage message) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(message.getTo());
		mailMessage.setSubject(message.getSubject());
		mailMessage.setText(message.getBody());
		javaMailService.send(mailMessage);
	}
}