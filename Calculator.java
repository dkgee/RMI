package com.tk.rmi.cal;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 功能:计算器实现类
 * 描述:继承自UnicastRemoteObject，并实现ICalculator接口，分别实现它的加、减、乘、除四种运算
 * @author jinhuatao
 * @date 2015-3-13 上午11:23:03
 */
public class Calculator extends UnicastRemoteObject implements ICalculator {

	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @throws RemoteException
	 */
	public Calculator() throws RemoteException {
		super();
	}

	/**
	 * @author jinhuatao
	 * @date 2015-3-13上午11:23:04
	 * @param m
	 * @param n
	 * @return result  计算结果
	 * @throws RemoteException
	 */
	public int plus(int m, int n) throws RemoteException {
		return m+n;
	}

	/**
	 * @author jinhuatao
	 * @date 2015-3-13上午11:23:04
	 * @param m
	 * @param n
	 * @return result  计算结果
	 * @throws RemoteException
	 */
	public int minus(int m, int n) throws RemoteException {
		
		return m-n;
	}

	/**
	 * @author jinhuatao
	 * @date 2015-3-13上午11:23:04
	 * @param m
	 * @param n
	 * @return result  计算结果
	 * @throws RemoteException
	 */
	public int multiply(int m, int n) throws RemoteException {
		return m*n;
	}

	/**
	 * @author jinhuatao
	 * @date 2015-3-13上午11:23:04
	 * @param m
	 * @param n
	 * @return result  计算结果
	 * @throws RemoteException
	 */
	public int divide(int m, int n) throws RemoteException {
		if(n!=0){
			return m/n;
		}else{
			return 0;
		}
		
	}

}
