package com.cdr.bc.restApiBC.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestDao {
	
	@Autowired
	DataSource datasource;
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	
}
