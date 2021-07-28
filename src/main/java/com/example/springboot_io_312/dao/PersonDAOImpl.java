package com.example.springboot_io_312.dao;

import com.example.springboot_io_312.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class PersonDAOImpl implements PersonDAO {

    @PersistenceContext // or even @Autowired
    private EntityManager em;

    @Override
    public List<Person> index() {
        return em.createQuery("SELECT person FROM Person person", Person.class).getResultList();
    }

    @Override
    public Person show(final Long id) {
        return em.find(Person.class, id);
    }

    @Override
    public void save(Person person) {
        em.persist(person);
    }

    @Override
    public void update(Person updatedPerson, Long id) {
//        Person person = em.find(Person.class, id);
//        person.setName(updatedPerson.getName());
//        person.setSurname(updatedPerson.getSurname());
//        person.setAge(updatedPerson.getAge());
//        person.setEmail(updatedPerson.getEmail());
//        person.setPassword(updatedPerson.getPassword());
//        person.setRoles(updatedPerson.getRoles());
//        em.merge(person);
        em.merge(updatedPerson);
    }

    @Override
    public void delete(Long id) {
        Person person = em.find(Person.class, id);
        em.remove(person);
    }

    @Override
    public Person findPersonByEmail(String email) {
        return em.createQuery("FROM Person p WHERE p.email =:email", Person.class).setParameter("email", email).getSingleResult();
    }

    @Override
    public Person findPersonByName(String name) {
        return em.createQuery("FROM Person p WHERE p.name =:name", Person.class).setParameter("name", name).getSingleResult();
    }


}

