package javaBasicDemo;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Regular for loop
		int score[]= {10,20,30,40,50,60};
		for (int i=0; i<score.length;i++) {
			System.out.println(score[i]);
		}
		//For Each Loop
		for(int i:score) {
			System.out.println(i);
			
		}
		

	}

}
