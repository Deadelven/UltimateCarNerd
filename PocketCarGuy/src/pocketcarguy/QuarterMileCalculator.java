
package pocketcarguy;

import pocketcarguy.WeightConvertor;


public class QuarterMileCalculator {
    
    
    //Weight in KG Converted to LB for the measurement
    public static float QuarterMileTime(float HP, float KG)
    {
    if(HP == 0 || KG == 0) return 0;
    
    else
    {
    float LB = WeightConvertor.KGToLbConvertor(KG);
    return (float) ((Math.pow((LB/HP),0.333)) * 5.825);
    
    }
    
    }
}
