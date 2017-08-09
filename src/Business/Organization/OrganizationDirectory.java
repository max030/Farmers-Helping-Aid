/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Ishita
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.FarmerOrganization.getValue())){
            organization = new FarmerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.EmployeeOrganization.getValue())){
            organization = new EmployeeOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.Type.SoilAnalystOrganization.getValue())){
            organization = new SoilAnalystOrganization();
            organizationList.add(organization);
        }

         else if (type.getValue().equals(Organization.Type.WeatherAnalystOrganization.getValue())){
            organization = new WeatherAnalystOrganization();
            organizationList.add(organization);
        }
    
        return organization;
}
    
}