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


import pocketcarguy.VolumeConvertor;
import pocketcarguy.GlobalVariables;
/**
 *
 * @author Station1
 */
public class VolumeConverterTest {
    
    public VolumeConverterTest() {
    }
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void ConvertLitersToGallons(){
        float result;
        
        result = VolumeConvertor.ConvertLitersToGallons(1);
        assertEquals(0.264172f, result, GlobalVariables.FloatDelta);
        
        result = VolumeConvertor.ConvertLitersToGallons(2);
        assertEquals(0.528344f, result, GlobalVariables.FloatDelta);
        
        result = VolumeConvertor.ConvertLitersToGallons(0);
        assertEquals(0.0f, result, GlobalVariables.FloatDelta);
        
        result = VolumeConvertor.ConvertLitersToGallons(10);
        assertEquals(2.64172f, result, GlobalVariables.FloatDelta);
        
        result = VolumeConvertor.ConvertLitersToGallons(15);
        assertEquals(3.96258f, result, GlobalVariables.FloatDelta);
        
        result = VolumeConvertor.ConvertLitersToGallons(-1.26f);
        assertEquals(-0.3328568, result, GlobalVariables.FloatDelta);
        
        result = VolumeConvertor.ConvertLitersToGallons(-0);
        assertEquals(0, result, GlobalVariables.FloatDelta);
        
        
    }
}
