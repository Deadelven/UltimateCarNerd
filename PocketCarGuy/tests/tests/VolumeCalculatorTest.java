package tests;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import pocketcarguy.VolumeCalculator;
import pocketcarguy.GlobalVariables;


public class VolumeCalculatorTest {
    
    public VolumeCalculatorTest()
    {
        
    }
    
    @Test 
    public void  CalculateCylinderVolume(){
        double result;
        result = VolumeCalculator.CalculateCylinderVolume(0f,0f);
        assertEquals(0d, result, GlobalVariables.FloatDelta);
        
        result = VolumeCalculator.CalculateCylinderVolume(86f,86f);
        assertEquals(499.5572d, result, GlobalVariables.FloatDelta);
        
        result = VolumeCalculator.CalculateCylinderVolume(-0f,86f);
        assertEquals(0d, result, GlobalVariables.FloatDelta);
        
        result = VolumeCalculator.CalculateCylinderVolume(50f,50f);
        assertEquals(98.17472d, result, GlobalVariables.FloatDelta);
        
    }
    
    @Test 
    public void  CalculateEngineVolume(){
        double result;
        result = VolumeCalculator.CalculateEngineVolume(0f,0f,0);
        assertEquals(0d, result, GlobalVariables.FloatDelta);
        
        result = VolumeCalculator.CalculateEngineVolume(86f,86f,4);
        assertEquals(1998.2288d, result, GlobalVariables.FloatDelta);
        
        result = VolumeCalculator.CalculateEngineVolume(-0f,86f,50);
        assertEquals(0d, result, GlobalVariables.FloatDelta);
        
        result = VolumeCalculator.CalculateEngineVolume(50f,50f,12);
        assertEquals(1178.0972d, result, GlobalVariables.FloatDelta);
        
    }
    
    @Test 
    public void  CalculateCubeVolume(){
        double result;
        result = VolumeCalculator.CalculateCubeVolume(0f,0f,0f);
        assertEquals(0d, result, GlobalVariables.FloatDelta);
        
        result = VolumeCalculator.CalculateCubeVolume(86f,86f,86f);
        assertEquals(636056f, result, GlobalVariables.FloatDelta);
        
        result = VolumeCalculator.CalculateCubeVolume(-0f,86f,50f);
        assertEquals(0d, result, GlobalVariables.FloatDelta);
        
        result = VolumeCalculator.CalculateCubeVolume(50f,50f,12f);
        assertEquals(30000f, result, GlobalVariables.FloatDelta);
        
    }   
    
    
    
}
