package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import pocketcarguy.PowerToWeightCalculator;
import pocketcarguy.GlobalVariables;

public class PowerToWeightTest {
    
    public PowerToWeightTest() {
         
    }
    
    @Test 
    public void  ConvertToFarenheight(){
        float result;
        result = PowerToWeightCalculator.KWPerTon(0f, 0f);
        assertEquals(32.0f, result, GlobalVariables.FloatDelta);


    }
}
