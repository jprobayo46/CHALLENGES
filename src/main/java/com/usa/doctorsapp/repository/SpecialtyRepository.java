package com.usa.doctorsapp.repository;

import com.usa.doctorsapp.model.Specialty;
import com.usa.doctorsapp.repository.crudrepository.SpecialityCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SpecialtyRepository {
    @Autowired
    private SpecialityCrudRepository specialityCrudRepository;

    public List<Specialty> getAll(){
        return (List<Specialty>) specialityCrudRepository.findAll();
    }

    public Optional<Specialty> getById(Integer idSpecialty){
        return specialityCrudRepository.findById(idSpecialty);
    }

    public Specialty save(Specialty specialty){
        return specialityCrudRepository.save(specialty);
    }

    public void delete(Specialty specialty){
        specialityCrudRepository.delete(specialty);
    }
}
