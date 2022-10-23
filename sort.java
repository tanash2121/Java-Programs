import java.util.*;

class sort{


public static void display(int arr[]){

for(int i =0 ;i<arr.length;i++){

System.out.println(arr[i]);

}

}

public static void main(String [] args){

int arr[] = {1,5,2,4,2};

for(int i =0 ; i<arr.length-1 ; i++){

for(int j = 0 ; j<arr.length-i-1 ; j++){
				

if(arr[j]>arr[j+1]){

int tem = arr[j];
arr[j]=arr[j+1];
arr[j+1]=tem;
}


			}
			
		}
		display(arr);

	}

}