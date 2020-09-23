/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucaandolina
 */
public class TestClass {
    
    public static void main(String[] args) 
	{
    
            System.out.println("Compare the two solveTowers methods for 3 disks:");
           //Create Tower of hanoi object That will take 3 disks
            TowersOfHanoi firstTower = new TowersOfHanoi(3) ;
            firstTower.startA();
            
            System.out.println("Compare the two solveTowers methods for 3 disks:");
             //Create Tower of hanoi object That will take 3 disks
             TowersOfHanoi secondTower = new TowersOfHanoi(4) ;
              secondTower.startB();
            
            
    
    
    
}
}