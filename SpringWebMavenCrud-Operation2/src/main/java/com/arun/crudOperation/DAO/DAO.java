package com.arun.crudOperation.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.arun.crudOperation.model.UserDTO;
@Component
public class DAO {

	public void saveDTO(UserDTO dto) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("username");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		
		transaction.commit();
		entityManager.close();
		
		
	}

	public List<UserDTO> read() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("username");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		javax.persistence.Query query = entityManager.createQuery("from UserDTO");
		List list =  query.getResultList();
		
		System.out.println(list);
		return list;
	}

	public UserDTO edit(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("username");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		UserDTO dto = entityManager.find(UserDTO.class, id);
		System.out.println(dto);
		transaction.commit();
		entityManager.close();
		return dto;
		
	}

	public void update(UserDTO dto) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("username");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		UserDTO userDTO = entityManager.find(UserDTO.class, dto.getId());
		userDTO.setName(dto.getName());
		userDTO.setAge(dto.getAge());
		userDTO.setSalary(dto.getSalary());
		userDTO.setAddress(dto.getAddress());
		System.out.println(userDTO);
		entityManager.persist(userDTO);
		
		transaction.commit();
		entityManager.close();
		
		
	}

	public void delete(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("username");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		UserDTO userDTO = entityManager.find(UserDTO.class,id);
		entityManager.remove(userDTO);
		transaction.commit();
		entityManager.close();
		
	}
	

}
