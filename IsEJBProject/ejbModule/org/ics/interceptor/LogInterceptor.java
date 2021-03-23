package org.ics.interceptor;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptor {
	
	@AroundInvoke
	public Object intercept(InvocationContext context) throws Exception{
		
		System.out.println("Entered method " + context.getMethod().getName());
		
		Object result = context.proceed();
		
		System.out.println("Left method " + context.getMethod().getName());
		
		return result;
		
	}
	
	

}
