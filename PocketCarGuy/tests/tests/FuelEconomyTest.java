package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import pocketcarguy.FuelEconomyCalculator;
import pocketcarguy.GlobalVariables;


public class FuelEconomyTest {
    
    public FuelEconomyTest() {
         
    }
    
    @Test 
    public void  FuelEconomy(){
        float result;
        result = FuelEconomyCalculator.LP100KM(0f,0f);
        assertEquals(0.0f, result, GlobalVariables.FloatDelta);
        
        result = FuelEconomyCalculator.LP100KM(100f,1f);
        assertEquals(10000f, result, GlobalVariables.FloatDelta);
        
        result = FuelEconomyCalculator.LP100KM(1f,100f);
        assertEquals(1.0f, result, GlobalVariables.FloatDelta);

        result = FuelEconomyCalculator.LP100KM(7f,100f);
        assertEquals(7.0f, result, GlobalVariables.FloatDelta);

        result = FuelEconomyCalculator.LP100KM(17f,200f);
        assertEquals(8.5f, result, GlobalVariables.FloatDelta);        
        
    }
    
    
    
    @Test 
    public void  MPG(){
        float result;
        result = FuelEconomyCalculator.MPG(0f,0f);
        assertEquals(0.0f, result, GlobalVariables.FloatDelta);
        
        result = FuelEconomyCalculator.MPG(100f,1f);
        assertEquals(0.01f, result, GlobalVariables.FloatDelta);
        
        result = FuelEconomyCalculator.MPG(1f,100f);
        assertEquals(100.0f, result, GlobalVariables.FloatDelta);

        result = FuelEconomyCalculator.MPG(7f,100f);
        assertEquals(14.2857f, result, GlobalVariables.FloatDelta);

        result = FuelEconomyCalculator.MPG(17f,200f);
        assertEquals(11.7647f, result, GlobalVariables.FloatDelta);        
        
    }
}
