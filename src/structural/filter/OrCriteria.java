package structural.filter;

import java.util.List;

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteria = criteria.meetCriteria(persons);
        List<Person> secondCriteria = otherCriteria.meetCriteria(persons);

        for (Person person: secondCriteria) {
            if (!firstCriteria.contains(person)) {
                firstCriteria.add(person);
            }
        }
        return firstCriteria;
    }
}
