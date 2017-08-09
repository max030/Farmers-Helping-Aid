/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;
import Business.Organization.FarmerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Ishita
 */

public class EnterprisesDirectory {
    private ArrayList<Enterprise> enterpriseList;
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterprisesDirectory() {
    
    enterpriseList=new ArrayList<Enterprise>();
    }
    
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type)
    {Enterprise enterprise=null;
    if(type==Enterprise.EnterpriseType.GovtEnterprise)
        {
        enterprise=new GovtEnterprise(name);
        enterpriseList.add(enterprise);
        
    }
   
    else if(type==Enterprise.EnterpriseType.BankEnterprise)
        {
        enterprise=new BankEnterprise(name);
        enterpriseList.add(enterprise);
        }
    
    return enterprise;
    }
    
    public boolean checkEnterprise(String name)
    {
    for(Enterprise e : enterpriseList)
    {
        if (e.getName().equalsIgnoreCase(name))
        {
            return true;
        }
    }
    return false;
    }
    
    public boolean checkEnterpriseUserName(String name) {
        for (Enterprise e : enterpriseList) {
            for (UserAccount us : e.getUserAccountDirectory().getUserAccountList()) {
                if (us.getUsername().equalsIgnoreCase(name)) {
                    return true;
                }
                for(Organization o : e.getOrganizationDirectory().getOrganizationList())
                {
                    for(UserAccount ua:o.getUserAccountDirectory().getUserAccountList())
                    {
                        if(ua.getUsername().equalsIgnoreCase(name))
                        {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

    

    
    
    
    
    