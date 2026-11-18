/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matresssalesreport;

/**
 *
 * @author Student
 */
public class  products implemets Iproducts {
    // single arrays storing tthe names of products
    private String[]productNames = {"cozy nights monarch",
                                     "restonic barbados",
                                     "sealy phuket"};
    
    // storing the sales over the past three months 
    private int [][] sales ={{25,18,20},
                             {15,10,12},
                             {18,15,20}};
    
    //method to calculate the total products sold
    
    public int GetTotalPoductsSOLD(){
        
        for(int row = 0;row<sales.length;row++){
            for(int col =0 ;col<sales[row].length;col++){
                total+=sales[row][col];
                
                //method to calculate average 
                public double GetAverageProductSold(){
        double total = 0;
        int row = 0;
        double average = total/(double)sales[row].length;
                return total /9.0;
            }
                //getting the most popular product 
                public void GetMostPopularProduct(){
                    int highestSales=0;
                    String popularProduct="";
                    for (int row =0;row<sales.length;row++);
                    int productTotal =0 ;
        int row = 0;
                    for (int col =0;col<sales[row].length;col++);
        int col = 0;
                    
                    productTotal+= sales[row][col];
                }
                if(productTotal>highestSales){
                highestales=productTotal ;
                popularProduct= productnames[row];
}
        }
    return popularProduct+(""+highestSales+"");
    
}
}

