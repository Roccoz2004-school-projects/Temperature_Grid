package dev.rocco;

import java.util.Arrays;
public class TemperatureGrid
{
    private double [][] temps;

    public TemperatureGrid(double [][]nums)
    {
        temps = nums;
    }
    private double computeTemp(int row, int col)
    {
        return 0.0;
    }
    private boolean updateAllTemps(double tolerance)
    {
        return false;
    }
    public static void main(String[] y)
    {
        double [][] myTemps = {{95.5,100.0,100.0,100.0,100.0,110.3},
                {0.0,50.0,50.0,50.0,50.0,0.0},{0.0,40.0,40.0,40.0,40.0,0.0},
                {0.0,20.0,20.0,20.0,20.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}};
        print2DArray(myTemps);
        TemperatureGrid myGrid = new TemperatureGrid(myTemps);
        System.out.println(myGrid.computeTemp(2,3));
        System.out.println(myGrid.computeTemp(1,1));
        System.out.println(myGrid.computeTemp(0,2));
        System.out.println(myGrid.computeTemp(1,3));
        //print2DArray(myGrid.temps);



    }
    public static void print2DArray(double [][]nums)
    {
        for(int index = 0; index < nums.length; index++)
        {
            for(int index2 = 0;index2 < nums[0].length;index2++)
            {
                System.out.print(nums[index][index2] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static double findSum(double [][] nums)
    {
        double mySum = 0.0;
        for(int index = 0; index < nums.length; index++)
        {
            for(int index2 = 0; index2 < nums[0].length; index2++)
            {
                mySum = mySum + nums[index][index2];
            }

        }
        return mySum;
    }
}
