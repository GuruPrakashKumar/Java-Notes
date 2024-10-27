/**
 * calculate left max boundary - array
 * calculate right max boundary - array
 * 
 * loop
 * waterLevel = min(leftmax bound, right max bound)
 * trapped water = waterLevel - height[i]
 */


public class trappedRainwater {
    public int trap(int[] height) {
        if(height.length == 1 || height.length == 2){//because for trapping water minimum 2 boundaries are required
            return 0;
        }
        //auxiliary arrays
        int leftMax[] = new int[height.length];//for saving the left max boundaries
        int rightMax[] = new int[height.length];//for saving the right max boundaries
        leftMax[0] = height[0];
        for(int i = 1; i < height.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        // for(int i = 0; i < height.length; i++){
        //     System.out.print(leftMax[i]+" ");
        // }
        // System.out.println();
        rightMax[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        // for(int i = 0; i < height.length; i++){
        //     System.out.print(rightMax[i]+" ");
        // }

        int wt = 0;//water trapped
        for(int i = 0;i<height.length;i++){
            //water level = w
            int w = Math.min(leftMax[i], rightMax[i]);
            if((w-height[i]) > 0){//we don't want to take negative values
                wt+= w-height[i];
            }
            
        }
        return wt;
    }
    public static void main(String[] args) {
        
    }   
}