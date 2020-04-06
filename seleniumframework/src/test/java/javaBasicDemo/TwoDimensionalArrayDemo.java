package javaBasicDemo;

public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[][]= {
				{"name1","name2"},
				{"name3","name4"},
				{"name4","name5"},
				{"name6","name7"}
				};
		
		for (int i=0;i<names.length;i++) {
			System.out.println(names[i][0]+"\t"+names[i][1]);
		}

	}

}
