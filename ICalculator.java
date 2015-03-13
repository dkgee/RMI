package com.tk.rmi.cal;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 功能:计算器接口类
 * 描述:RMI远程计算器服务端接口
 * @author jinhuatao
 * @date 2015-3-13 上午11:12:03
 */
public interface ICalculator extends Remote {
	public int plus(int m,int n) throws RemoteException;
	public int minus(int m,int n) throws RemoteException;
	public int multiply(int m,int n) throws RemoteException;
	public int divide(int m,int n) throws RemoteException;
}
