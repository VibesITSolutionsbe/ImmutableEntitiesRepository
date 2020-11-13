import com.vibesitsolutions.poc.v2.entity.impl.OneEntity;
import com.vibesitsolutions.poc.v2.repository.OneRepository;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Victor Martin
 */
public class Main {

    public static void main(String[] args) {
        OneRepository oneRepository = new OneRepository();


        OneEntity.EntityReader reader = oneRepository.findBy("");


        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.SECOND, 25);


        Date newDate = instance.getTime();
        OneEntity update = reader.updater()
                .withDate(newDate)
                .withProp1("updatedProp1")
                .withProp2("updatedProp2")
                .get();

        oneRepository.update(update);

        // Asserts
        assert reader.getDate().getTime() != update.getDate().getTime();

        // Check mutability
        instance.add(Calendar.SECOND, 25);
        newDate.setTime(instance.getTimeInMillis());

        assert update.getDate().getTime() != newDate.getTime();

    }

}
