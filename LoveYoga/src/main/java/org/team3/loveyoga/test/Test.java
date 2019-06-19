package org.team3.loveyoga.test;

import org.team3.loveyoga.util.PhoneCodeUtil;
import org.team3.loveyoga.util.SMSUtil;

public class Test {
	public static void main(String[] args) {
		String phoneNumber = "13568307170";
		String verificationCode = PhoneCodeUtil.sendPhoneCode(phoneNumber);
		SMSUtil.sendSms(phoneNumber, verificationCode);
	}
}
