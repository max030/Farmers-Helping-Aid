/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EmployeeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ishita
 */
public class EmployeeOrganization extends Organization{
    
    public EmployeeOrganization() {
        super(Organization.Type.EmployeeOrganization.getValue());  
}
    
    
    
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EmployeeRole());
        return roles;
    }
    
}
