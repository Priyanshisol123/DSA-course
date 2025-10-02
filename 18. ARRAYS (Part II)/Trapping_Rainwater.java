import java.util.*;

public class Trapping_Rainwater{
    public static int trappedRainwater(int height[]){
        // Step 1: Calculate Leftmax boundary-array
        int n=height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1 ]);
        }

        // Step 2: Calculate Rightmax boundary-array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        // Step 3: Loop
        int trappedWater=0,waterLevel;
        for(int i=0;i<n;i++){
            // Find waterlevel=min(leftmax boundary,rightmax boundary)
            waterLevel= Math.min(leftMax[i],rightMax[i]);

            // trapped water=water level - height[i]
            trappedWater +=waterLevel-height[i];
        }
        // Step 4: Exit
        return trappedWater;
    }

    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped water="+trappedRainwater(height));
    }
}