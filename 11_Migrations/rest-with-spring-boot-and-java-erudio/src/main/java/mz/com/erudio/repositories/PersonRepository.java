package mz.com.erudio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mz.com.erudio.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
