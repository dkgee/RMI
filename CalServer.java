package com.tk.rmi.cal;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;

/**
 * 功能:服务器端程序
 * 描述:用于发布计算器的服务到固定的端口。手选创建一个安全管理器，然后将服务注册到8889端口中，并加载到RMI服务中
 * @author jinhuatao
 * @date 2015-3-13 上午11:29:52
 */
public class CalServer {
	public static void main(String[] args) {
		//create and install security manager
		if(System.getSecurityManager() == null){
			System.setSecurityManager(new RMISecurityManager());
		}
		try{
			//create a remote Object
			ICalculator cal = new Calculator();
			//start registry
			LocateRegistry.createRegistry(8889);
			//bind the name to the Object
			Naming.bind("rmi://localhost:8889/CalculatorServer", cal);
			System.out.println("Tips:Server is running!");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
