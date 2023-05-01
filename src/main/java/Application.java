import com.bipin.service.SpeakerService;
import com.bipin.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;

public class Application {
    public static void main (String[] args){
        ApplicationContext appContxt=new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service=appContxt.getBean("speakerService", SpeakerService.class);
        System.out.println(service);
        System.out.println(service.hashCode());
        System.out.println(service.findAll().get(0).getFirstName());

        //SpeakerService service2=appContxt.getBean("speakerService", SpeakerService.class);
        //System.out.println(service2);
    }
}
