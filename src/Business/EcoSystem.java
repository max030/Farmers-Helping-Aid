/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import java.util.ArrayList;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author Megha
 */
public class EcoSystem extends  Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    
    public static EcoSystem getInstance()
    {
        if(business==null)
        {
            business=new EcoSystem();
        }
        return business;
    }

    
    public Network createAndAddNetwork()
    {
        Network  network=new Network();
        networkList.add(network);
        return network;
    }
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    private EcoSystem() {
        super(null);
        networkList=new ArrayList<>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesList=new ArrayList<Role>();
        rolesList.add(new SystemAdminRole());
        return rolesList;
        
        
          
    }
    
    public boolean checkUserNameIsUnique(String userName)
    {
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
        {
            return false;
        }
        
        for(Network network:networkList)
        {
            networkList.add(network);
        }
        return true;
    }
    
    public boolean checkNetworkName(String name)
    {
        for(Network n :networkList)
        {
            if(n.getCityname().equals(name))
            {
                return true;
            }
            
        }
        return false;
    }

    

    
}

