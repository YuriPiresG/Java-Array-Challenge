import java.util.Scanner;
import java.util.Arrays;
public class ArrayChallMethods {

	private int[] myUnsortedArray = new int[5];
	private int[] mySortedArray = new int[5];
	public Scanner sc = new Scanner(System.in);

	
	
	public void getIntegers() {
		System.out.println("Please select 5 numbers: ");
		
		for(int i=0;i<5;i++) {
			myUnsortedArray[i]=sc.nextInt();
		}

	}

	public void sortIntegers() {
		this.mySortedArray=myUnsortedArray.clone();
		Arrays.sort(mySortedArray);
		for(int i = 0; i < mySortedArray.length / 2; i++)
		{
		    int temp = mySortedArray[i];
		    mySortedArray[i] = mySortedArray[mySortedArray.length - i - 1];
		    mySortedArray[mySortedArray.length - i - 1] = temp;
		}
		}
	
	public void printArray() {
		System.out.println("Unsorted Array: "+Arrays.toString(myUnsortedArray));
		System.out.println("Sorted Array(Desc values): "+Arrays.toString(mySortedArray));
	}
	
}
