/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucaandolina
 */
public class TowersOfHanoi {
    
    
   private int totalDisks; 
   private int counter = 0;

           
   
   
   public TowersOfHanoi() {
       this(3);
   }
   
   public TowersOfHanoi(int disk) {
       totalDisks = disk; 
       
   }
    
   public void startA() {
           
   
            firstSolver(totalDisks, 1, 2, 3 );
            System.out.println("Tower of size " + totalDisks + " solved with " + counter + " recursive calls using the first solveTowers method. ");
                    
   }
         
      private void firstSolver(int numberOfDisks, int start, int temp, int end){
    if (numberOfDisks == 1) {
		System.out.println("Disk " + numberOfDisks +  " from " + start + " to " + end);
    } else { 
		firstSolver(numberOfDisks - 1, start, end, temp);               
		System.out.println("Disk " + numberOfDisks + " from " + start + " to " + end);
                firstSolver (numberOfDisks - 1, temp, start, end);
		
                    
         }
    counter++;
    

}
        
      
      public void startB() {
          
          
          firstSolver(totalDisks, 1, 2, 3 );
            System.out.println("Tower of size " + totalDisks + " solved with " + counter + " recursive calls using the first solveTowers method.");
      }      
          
          private void secondSolver(int numberOfDisks, int start, int temp, int end) {
if (numberOfDisks > 0)
                    secondSolver(numberOfDisks -1, start, end , temp);
                    System.out.println("Disk " + numberOfDisks + " from " + start + " to " + end);
                    secondSolver(numberOfDisks - 1, temp, start, end);
          
}
          
            
}
          
          
          
          
          
          
      
      
      
      
      
      
      

