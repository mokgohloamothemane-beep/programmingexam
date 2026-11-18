[productmatress.java](https://github.com/user-attachments/files/35027556/productmatress.java)[main.java](https://github.com/user-attachments/files/35027538/main.java)# programmingexam
[Iproducts.java](https://github.com/user-attachments/files/35027508/Iproducts.java)
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
    return popularProduct+(""+highestSales+"");/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matresssalesreport;

/**
 *
 * @author Student
 */
class Product {
    public interface products {
    int GetTotalProductsSold();
    double GetAverageProductSold();
    String GetMostPopularProduct();
    
}

}

    
}
}[Product.java](https://github.com/user-attachments/files/35027531/Product.java)
[Uploadi/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.matresssalesreport;

/**
 *
 * @author Student
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product product  = new Product();
        
        PrintProduct report = new PrintProduct();
        report.PrintReport(report);
    }
    
}
ng main.java…]()[printproduct.java](https://github.com/user-attachments/files/35027552/printproduct.java)

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matresssalesreport;

/**
 *
 * @author Student
 */
public class printproduct {
    //printing total sales
   
    public void PrintTotalSales(int total){
        System.out.println("Total product sales"+total);
        
        //print average sales
        public void PrintAverageSales(double average){
            System.out.println("Average sales "+ average);
        }
        //print most popular prduct
        public void PrintPopularProduct(String product){
            System.out.println("Most popular product " + most popular product)
        }
        //print the report
        public void printreport(product product){
            System.out.println("product sales report");
             System.out.println("---------------------------");
             PrintTotalSales(product. GetTotalPoductsSOLD);
                     PrintAverageSales(product.GetAverageProductSold);
                      PrintPopularProduct(product. GetMostPopularProduct);
                     
   
    }
    
}
[/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.matresssalesreport;

/**
 *
 * @author Student
 */
public class productmatress extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(productmatress.class.getName());

    /**
     * Creates new form productmatress
     */
    public productmatress() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        txtmatressoption = new javax.swing.JComboBox<>();
        txtcustomername = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRODUCT APP  FOR MATRESS");

        jTextField1.setText("customer name");

        jTextField2.setText("select product");

        jTextField3.setText("enter price");
        jTextField3.addActionListener(this::jTextField3ActionPerformed);

        txtmatressoption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cozy nights monarch;restonic barbados", "sealy phuket" }));

        jButton1.setText("process");

        jButton2.setText("clear");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtmatressoption, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtmatressoption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        public interface IProductsCalculations{
            double GetVat();
            double GetCommison();
            double GetTotal();
        }
        import javax.swing*;
        import java.awt;
        import java.io.FileWriter;
        import java.ioException;
        import java.io.PrintWriter;
        
        
        ///process sale method
        private void ProcessSale(){
            txtCustomerName.getText().trim();
            String productName = cmbProduct.getSelectedItem();toString();
            String priceText = txtPrice.getText().trim();
            
            //getting customer name
            if (customerBame.isEmpty()){
                jOptionpane.showmessagedialogue(this,"please enter customer name");
                return;
            }
            //checking price 
            double price;
            Double.parseDouble(priceText);
            if(price<=0){
                jOptionpane.showmessagedialogue(this,"price must be greater than zero");
                return;
                String customerName;
              
                    //displaying results 
                    String message = "customer name"+customerName+
                                     "\nProduct: " +productName+
                                     "n\VAT:"+vat+
                                     "n\commission"+commission+
                                      "\nTotal"+total;
                                      jOptionpane.showmessagedialogue(this,message);
                                      
                                      //save sale information 
                                      SaveToFile(customername,productName,vat,commision,total);
                                      
                                      //save data to data.txt
                                      private void savetofile(String customerName);
                                      
                
            }
        }
    }//GEN-LAST:event_jTextField3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new productmatress().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtcustomername;
    private javax.swing.JComboBox<String> txtmatressoption;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
Uploading productmatress.java…]()
[productTest.java](https://github.com/user-attachments/files/35027572/productTest.java)

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


 *
public class  productTest{
    public void GetTotalPoductsSOLD_withvaliddata_returnscorrectvalue(){
         Product product  = new Product();
         int Expected =153;
         int actual =product. GetTotalPoductsSOLD();
         assertsEquals(Expected,actual);
         
          public void GetAverageSales_withvaliddata_returnscorrectvalue(){
               double Expected =153;
        double  actual =product. GetaveragePoductsSOLD();
         assertsEquals(Expected,actua,0.001);
         
              
          }

    private void assertsEquals(int Expected, int actual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
                 
    }
}
[test.java](https://github.com/user-attachments/files/35027577/test.java)
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package PRODUCTcalculations;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public void GetVat_WithValidData_ReturnCorrectValue)(){

ProductCalculations calculations = new ProductCalculations(3500);
  double Expected =525.0;
        double  actual =calculations.GetVat();
         assertsEquals(Expected,actua,0.001);
}



