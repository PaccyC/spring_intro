package demo;
import  org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
//        By using xml configuration

//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

//        Second way :By using java configuration

        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);




//First way
//        Doctor doctor=context.getBean(Doctor.class);
//        second way using type casting

        Doctor doctor= context.getBean(Doctor.class) ;
        doctor.assist();
//        doctor.setQualification("EYE TREATMENT");
//        System.out.println(doctor);
//        Doctor doctor1=context.getBean(Doctor.class);
//        System.out.println(doctor1);
//

    }
}
