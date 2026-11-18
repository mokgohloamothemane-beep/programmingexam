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