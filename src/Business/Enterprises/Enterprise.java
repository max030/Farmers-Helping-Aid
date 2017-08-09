/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;
/**
 *
 * @author Ishita
 */
   public abstract class Enterprise extends Organization{
   
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
    
    public enum EnterpriseType{
        GovtEnterprise ("GovtEnterprise"), BankEnterprise("Bank Enterprise");

        private String value;

        public String getValue() {
            return value;
        }

        private EnterpriseType(String value) {
            this.value=value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        @Override
        public String toString()
        {
          return value;  
        }
        
    }
    public Enterprise(String name,EnterpriseType enterpriseType) {
        super(name);
        this.enterpriseType=enterpriseType;
        organizationDirectory=new OrganizationDirectory();
    }
    public boolean checkOrganisationName(String name)
    {
        for(Organization o :organizationDirectory.getOrganizationList())
        {
            if(o.getName().equalsIgnoreCase(name))
            {
                return true;
            }
        }
        return false;
    }
   }