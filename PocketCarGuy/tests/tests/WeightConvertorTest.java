package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



import pocketcarguy.GlobalVariables;
import pocketcarguy.WeightConvertor;




public class WeightConvertorTest {
    
     public WeightConvertorTest()
     {
     
     }


@Test
public void ConvertKGToLB(){
  float result;
        result = WeightConvertor.KGToLbConvertor(0);
        assertEquals(0, result, GlobalVariables.FloatDelta);  
    
        result = WeightConvertor.KGToLbConvertor(10);
        assertEquals(22.0499f, result, GlobalVariables.FloatDelta);
        
        result = WeightConvertor.KGToLbConvertor(-0);
        assertEquals(0, result, GlobalVariables.FloatDelta);
        
        
        result = WeightConvertor.KGToLbConvertor(500);
        assertEquals(1102.5f, result, GlobalVariables.FloatDelta);
}



@Test
public void ConvertLBToKG(){
  float result;
        result = WeightConvertor.LBToKGConvertor(0);
        assertEquals(0, result, GlobalVariables.FloatDelta);  
    
        result = WeightConvertor.LBToKGConvertor(10);
        assertEquals(4.536f, result, GlobalVariables.FloatDelta);
        
        result = WeightConvertor.LBToKGConvertor(-0);
        assertEquals(0, result, GlobalVariables.FloatDelta);
        
        
        result = WeightConvertor.LBToKGConvertor(500);
        assertEquals(226.8f, result, GlobalVariables.FloatDelta);
}
}

