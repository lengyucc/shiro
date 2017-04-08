package com.antbean.shiro.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.junit.Assert;
import org.junit.Test;

public class RoleTest extends BaseTest {
	
	@Test
	public void testHasRole(){
		login("classpath:shiro-role.ini", "wanger", "123");
		Subject subject = SecurityUtils.getSubject();
		Assert.assertTrue(subject.hasRole("role1"));
	}
	
}
