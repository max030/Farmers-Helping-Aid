/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.employee;

/**
 *
 * @author Ishita
 */
public class Employee {
 
    private String name;
    private int id;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    
    
    
         public enum Type{
        BankEmployee("Bank Employee");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

    
    
         }   
    
    
    @Override
    public String toString() {
        return name;
    }
    
    
    
    
    
    
}
