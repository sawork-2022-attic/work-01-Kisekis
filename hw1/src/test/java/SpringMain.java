import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import asciipanel.AsciiPanel;

public class SpringMain {
    public static void main(String[] args) {

//---------asciipanel.xml test

//        ApplicationContext context = new ClassPathXmlApplicationContext("xml-config.xml");
//        AsciiPanel panel = (AsciiPanel) context.getBean("panel");
//        System.out.println(panel.toString());

//---------asciipanel.annotation test

        ApplicationContext context = new ClassPathXmlApplicationContext("annotation-config.xml");
        AsciiPanel panel = (AsciiPanel) context.getBean(AsciiPanel.class);
        System.out.println(panel.toString());

    }

}
