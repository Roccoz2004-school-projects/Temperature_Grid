package dev.rocco;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.abs;

public class TemperatureGrid
{
    private double [][] temps;
    public static double [][] myTemps = {{95.5,100.0,100.0,100.0,100.0,110.3},{0.0,50.0,50.0,50.0,50.0,0.0},
            {0.0,40.0,40.0,40.0,40.0,0.0}, {0.0,20.0,20.0,20.0,20.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}};

    public TemperatureGrid(double [][]nums)
    {
        temps = nums;
    }

    public static void main(String[] y)
    {
        print2DArray(myTemps);
        TemperatureGrid myGrid = new TemperatureGrid(myTemps);
        System.out.println(myGrid.computeTemp(2,3));
        System.out.println(myGrid.computeTemp(1,1));
        System.out.println(myGrid.computeTemp(0,2));
        System.out.println(myGrid.computeTemp(3,4));
        System.out.println(myGrid.updateAllTemps(0.9));
    }

    private double computeTemp(int row, int col) {
        double newNum = 0.0;
        if (row == 0 || row == 4 || col == 0 || col == 5) {
            newNum = myTemps[row][col];
        } else {
            newNum = findArithmeticMean(row, col);
        }
        return newNum;
    }

    public static double findArithmeticMean(int a, int b) {
        //Find number above, below, right, and left
        double above = myTemps[a - 1][b];
        double below = myTemps[a + 1][b];
        double left = myTemps[a][b - 1];
        double right = myTemps[a][b + 1];
        //Calculate mean for numbers
        double mean = (above + below + left + right) / 4.0;
        return mean;
    }

    public static double[][] newGrid = {{0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0},
            {0.0,0.0,0.0,0.0,0.0,0.0}, {0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0}};

    private boolean updateAllTemps(double tolerance)
    {
        boolean bool = true;
        double difference;
        for(int index = 0; index < myTemps.length; index++)
        {
            for(int index2 = 0; index2 < myTemps[0].length; index2++)
            {
                difference = newGrid[index][index2] - computeTemp(index, index2);
                if (!(abs(difference) <= tolerance)) {
                    bool = false;
                }
                newGrid[index][index2] = computeTemp(index, index2);
            }
        }
        System.out.println("\nNew Grid:");
        print2DArray(newGrid);
        return bool;
    }


    public static void print2DArray(double [][]nums)
    {
        for(int index = 0; index < nums.length; index++)
        {
            for(int index2 = 0; index2 < nums[0].length; index2++)
            {
                System.out.print(nums[index][index2] + "  ");
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
