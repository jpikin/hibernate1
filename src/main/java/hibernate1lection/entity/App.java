package hibernate1lection.entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                Person person = new Person();
                person.setName("Anton");
                person.setAge(22);
                person.setEmail("anton@gmail.com");
                session.persist(person);

                Pet pet = new Pet("Boris", 2, "brown", "dog");
                pet.setPerson(person);
                session.persist(pet);

                transaction.commit();
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }

            } finally {
                session.close();
            }
        }
    }
}
