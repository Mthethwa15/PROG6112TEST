/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Student
 */

public class ConsoleReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarations and initializations
            String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
            
            // Two Dimensional Array for console sales
                int sales[][] = {
                    {1000, 2000, 3000},
                    {2000, 3000, 4000},
                    {1500, 1100, 1200},
                    };
                    //Single dimensional array to store sales for each city
                        int[] cityTotal = new int[cities.length];
                         //Nested Loop for calculation 
                            for(int i = 0; i < sales.length; i++)
                            {
                                for(int j=0; j < sales[i].length; j++){
                                    }
                            }
                            //City with the most Sales
                                int highestSales = cityTotal[0];
                                int highestCityIndex = 0;
                                    for(int i = 0; 0 < cityTotal.length; i++)
                                    {
                                        if(cityTotal[i]> highestSales){
                                            highestSales = cityTotal[i];
                                            highestCityIndex = i;
                                            
                                                //Display Report
                                                    System.out.println("Gaming Console Report");
                                                        
                                                    
                                                    
                                        }
                                    }
                            
                }

    
}
