import com.nonameproject.spring.configs.core.JavaConfig;
import com.nonameproject.spring.entities.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by vlados on 5/24/2016.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        MongoTemplate mongoTemplate = ctx.getBean(MongoTemplate.class);
        Person person = mongoTemplate.findAll(Person.class).get(0);
        System.out.println(person.getName() + " " + person.getSurname());
    }
}
