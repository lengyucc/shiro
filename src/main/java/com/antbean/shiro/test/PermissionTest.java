package com.antbean.shiro.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.junit.Assert;
import org.junit.Test;

public class PermissionTest extends BaseTest {
	
	@Test
	public void testIsPermissed(){
		login("classpath:shiro-permission.ini", "wanger", "123");
		Subject subject = SecurityUtils.getSubject();
		
//		Assert.assertTrue(subject.isPermitted("user:delete"));
		subject.checkPermission("user:delete");
	}
	
}
