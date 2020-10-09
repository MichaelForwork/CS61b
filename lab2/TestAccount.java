/* -*- encoding: utf-8 -*-
'''
@File    :   TestAccount.java
@Time    :   2020/8/31
@Author  :   Michael
@Version :   1.0
@Contact :   Search username of MichaelForwork at github
@Doc    :    test the correctness of account file
'''
# -*-*-*-*- here is the beginning of this script -*-*-*-*- */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAccount {
	// this is the first time to use TDD style to write code.

	@Test
	public void testAccount(){
		int actual = 1;
		int expect = 2;
		assertEquals(expect , actual);

	}

	@Test
	public void testWithdraw(){
		Account me = new Account(100.3434234124);
		assertTrue(me.withdraw(20.434345));
		assertFalse(me.withdraw(103.2341324));
	}

	@Test
	public void testDeposit(){
		Account you = new Account(23423.32423);
		assertTrue(you.deposit(1323124.23432432));
		System.out.println("now you have money :"+ you.getBalance());
	}

	@Test
	public void testOverDraftProtection(){

		Account parentParent = new Account(100.111111,null);
		Account parent = new Account(50.2452435,parentParent);
		Account you = new Account(20.8908980,parent);

		assertTrue(you.withdraw(120.3433333333));
	}

	@Test
	public void testMerge(){
		
	}
}
