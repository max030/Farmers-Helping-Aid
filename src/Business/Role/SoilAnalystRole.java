/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprises.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SoilAnalystOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.SoilAnalystRole.SoilAnalystWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Ishita
 */
public class SoilAnalystRole extends Role{
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SoilAnalystWorkAreaJPanel(userProcessContainer, account ,(SoilAnalystOrganization)organization, enterprise,  business );
    }
}
