package com.auctions.db;

import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.Assert.fail;

@Log4j
public class ConnectionTests {

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    //RDS 접속 테스트
    public void testConnection1(){
        try(Connection con = DriverManager.getConnection(
                "Jdbc:oracle:thin:@bookauctionsdb.c9zecrxishwm.ap-northeast-2.rds.amazonaws.com:1521:ORACLE",
                "woojin",
                "12345678")) {

            log.info(con);
        }catch (Exception e){
            fail(e.getMessage());
        }
    }
}
