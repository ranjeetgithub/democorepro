package com.incedo.lambda;

public class LambdaMain {

	public static void main(String[] args) {
		
		LambdaMain lambdaMain = new LambdaMain();
		MathOperation addOperation = (int a,int b)->a+b;
		MathOperation subtOperation = (a,b)->a-b;
		MathOperation multOperation = (int a,int b)->{return a*b;};
		MathOperation divOperation = (a,b)-> a/b;
		Message message = msg -> System.out.println("msg="+msg);
		Message message1 = (msg1) -> System.out.println("msg="+msg1);
		System.out.println(lambdaMain.operationOperate(5, 2, addOperation));
		System.out.println(lambdaMain.operationOperate(5, 2, subtOperation));
		System.out.println(lambdaMain.operationOperate(5, 2, multOperation));
		System.out.println(lambdaMain.operationOperate(5, 2, divOperation));
		message.getMsg("hi");
		message1.getMsg("hihi");

	}
	
	private int operationOperate(int a,int b,MathOperation mathOperation){
		return mathOperation.operation(a, b);
	}

}
