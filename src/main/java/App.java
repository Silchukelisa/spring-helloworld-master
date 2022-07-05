import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHWOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHWOne.getMessage());

        HelloWorld beanHWTwo = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHWTwo.getMessage());

        Cat beanCatOne = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCatOne.getName());

        Cat beanCatTwo = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCatOne.getName());

        System.out.println(beanHWOne == beanHWTwo);
        System.out.println(beanCatOne == beanCatTwo);
    }
}