package learn.avinash.java.annotations;
//https://www.spiria.com/en/blog/desktop-software/how-clock-elapsed-execution-time-between-method-calls-java-home-made
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.reflect.Proxy;

@SpringBootApplication
public class JavaAnnotationsTimeElapsedApplication {

	public static void main(String[] args) {
        Examples examples = (Examples) Proxy.newProxyInstance(Examples.class.getClassLoader(), new Class[]{Examples.class}, new ExamplesInvocationHandler());
        
        examples.thisIsAMethod();
        examples.thisIsAnotherMethod("");
        examples.thisIsALongRunningMethod();
    }
}
