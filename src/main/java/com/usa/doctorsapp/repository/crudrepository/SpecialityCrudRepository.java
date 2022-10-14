package com.usa.doctorsapp.repository.crudrepository;

import com.usa.doctorsapp.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityCrudRepository extends CrudRepository<Specialty, Integer> {
}
