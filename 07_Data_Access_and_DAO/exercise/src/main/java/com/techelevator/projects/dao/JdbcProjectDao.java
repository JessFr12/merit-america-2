package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(int projectId) {
		Project project = null;
		String sql = "SELECT project_id, name, from_date, to_date FROM project " +
				"WHERE project_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql,projectId);
		if (results.next()) {
			project = mapRowToProject(results);
			return project;
		} else
			return null;

	}

	@Override
	public List<Project> getAllProjects() {
		List<Project> projects = new ArrayList<>();
		String sql = "SELECT project_id, name, from_date, to_date FROM project;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()) {
			Project project = mapRowToProject(results);
			projects.add(project);
		}
		return projects;
	}

	@Override
	public Project createProject(Project newProject) {
		String sql = "INSERT INTO project (name, from_date, to_date) " +
				"VALUES (?, ?, ?) RETURNING project_id;";
		Long newProjectId = jdbcTemplate.queryForObject(sql, Long.class, newProject.getName(),
				newProject.getFromDate(), newProject.getToDate());
		return getProject(newProjectId.intValue());
	}

	@Override
	public void deleteProject(int projectId) {
		String deleteFromTimesheet = "DELETE FROM timesheet WHERE project_id = ?;";
		jdbcTemplate.update(deleteFromTimesheet,projectId);

		String deleteFromProjectEmp = "DELETE FROM project_employee WHERE project_id = ?;";
		jdbcTemplate.update(deleteFromProjectEmp,projectId);

		String sql = "DELETE FROM project " +
				"WHERE project_id = ?;";
		jdbcTemplate.update(sql,projectId);
	}

	private Project mapRowToProject(SqlRowSet rowSet) {
		Project project = new Project();
		project.setId(rowSet.getInt("project_id"));
		project.setName(rowSet.getString("name"));
		project.setFromDate(rowSet.getDate("from_date") == null ? null :
				rowSet.getDate("from_date").toLocalDate());
		project.setToDate(rowSet.getDate("to_date") == null ? null :
				rowSet.getDate("to_date").toLocalDate());
		return project;
	}

}
