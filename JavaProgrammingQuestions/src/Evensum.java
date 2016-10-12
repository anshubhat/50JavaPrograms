//write a program to find sum of only even numbers in a given array?
public class Evensum {
	
	//write a program to find sum of only even numbers in a given array?


			Object[] input = {4,8,5,'f','g',7,10};  //4+8+10

			public static int evenSum(Object[] arr){
			    int sum=0;
			    if(null !=arr && arr.length>0){
			    for(int i=0; i<arr.length; i++)
			    {
			        int input = (int)arr[i];
			        if(input%2 == 0 && Character.isDigit(input) ){
			         sum = sum+input;
			        }
			    }
			    }else{
			    System.out.println("arr is empty or null-please provide valid input");
			    }
			    return sum;
			}

			
			public static void maint(String[] args){

				evenSum(null);
}
}