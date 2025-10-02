import java.util.*;
public class Assignment4{
    public static int rain_water_trapping(int height[]){
        int n=height.length-1;
        int res=0,l=0,r=n-1;
        int rmax=height[r];
        int lmax=height[l];
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax,height[l]);
                res+=lmax-height[l];
            }else{
                r--;
                rmax+=rmax-height[r];
            }
        }
        return res;
    
    }
    public static void main(String args[]){
        int array[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rain_water_trapping(array));
    }    
}