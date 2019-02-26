package br.com.domain.acordocerto.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.domain.acordocerto.entity.Form;

@Repository
public interface FormRepository extends CrudRepository<Form, Long> {
	
}