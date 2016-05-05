package quartzexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuartzJobTest {
	public static void main(String[] args) {
		System.out.println("Test start.");  
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
        System.out.print("Test end..");
	}
}
