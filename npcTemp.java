/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon.guide.helper;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Fluxu
 */
public class npcTemp {
    String name;
    int[] stats;
    String type;
    
    public void setName(String n){
        this.name = n;
    }
    public void setStat(int[] s){
        this.stats = s;
    }
    public void setType(String t){
        this.type = t;
    }
    
    public void makeName(){
        String[] Beginning = { "Kr", "Ca", "Ra", "Mrok", "Cru",
         "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
         "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
         "Mar", "Luk" };
        String[] Middle = { "air", "ir", "mi", "sor", "mee", "clo",
         "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
         "marac", "zoir", "slamar", "salmar", "urak" };
        String[] End = { "d", "ed", "ark", "arc", "es", "er", "der",
         "tron", "med", "ure", "zur", "cred", "mur" };
   
        Random rand = new Random();
        setName(Beginning[rand.nextInt(Beginning.length)] + 
            Middle[rand.nextInt(Middle.length)]+
            End[rand.nextInt(End.length)]);
    }
    
    public void stats(){
        
        Random rand = new Random();
        int[] stats = rand.ints(6, 8, 15).toArray();
        setStat(stats);
    }
    
    public void classType(){
        String[] classList = {"Bowman", "Man-at-Arms", "Archer", "Scrub", "Urchin", "Mercenary", "Thief", "Rouge", "Commoner"};
        int index = classList.length;
        for(int i = 0; i < index; i++){
            int rand = (int) (Math.random() * index);
            String classType = classList[rand];
             setType(classType);
        }
    }
    @Override
    public String toString(){
        return "npc name: " + name + " " + Arrays.toString(stats) + "  npc class:" + type;
    }
    
    
}
