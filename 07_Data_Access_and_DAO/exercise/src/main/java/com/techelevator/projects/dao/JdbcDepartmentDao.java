package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {
	
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartment(int id) {
		String sql = "SELECT department_id, name FROM department " +
				"WHERE department_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql,id);
		if (results.next()) {
			Department department = mapRowToDepartment(results);
			return department;
		} else
			return null;
	}

	@Override
	public List<Department> getAllDepartments() {
		return new ArrayList<>();
	}

	@Override
	public void updateDepartment(Department updatedDepartment) {

	}

	private Department mapRowToDepartment(SqlRowSet rowSet) {
		Department department = new Department();
		department.setId(rowSet.getInt("department_id"));
		department.setName(rowSet.getString("name"));
		return department;
	}

}
