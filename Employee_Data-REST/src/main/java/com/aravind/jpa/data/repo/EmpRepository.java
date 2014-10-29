/**
 * 
 */
package com.aravind.jpa.data.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aravind.jpa.data.rest.dataobject.Employee;

/**
 * Repository interface that helps to call relevant functions
 * @author aravind
 *
 */
@RepositoryRestResource(collectionResourceRel = "emp", path = "emp")
public interface EmpRepository extends PagingAndSortingRepository<Employee, Long> {

	List<Employee> findByEmpName(@Param("name") String name);
	
	List<Employee> findByEmpID(@Param("id") int id);
	
	 @Override
	public Iterable<Employee> findAll();
	 
	 @Override
	public <S extends Employee> Iterable<S> save(Iterable<S> entities);
	 
	 @Override
	public Employee findOne(Long id);
	 
	 @Override
	public void delete(Long id);
	 
	@Override
	public long count();
	 
	}

     
