/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.WeatherAnalystRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ishita
 */
public class WeatherAnalystOrganization extends Organization{
 
    
    public WeatherAnalystOrganization() {
        super(Organization.Type.WeatherAnalystOrganization.getValue());  
}
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WeatherAnalystRole());
        return roles;
    }
}
