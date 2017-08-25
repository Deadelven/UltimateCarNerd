
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
        assertEquals(13.41, result, GlobalVariables.FloatDelta);
        
        result = EnergyConvertor.ConvertKWToHP(-0);
        assertEquals(0, result, GlobalVariables.FloatDelta);
        
        
        result = EnergyConvertor.ConvertKWToHP(500);
        assertEquals(670.5, result, GlobalVariables.FloatDelta);
}

    


@Test
public void ConvertHPToKW(){
  float result;
        result = EnergyConvertor.ConvertHPToKW(0);
        assertEquals(0.0f, result, GlobalVariables.FloatDelta);  
    
        result = EnergyConvertor.ConvertHPToKW(10);
        assertEquals(7.4569f, result, GlobalVariables.FloatDelta);
        
        result = EnergyConvertor.ConvertHPToKW(-0);
        assertEquals(0, result, GlobalVariables.FloatDelta);
        
        
        result = EnergyConvertor.ConvertHPToKW(500);
        assertEquals(372.8500f, result, GlobalVariables.FloatDelta);
}

     
     
}
