package LABS;
import java.util.Random;

public class Lab_1 {

	public static void main(String[] args) {
		Random random = new Random();
		int array[] = new int[5];
		for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(100 - (-100)) + (-100);
		System.out.print ("������ �������� ������:");
        for (int i = 0; i < array.length; i++) 
            System.out.print (" " + array[i]); 
        System.out.print("\n\n������� �䒺���� �������� ������ = "+ dobutok(array));
        System.out.print("\n���� �������� ������, ������������ ���� ���������� �������� = "+ sumElem(array));
	}
	public static int dobutok(int arr[]) {
        int dob = 1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]<0) {
                dob*=arr[i];
            }
        }
        return dob; 
        }
	public static int sumElem(int arr[]) {
        int indx = 0;
        int sum = 0;
        int count = arr[0];
        for (int i = 0; i<arr.length; i++) {
              if (Math.abs(arr[i]) < Math.abs(count)) {
                   count = arr[i]; 
              }
              if(count==arr[i]){
                  indx = i;
              }
            }
        for(int j = indx+1; j<arr.length; j++){
            sum+=arr[j];
        }
        return sum; 
        }
}