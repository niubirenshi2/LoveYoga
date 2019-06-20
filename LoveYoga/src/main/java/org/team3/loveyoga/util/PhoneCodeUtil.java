package org.team3.loveyoga.util;

import java.util.Random;

/**
 * 验证码的工具类，用来生成和发送验证码，依赖SMSUtil
 * 
 * maven依赖:
 * <dependency>
	    <groupId>com.aliyun</groupId>
	    <artifactId>aliyun-java-sdk-dysmsapi</artifactId>
	    <version>1.1.0</version>
	</dependency>
	<dependency>
	    <groupId>com.aliyun</groupId>
	    <artifactId>aliyun-java-sdk-core</artifactId>
	    <version>4.1.1</version>
	</dependency>
 */
public class PhoneCodeUtil {
    private static Random random = new Random(17);// 随机数生成类，用来生成随机验证码


    /**
     * 生成随机的验证码，并且发送验证码短信，将生成验证码返回给服务调用方
     * @param phoneNumber
     * @return 生成的随机的验证码
     */
    public static String sendPhoneCode(String phoneNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        SMSUtil.sendSms(phoneNumber, stringBuilder.toString());
        return stringBuilder.toString();
    }
    //测试
    public static void main(String[] args) {
    	//手机号
		String phoneNumber = "13568307170";
		//生成验证码
		String code = PhoneCodeUtil.sendPhoneCode(phoneNumber);
		//发送短信
		SMSUtil.sendSms(phoneNumber, code);
		System.out.println(code);
	}
}
