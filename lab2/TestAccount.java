package Test;/* -*- encoding: utf-8 -*-
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

	@Test
	public void testAccount(){
		int actual = 1;
		int expect = 2;
		assertEquals(expect , actual);

	}
}
