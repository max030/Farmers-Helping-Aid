/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprises.Enterprise;
import Business.Organization.Organization;
import Business.Organization.WeatherAnalystOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.WeatherAnalystRole.WeatherAnalystWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Ishita
 */
public class WeatherAnalystRole extends Role {

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new WeatherAnalystWorkAreaJPanel(userProcessContainer, account , enterprise,(WeatherAnalystOrganization)organization  ,business); //To change body of generated methods, choose Tools | Templates.
    }
  
       
}
