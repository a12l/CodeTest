package com.crossover.trial.journals.service.helpers;

import com.crossover.trial.journals.builders.MailMessage;

public interface EmailService {
	public void sendMessage(MailMessage text);
}