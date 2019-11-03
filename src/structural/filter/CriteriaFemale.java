package structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personList = new ArrayList<>();

        for (Person person: persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE"))
                personList.add(person);
        }
        return personList;
    }
}
