/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author mahith
 */
public class CommunityDirectory {
    private ArrayList<Community> communityDirectory;

    public CommunityDirectory(){
        this.communityDirectory= new ArrayList<Community>();
    }
    
    public ArrayList<Community> getCommunityDirectory(){
        return communityDirectory;
    }
    
    public void setCommunityDirectory(ArrayList<Community> communityDirectory){
        this.communityDirectory= communityDirectory;
    }
    
    public Community addCommunity(){
        Community community = new Community();
        communityDirectory.add(community);
        return community;
    }
    
    public void deleteCommunity(Community community){
        communityDirectory.remove(community);
    }
    
    public Community getCommunity(String name){
        for(Community community:communityDirectory){
            if(community.getCommunity().equals(name)){
                return community;
            }
            
        }
        return null;
    }
}
