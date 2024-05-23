package com.techjivaa.fhirR4JsonConverter.userrepository;

import com.techjivaa.fhirR4JsonConverter.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

public interface UserRepository extends JpaRepository<User, Integer> {
}
