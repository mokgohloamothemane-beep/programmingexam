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