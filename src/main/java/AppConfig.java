import com.bipin.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.bipin"})
public class AppConfig
{
    @Bean(name = "cal")
    public CalendarFactory calFctory()
    {
        CalendarFactory factory=new CalendarFactory();
        factory.addDays(2);;
        return  factory;
    }

    @Bean
    public Calendar Cal() throws Exception{
        return calFctory().getObject();
    }
    /*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService GetSpeakerService()
    {
        // Constructor Injection
        //SpeakerServiceImpl service= new SpeakerServiceImpl(getSpeakerRepository());

        // Setter Injection
        //service.setRepository(getSpeakerRepository());

        // Auto wired injection
        SpeakerServiceImpl service= new SpeakerServiceImpl();
        return service;
    }
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepoImpl();
    }*/
}
