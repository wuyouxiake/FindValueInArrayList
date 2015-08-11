import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class FindValue {
	public static void main(String[] args){
		Random r = new Random();
		int ran_num;
		Scanner in=new Scanner(System.in);
		int valueToFind;
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<10;i++){
			ran_num = 1 + r.nextInt(50);
			list.add(ran_num);
		}
		for(int i=0;i<10;i++){
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		System.out.println("Value to find: ");
		valueToFind=in.nextInt();
		int count=0;
		for(int i=0;i<10;i++){
			if(list.get(i)==valueToFind){
				count++;
				//System.out.println(valueToFind+" is in the array list.");
			}else{
			}
		}
		if(count==0){
			System.out.println(valueToFind+" was not found.");
		}else{
			System.out.println(valueToFind+" was found "+count+" times.");
		}
		
	}
}
