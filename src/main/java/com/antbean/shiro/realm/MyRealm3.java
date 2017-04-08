package com.antbean.shiro.realm;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.Realm;

public class MyRealm3 implements Realm {

	@Override
	public String getName() {
		return "myrealm3";
	}

	@Override
	public boolean supports(AuthenticationToken token) {
		return token instanceof UsernamePasswordToken;
	}

	@Override
	public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		System.out.println("MyRealm3");
		String username = (String) token.getPrincipal();
		String password = new String((char[]) token.getCredentials());

		if (!"zhang".equals(username)) {
			throw new AccountException();
		}
		if (!"123".equals(password)) {
			throw new AccountException();
		}

		return new SimpleAuthenticationInfo("liminghui@qq.com", "123456", getName());
	}

}
