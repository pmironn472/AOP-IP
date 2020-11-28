package tool;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* transform(String))")
	public void begoreProcessing(JoinPoint jp) {
        System.out.println("Unprocessed file found.\nProcessing file >> " + jp.getArgs()[0]);
    }

    @After("execution(* transform(String))")
	public void afterProcessing(JoinPoint jp) {
        System.out.printf("%s has been processed ",jp.getArgs()[0]);

    }




 //   }
}
