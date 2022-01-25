import config.SystemTestConfig;
import Repository.TransferService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

//    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
//        Cat cat1 = ctx.getBean("cat", Cat.class);
//        Cat cat2 = ctx.getBean("cat", Cat.class);
////        Cat cat2 = ctx.getBean({"animal","cat2"}, Cat.class);
//        System.out.println(cat1.equals(cat2));
////        ctx.getBean("adress", Adress.class);
//        User user = ctx.getBean("user", User.class);
//        System.out.println(user.getAdress().getStreet());
//
////    ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
////    Cat cat = context.getBean("cat", Cat.class);
////    cat.getVoice();
////    Adress adress= context.getBean("adress", Adress.class);
////    User user = context.getBean("user", User.class);
////        System.out.println(user.getAdress().getStreet());
//    }
public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(SystemTestConfig.class);
    TransferService transferService = ctx.getBean(TransferService.class);
    transferService.transfer(100.00f, "A123", "C456");
}
}
