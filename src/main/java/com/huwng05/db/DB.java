package com.huwng05.db;

import com.huwng05.db.connector.MySqlConnector;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class DB {
   protected Connection conn;
   protected DB() {
       try {
           Class.forName(this.getDriver());
       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       }
   }
   protected abstract String getDriver();

   public Connection connect() {
       return this.conn;
   };

   public void close() throws SQLException {
       if (this.conn != null) {
           this.conn.close();
       }
   };
}
