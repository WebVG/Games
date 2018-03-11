/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon.guide.helper;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fluxu
 */
public class DungeonGuideHelper {
    
    public static void instructions(){
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("Dungeon Guide Helper");
        System.out.println("_____________________");
        System.out.println(":::::::::::::options:::::::::::::");
        System.out.println(":main::npc::items::monsters::map:");
        System.out.println(":::::::::::::::exit::::::::::::::");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        instructions();
        Scanner scan = new Scanner(System.in);
        String option; // use this to change menu you are in
        option = scan.nextLine();
        
        do{
            switch(option){
                case "main":
                    instructions();
                    option = scan.nextLine();
                    break;
                case "npc":
                    System.out.println("The NPC creator"); // prompt, take input for action
                    npcTemp npc = new npcTemp();
                    npc.makeName();
                    npc.stats();
                    npc.classType();
                    System.out.println(npc.toString());
                    option = scan.nextLine();
                    break;
                case "items":
                    System.out.println("item shop interface");
                    option = scan.nextLine();
                    break;
                case "monsters":
                    System.out.println("monster generator");
                    monTemp mon = new monTemp();
                    mon.stats();
                    mon.classType();
                    System.out.println(mon.toString());
                    option = scan.nextLine();
                    break;
                case "map":
                    System.out.println("the map");
                    int x = args.length >= 1 ? (Integer.parseInt(args[0])) : 8;
                    int y = args.length == 2 ? (Integer.parseInt(args[1])) : 8;
                    map map = new map(x, y);
                    map.display();
                    option = scan.nextLine();
                    break;
            }
        }while(!"exit".equals(option));
    }
    
}
