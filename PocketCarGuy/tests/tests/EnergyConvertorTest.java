
package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



import pocketcarguy.GlobalVariables;
import pocketcarguy.EnergyConvertor;




public class EnergyConvertorTest {
    
     public EnergyConvertorTest()
     {
     
     }


@Test
public void ConvertKWToHp(){
  float result;
        result = EnergyConvertor.ConvertKWToHP(0);
        assertEquals(0, result, GlobalVariables.FloatDelta);  
    
        result = EnergyConvertor.ConvertKWToHP(10);
        assertEquals(13.4102, result, GlobalVariables.FloatDelta);
        
        result = EnergyConvertor.ConvertKWToHP(-0);
        assertEquals(0, result, GlobalVariables.FloatDelta);
        
        
        result = EnergyConvertor.ConvertKWToHP(112);
        assertEquals(150.194, result, GlobalVariables.FloatDelta);
        
        result = EnergyConvertor.ConvertKWToHP(500);
        assertEquals(670.511, result, GlobalVariables.FloatDelta);
}

     
     
     
}
