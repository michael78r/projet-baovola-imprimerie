/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import models.Employee;

/**
 *
 * @author P14A_77_Michael
 */
public class InsertServices {
        public void setEmployee(Employee x)throws Exception{
        try{
            new Employee().setEmployee(x);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{}
    }
}
