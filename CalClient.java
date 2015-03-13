package com.tk.rmi.cal;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

/**
 * 功能:客户端程序
 * 描述: 负责调用服务器发布的服务地址
 * @author jinhuatao
 * @date 2015-3-13 上午11:40:22
 */
public class CalClient {
	public static void main(String[] args) {
		//create and install security manager
		if(System.getSecurityManager() == null){
			System.setSecurityManager(new RMISecurityManager());
		}
		
		try{
			ICalculator cal = (ICalculator) Naming
					.lookup("rmi://localhost:8889/CalculatorServer");
			System.out.println("899+22 = "+cal.plus(899, 22));
			System.out.println("100-22 = "+cal.minus(100, 22));
			System.out.println("78*46 = "+cal.multiply(78, 46));
			System.out.println("892/34 = "+cal.divide(892, 34));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
