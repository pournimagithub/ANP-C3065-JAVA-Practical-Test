package question1;

public class ArrayDemo {
	public void manipulateIntegerArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+5);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[1];
		arr[0]=1;
		ArrayDemo obj=new ArrayDemo();
		obj.manipulateIntegerArray(arr);

	}

}
