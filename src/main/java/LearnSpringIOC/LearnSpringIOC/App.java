package LearnSpringIOC.LearnSpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	//ApplicationContext is used to create, store and manage the objects of the classes / Spring beans
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	System.out.println("Config is loaded");
    	
    	Jio j = context.getBean("jio",Jio.class);
    	j.browsing();
    	j.calling();
    	
    	Airtel a = context.getBean("airtel",Airtel.class);
    	a.browsing();
    	a.calling();
    }
}
