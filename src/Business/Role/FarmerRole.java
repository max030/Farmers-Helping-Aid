/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprises.Enterprise;
import Business.Organization.FarmerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.FarmerRole.FarmerBankReqstJPanel;
import UserInterface.FarmerRole.FarmerGovtrequstJPanel;
import UserInterface.FarmerRole.FarmerWorkRequestJPanel;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Ishita
 */
public class FarmerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FarmerGovtrequstJPanel(userProcessContainer,userAccount, (FarmerOrganization) organization, enterprise);
    }
    }
