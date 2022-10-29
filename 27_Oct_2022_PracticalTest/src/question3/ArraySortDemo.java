package question3;

import java.util.Arrays;

public class ArraySortDemo {
	void sortArray(float[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j]) {
					float temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			System.out.println(array[i]);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				ArraySortDemo obj=new ArraySortDemo();
				float arr[]= {12.3f,23.5f,7.6f,42.7f};
				obj.sortArray(arr);
	}
}
