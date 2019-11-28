package com.kyiminhan.spring.dao;

import java.util.Collection;

import com.kyiminhan.spring.entity.Department;

/**
 * The Interface DepartmentDao.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Nov 28, 2019 <BR>
 * spring-jpa-demo-002 system <BR>
 * com.kyiminhan.spring.dao <BR>
 * DepartmentDao.java <BR>
 */
public interface DepartmentDao {

	/**
	 * Save.
	 *
	 * @param department the department
	 */
	void save(Department department);

	/**
	 * Update.
	 *
	 * @param department the department
	 */
	void update(Department department);

	/**
	 * Delete.
	 *
	 * @param department the department
	 */
	void delete(Department department);

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the department
	 */
	Department findById(Integer id);

	/**
	 * Find all.
	 *
	 * @return the collection
	 */
	Collection<Department> findAll();
}