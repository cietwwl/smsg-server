/**
 * This class has been generated by Fast Code Eclipse Plugin 
 * For more information please go to http://fast-code.sourceforge.net/
 * @author : jacky
 * Created : 05/15/2013
 */

package com.lodogame.ldsg.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.lodogame.game.utils.IDGenerator;

@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
public class PaymentServiceTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private GameApiService gameApiService;

	String partnerId = "1001";
	String serverId = "d1";
	String partnerUserId = "5b682917bba04a96a2231bd5d19846e8";
	String channel = "alipay";
	String orderId = IDGenerator.getID();
	BigDecimal amount = new BigDecimal("100");
	int gold = 1000;
	String userIp = "192.168.1.2";
	String remark = "remark";

	/**
	 * 
	 * @see com.lodogame.ldsg.service.PaymentService#doPayment(String,int,String,String,String,int,int,String,String)
	 */
	@Test
	public void doPayment() {

		gameApiService.doPayment(partnerId, serverId, partnerUserId, channel, orderId, amount, gold, userIp, remark);

	}

}