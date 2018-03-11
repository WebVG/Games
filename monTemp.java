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
public class monTemp {
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
    
    public void stats(){
        
        Random r = new Random();
        int[] stats = r.ints(6, 8, 15).toArray();
        setStat(stats);
    }
    
    public void classType(){
        String[] classList = {"Undead", "Beast", "Flying", "Demon", "Elemental", "Construct"};
        int index = classList.length;
        for(int i = 0; i < index; i++){
            int rand = (int) (Math.random() * index);
            String classType = classList[rand];
             setType(classType);
        }
    }
    
    @Override
    public String toString(){
        return "Enemy name: " + name + " " + Arrays.toString(stats) + "  Enemy class:" + type;
    }
    
}
