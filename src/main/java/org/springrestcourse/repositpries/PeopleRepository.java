package org.springrestcourse.repositpries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springrestcourse.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
