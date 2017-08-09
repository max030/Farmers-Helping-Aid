/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Network;
import Business.Enterprises.Enterprise;
import Business.Enterprises.EnterprisesDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
/**
 *
 * @author Ishita
 */
public class Network {
    private String cityname;
    private String year;
    private EnterprisesDirectory enterprisesDirectory;

    public Network() {
    enterprisesDirectory  =new EnterprisesDirectory();
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    

   

    public EnterprisesDirectory getEnterpriseDirectory() {
        return enterprisesDirectory;
    }

    @Override
    public String toString()
    {
       return cityname; 
    }
    
    public boolean checkUsername(String name) {
        
       if(enterprisesDirectory.checkEnterpriseUserName(name)==false)
       {   
        for (Enterprise e : enterprisesDirectory.getEnterpriseList()) {
            
            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equalsIgnoreCase(name)) {
                        return true;
                    }
                }
            }
        }
       }
       else if(enterprisesDirectory.checkEnterpriseUserName(name)==true)
       {
           return true;
       }
       
        return false;
       
    }
}