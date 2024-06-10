package com.anu.mybus.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.anu.mybus.dto.Agency;

@Service
public class MailSending 
{
	@Autowired
	JavaMailSender mailSender;
	
	public Boolean sendEmail(Agency agency)
	{
		
		return true;
		
	}
}
