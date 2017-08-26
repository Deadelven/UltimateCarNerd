package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import pocketcarguy.QuarterMileCalculator;
import pocketcarguy.GlobalVariables;

/**
 *
 * @author Station1
 */
public class QuarterMileTest {
    
    public QuarterMileTest() {
         
    }
    
    @Test 
    public void  ConvertToFarenheight(){
        float result;
        result = QuarterMileCalculator.QuarterMileTime(1,1);
        assertEquals(7.579682f, result, GlobalVariables.FloatDeltaTime);
        
        result = QuarterMileCalculator.QuarterMileTime(0,1);
        assertEquals(0f, result, GlobalVariables.FloatDeltaTime);
        
        result = QuarterMileCalculator.QuarterMileTime(1,-0);
        assertEquals(0f, result, GlobalVariables.FloatDeltaTime);
        
        result = QuarterMileCalculator.QuarterMileTime(150,1200);
        assertEquals(15.14886f, result, GlobalVariables.FloatDeltaTime);
        
        result = QuarterMileCalculator.QuarterMileTime(280,1200);
        assertEquals(12.305938f, result, GlobalVariables.FloatDeltaTime);

    
}
}