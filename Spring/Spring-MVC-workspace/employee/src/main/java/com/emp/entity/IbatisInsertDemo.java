package com.emp.entity;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;

public class IbatisInsertDemo {

	public static void main(String[] args) throws IOException, SQLException {
		Reader rd =Resources.getResourceAsReader("SqlMapConfig.xml");
	}
}
