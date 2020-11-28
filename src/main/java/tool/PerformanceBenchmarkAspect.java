package tool;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class PerformanceBenchmarkAspect {

    @Around("execution(* transform(String))")
    public void measureProcessingPerformance(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        double startTime = System.nanoTime();

        double elapsedTime = System.nanoTime() - startTime;

        System.out.println("Processing time of file : "
                + elapsedTime / 100000);
    }
}
