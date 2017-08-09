/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprises.Enterprise;
import Business.Organization.EmployeeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.EmployeeRole.EmployeeWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author Ishita
 */
public class EmployeeRole extends Role{
  
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new EmployeeWorkAreaJPanel(userProcessContainer, account ,(EmployeeOrganization)organization, enterprise,  business );
    }
}
