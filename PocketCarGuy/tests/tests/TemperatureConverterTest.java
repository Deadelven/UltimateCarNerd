/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import pocketcarguy.TemperatureConvertor;
import pocketcarguy.GlobalVariables;

/**
 *
 * @author Station1
 */
public class TemperatureConverterTest {
    
    public TemperatureConverterTest() {
         
    }
    
    @Test 
    public void  ConvertToFarenheight(){
        float result;
        result = TemperatureConvertor.ConvertToFarenheight(0);
        assertEquals(32.0f, result, GlobalVariables.FloatDelta);
        
        
        result = TemperatureConvertor.ConvertToFarenheight(1);
        assertEquals(33.8f, result, GlobalVariables.FloatDelta);
        
        
        result = TemperatureConvertor.ConvertToFarenheight(5);
        assertEquals(41.0f, result, GlobalVariables.FloatDelta);
        
        
        result = TemperatureConvertor.ConvertToFarenheight(15);
        assertEquals(59.0f, result, GlobalVariables.FloatDelta);
        
        
        result = TemperatureConvertor.ConvertToFarenheight(100);
        assertEquals(212.0f, result, GlobalVariables.FloatDelta);
        
        
        result = TemperatureConvertor.ConvertToFarenheight(-1);
        assertEquals(30.2f, result, GlobalVariables.FloatDelta);
        
        
        result = TemperatureConvertor.ConvertToFarenheight(-0);
        assertEquals(32.0f, result, GlobalVariables.FloatDelta);
        
        
        result = TemperatureConvertor.ConvertToFarenheight(3.3f);
        assertEquals(37.94f, result, GlobalVariables.FloatDelta);
        
        
        result = TemperatureConvertor.ConvertToFarenheight(-3.3f);
        assertEquals(26.06f, result, GlobalVariables.FloatDelta);
    }
    
    @Test 
    public void  ConvertToCelsius(){
        float result;
        
        result = TemperatureConvertor.ConvertToCelcius(32);
        assertEquals(0, result, GlobalVariables.FloatDelta);
        
        
        result = TemperatureConvertor.ConvertToCelcius(-0);
        assertEquals(-17.7778, result, GlobalVariables.FloatDelta);

        result = TemperatureConvertor.ConvertToCelcius(-3.8f);
        assertEquals(-19.8889, result, GlobalVariables.FloatDelta);
        
        result = TemperatureConvertor.ConvertToCelcius(1234.5678f);
        assertEquals(668.093222222, result, GlobalVariables.FloatDelta);
        
    }
}
