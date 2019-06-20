package org.team3.loveyoga.test;

import org.team3.loveyoga.util.PhoneCodeUtil;
import org.team3.loveyoga.util.SMSUtil;

public class Test {
	public static void main(String[] args) {
		String phoneNumber = "13568307170";
		String code = PhoneCodeUtil.sendPhoneCode(phoneNumber);
		SMSUtil.sendSms(phoneNumber, code);
		System.out.println(code);
	}
}
