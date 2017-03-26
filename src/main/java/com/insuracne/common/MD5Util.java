package com.insuracne.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5 工具类
 * 
 * @author pengfeiwan
 *
 */
public class MD5Util {

	/**
	 * 返回MD5加密的字符串
	 * 
	 * @param pwd
	 * @return
	 */
	public static String getMD5pwd(String pwd) {
		StringBuffer sb = new StringBuffer();
		try {
			char[] chars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
			MessageDigest md = MessageDigest.getInstance("MD5");// 'SHA1'
			byte[] tage = md.digest(pwd.getBytes());
			for (byte b : tage) {
				sb.append(chars[(b >> 4) & 0x0F]);
				sb.append(chars[b & 0x0F]);
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

}
