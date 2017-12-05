/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tes;

import connection.DBConnect;
import org.junit.Test;

/**
 *
 * @author Annisa
 */
public class tesconnect {
    
    @Test
    public void getConnection() throws Exception {
        System.out.println(DBConnect.getInstance().getConnection());
    }
}
