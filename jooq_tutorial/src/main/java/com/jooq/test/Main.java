package com.jooq.test;

//For convenience, always static import your generated tables and
//jOOQ functions to decrease verbosity:
import static test.generated.Tables.POSTS;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class Main {
	public static void main(String[] args) {
		Connection conn = null;

		String userName = "test";
		String password = "password";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			
			DSLContext create = DSL.using(conn, SQLDialect.ORACLE);
			Result<Record> result = create.select().from(POSTS).fetch();
			
			for (Record r : result) {
				BigDecimal id = r.getValue(POSTS.ID);
				String title = r.getValue(POSTS.TITLE);
				String body = r.getValue(POSTS.BODY);
				Timestamp postTimestamp = r.getValue(POSTS.POST_TIMESTAMP);

				System.out.println("ID: " + id + 
									", title: " + title + 
									", body: " + body + 
									", post_timestamp: " + postTimestamp);
			}
			
		} catch (Exception e) {
			// For the sake of this tutorial, let's keep exception handling
			// simple
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ignore) {
				}
			}
		}
	}
}