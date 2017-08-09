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
public class GovtEnterprise extends Enterprise {
    
    
    public GovtEnterprise(String name) {
        super(name, EnterpriseType.GovtEnterprise);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        
    return null;
    }

    
    
    
    
}
