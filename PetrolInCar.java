package pkg;

import java.util.Scanner;

public class PetrolInCar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentpetrol;
		String petrolbunks = new String();
		int n;
		Scanner in = new Scanner(System.in);
		Scanner on = new Scanner(System.in);
		System.out.println("Petrol in car:");
		currentpetrol = in.nextInt();
		System.out.println("Petrol bunks:");
		petrolbunks = on.nextLine();
		n = petrolbunks.length()-(petrolbunks.length()/2);
		int distances[] = new int[n];
		System.out.println("Distances of each petrol bunk:");
		for(int i=0;i<n;i++){
			distances[i]=in.nextInt();
		}
		System.out.println("Capacities of each petrol bunk:");
		int capacities[] = new int[n];
		for(int i=0;i<n;i++){
			capacities[i]=in.nextInt();
		}
		
		boolean flag = false;
		for(int i=0;i<n;i++){
			if(currentpetrol>distances[i]){
				currentpetrol=currentpetrol-distances[i]+capacities[i];
			}
			else{
				System.out.println("Cannot travel... Out of petrol!!!");
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("Remaining petrol in car is "+ currentpetrol+ " litres");
		
	}

}
