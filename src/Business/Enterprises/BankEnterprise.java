/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ishita
 */
public class BankEnterprise extends Enterprise{

    public BankEnterprise(String name) {
        super(name, EnterpriseType.BankEnterprise);
    }

 @Override
    public ArrayList<Role> getSupportedRole() {
        
    return null;
    }
    
    
}
