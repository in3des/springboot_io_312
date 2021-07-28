package com.example.springboot_io_312.service;

import com.example.springboot_io_312.entity.Person;

import java.util.List;

public interface PeopleService {

    public List<Person> index();

    public Person show(final Long id);

    public void save(Person person);

    public void update(Person updatedPerson, Long id);

    public void delete(Long id);

    public Person findPersonByEmail(String email);

    public Person findPersonByName(String name);
}