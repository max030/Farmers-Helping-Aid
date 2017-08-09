/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprises.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdministrativeRole.AdminWorkAreaJPanel;
import UserInterface.BankAdminWorkArea.BankAdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

    public class AdminRole extends Role{


        
        
        
        
        
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
       
        
        for(Organization.Type type :Organization.Type.values()){
                if(enterprise.getEnterpriseType()==Enterprise.EnterpriseType.BankEnterprise){
                return new BankAdminWorkAreaJPanel(userProcessContainer,organization, enterprise,account, system);
                
                }
                else if(enterprise.getEnterpriseType()==Enterprise.EnterpriseType.GovtEnterprise){
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise, system);
                
                        }
       
    }


return null;
    }   
    }