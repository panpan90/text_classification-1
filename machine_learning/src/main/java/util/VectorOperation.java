package util;

import org.apache.log4j.Logger;


/**
 * @author xiaohe
 * 创建于：2015年2月6日
 * 一个向量计算的类，只有比较简单的运算
 */
public class VectorOperation {
	static Logger logger = Logger.getLogger(VectorOperation.class);
	
	/**
	 * @comment:向量内积
	 * @return:void
	 */
	public static double innerProduct(double[] v1 , double[] v2)
	{
		if(v1.length != v2.length)
		{
			logger.error("输入的两个向量维度不等！");
			return -1;
		}
		
		double result = 0;
		
		for(int i=0;i<v1.length;++i)
		{
			result += v1[i]*v2[i];
		}
		
		return result;
	}
	
	/**
	 * @comment:向量和向量相加
	 * @param v1
	 * @param v2
	 * @return
	 * @return:double[]
	 */
	public static double[] addition(double[] v1 , double[] v2)
	{
		if(v1.length != v2.length)
		{
			logger.error("输入的两个向量维度不等！");
		}
		
		double[] result = new double[v1.length];
		
		for(int i=0;i<v1.length;++i)
		{
			result[i] = v1[i]+v2[i];
		}
		
		return result;
	}
	
	/**
	 * @comment:向量减法
	 * @param v1
	 * @param v2
	 * @return
	 * @return:double[]
	 */
	public static double[] subtraction(double[] minuend , double[] subtrahend)
	{
		if(minuend.length != subtrahend.length)
		{
			logger.error("输入的两个向量维度不等！");
		}
		
		double[] result = new double[minuend.length];
		
		for(int i=0;i<minuend.length;++i)
		{
			result[i] = minuend[i]-subtrahend[i];
		}
		
		return result;
	}
		
	/**
	 * @comment:向量和常数相乘
	 * @param v1
	 * @param constant
	 * @return
	 * @return:double[]
	 */
	public static double[] constantMultip(double[] v1,double constant)
	{
		double[] result = new double[v1.length];
		for(int i=0;i<v1.length;++i)
		{
			result[i] = v1[i]*constant;
		}
		
		return result;
	}
	
	/**
	 * @comment:计算向量间的距离
	 * @param v1
	 * @param v2
	 * @return
	 * @return:double
	 */
	public static double  errorSumSquares(double[] v1 , double[] v2)
	{
		if(v1.length != v2.length)
		{
			logger.error("输入的两个向量维度不等！");
			return -1;
		}
		double sum = 0;
		
		for(int i=0;i<v1.length;++i)
		{
			sum+= Math.pow((v1[i] - v2[i]),2);
		}
		
		return sum;
	}

}
