package com.convergence.framework.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.convergence.framework.util.ValidateUtil;

public class Test {

	public static void main(String[] args) {
		//char data = 'F';
		//String data = "  ";
		//List data = new ArrayList<>();
		//Map data = new HashMap();
		//BaseUtil data = null;
		Integer data = null;
		System.out.println(ValidateUtil.isNotEmpty(data));
	}
}
