package workingwitharrays;
import java.util.Arrays; 
import java.awt.Dimension;

public class main {

	public static void main(String[] args) {
		int totalNum =0;
		int dArraytol=0;
		int[] intarray={17,15,12,23,10,80,78,83,49,27}; // implimenting array
		 
		 for(int i=0;i<intarray.length;i++) { // loop to calculate average
			 totalNum=totalNum + intarray[i];
		 }
		 int averageArr= totalNum /intarray.length;
		
		 System.out.println("Welcome to my array Project part 1");
		 System.out.print("Your average for the Array : ");  //orining out and formatting
		 System.out.println(averageArr);  
		 System.out.print("The max amout in this array: ");
		 int maxVal=getMax(intarray);
		 System.out.println(maxVal);
		 System.out.print("The min amout in this array: ");
		 int minVal=getMin(intarray);
		 System.out.println(minVal);
		 Arrays.sort(intarray);
		 System.out.print("The number from low to high in this array: ");
		 System.out.print(Arrays.toString(intarray));
		 reverse(intarray,intarray.length);
		 System.out.println("Welcome to the secone part of this program 3D Arrays");
		 
		 
		 int[][] dArray={ //multidemensial array formatting
			 {22,33,24,8,16},{30,45,28,12,90}
		 };
		 
		 for(int row=0;row<dArray.length;row ++) {
			for (int col=0; col<dArray[row].length; col++) {
				dArraytol=dArraytol+dArray[row][col];// looping through array
			}
		 }
		     System.out.println("The total of this Multi Dimension Array  : ");
	         System.out.println(dArraytol); 
	         System.out.println("The max of this Multi Dimension Array  : ");
	         System.out.println(getMaxValue(dArray));
	         System.out.println("The min of this Multi Dimension Array  : ");
	         System.out.println(getMinValue(dArray));
	     
	         for(int row=0;row<dArray.length;row ++) {
	 			for (int col=0; col<dArray[row].length; col++) {
	 			
	 			if(dArray[row][col]%2 	!=0) {
	 				int val = dArray[row][col];
	 				
	 			Dimension result=new Dimension(biSearch(dArray,val));
	 			System.out.println("\nThe odd number " + val + " was found at the index " + result.width + "," + result.height);
	 			 
	 			 }
	 			
	 			}
	         }
	 			
	         
}

	 public static int getMax(int[] maxArray){ // the get max funtion
		    int maxnum = maxArray[0]; 
		    for(int i=1;i < maxArray.length;i++){ 
		      if(maxArray[i] > maxnum){ 
		         maxnum = maxArray[i]; 
		      } 
		    } 
		    return maxnum; 
		  }

	  public static int getMin(int[] minArray){ 
		    int minVal = minArray[0]; // the getmin
		    for(int i=1;i<minArray.length;i++){ 
		      if(minArray[i] < minVal){ 
		        minVal = minArray[i]; 
		      } 
		    } 
		    return minVal; 
		  } 

	  static void reverse(int a[], int n) 
	    { // this algeithum reverse the string 
	        int[] b = new int[n]; 
	        int j = n; 
	        for (int i = 0; i < n; i++) { 
	            b[j - 1] = a[i]; 
	            j = j - 1; 
	        } 
	        System.out.println();
	        System.out.println("\nReversed array is: \n"); 
	        for (int k = 0; k < n; k++) { 
	            System.out.print(" "); 
	            System.out.print(b[k]);
	            
	        } 
	    } 
	  public static int getMaxValue(int[][] numbers) {
	        int maxValue = numbers[0][0]; // this is the max on a multidemensial array
	        for (int j = 0; j < numbers.length; j++) {
	            for (int i = 0; i < numbers[j].length; i++) {
	                if (numbers[j][i] > maxValue) {
	                    maxValue = numbers[j][i];
	                }
	            }
	        }
	        return maxValue;
	    }

	    public static int getMinValue(int[][] numbers) {// this is the min on a multidemensial array
	        int minValue = numbers[0][0];
	        for (int j = 0; j < numbers.length; j++) {
	            for (int i = 0; i < numbers[j].length; i++) {
	                if (numbers[j][i] < minValue ) {
	                    minValue = numbers[j][i];
	                }
	            }
	        }
	        return minValue ;
	    }
	    

	  private static Dimension biSearch(int[][] arry, int target) {// I need to add a library inorder to use this
	      Dimension result=new Dimension(-1,-1);

	      int j=0;

	      int numberOfArrays=arry.length;

	      if(numberOfArrays<=0)
	           return result;


	      for(int i=0; i<numberOfArrays;i++)
	       {

	         Arrays.sort(arry[i]);                    //as we are using a binary search the array must be sorted first
	                                                  //or the correct answer may not be found. As a result the 
	         j=Arrays.binarySearch(arry[i], target);  //the array will be sorted and the array indexes of
	                                                  
	        if(j>-1)
	           {
	              result.width=i;
	              result.height=j;
	              break;
	            }
	      }

	     return result;
	    }
}