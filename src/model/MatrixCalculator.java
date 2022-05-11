package model;

import java.util.ArrayList;
import java.lang.Math;

public class MatrixCalculator {
	
	private ArrayList<int[][]> numericMatrices;
	private ArrayList<String[][]> stringMatrices;
	private Student[][] studentMatrices;
	private ArrayList<Student> studentInfo;
	private String[][] studentList;
	
	public MatrixCalculator() {

		numericMatrices= new ArrayList<int[][]>() ;
		stringMatrices= new ArrayList<String[][]>();
		studentMatrices = new Student[10][10];
		studentInfo = new ArrayList<Student>();
	
		
	}
	
	public String showMatrices() {
		String out="";
		out += "Numeric matrices \n";
		for(int i=0; i< numericMatrices.size(); i++) {
			out+= printNumeric(numericMatrices.get(i));
		}
		out += "String matrices \n";
		for(int i=0; i< stringMatrices.size(); i++) {
			out+= printString(stringMatrices.get(i));
		}
		
		return out;
	}

	private String printString(String[][] matrix) {
		String print ="";

		for (int i=0; i< matrix.length; i++ ) { // filas numbers.length
			for (int j = 0; j < matrix[0].length; j++) { //columnas numbers[0].length
				print += matrix[i][j] + " ";
			}
			print += "\n";
		}

		return print;
	}

	private String printNumeric(int[][] numbers) {
		String print ="";
		for (int i=0; i< numbers.length; i++ ) { // filas numbers.length
			for (int j = 0; j < numbers[0].length; j++) { //columnas numbers[0].length
				print += numbers[i][j] + " ";
			}
			print += "\n";
		}
		return print;
	}
	
	

	public String createMatrix(int type, int rows, int columns) {
		String out="";
		switch(type) {
		case 1: //numeric Matrix
			int [][] newMatrix;
			newMatrix= new int[rows][columns];
			
		for (int i=0; i<rows  ; i ++) {
			for (int j=0; j<columns  ; j++) {
				int random = (int)(Math.random()*101)+1;
				newMatrix[i][j]=random;
			  }
		  }
			numericMatrices.add(newMatrix);
			out = printNumeric(newMatrix);
			
			break;
		case 2:

			String [][] newMatrixString;
			newMatrixString= new String[rows][columns];
			for (int i=0; i<rows  ; i ++) {
				for (int j=0; j<columns  ; j++) {
					int random = (int)(Math.random()*90-65)+65;
					char temp = (char)random;
					String str = ""+temp;
					newMatrixString[i][j]=str;
				  }
			  }
			stringMatrices.add(newMatrixString);
			out = printString(newMatrixString);
			
		}
		
		return out;
		
	}
	
	public void addNumeric (int[][] numMatrix) {
		numericMatrices.add(numMatrix);
	}

	public void addString (String [][] StringMatrix){
		stringMatrices.add(StringMatrix);
	}

	public String addStudent(String name, String age, double average, String studentId){

		Student newStudent;
		boolean done = false;
			newStudent= new Student(name, age, average, studentId);
			for (int i=0; i<10  ; i ++) {
				for (int j=0; j<10  ; j++) {
					if(studentMatrices[i][j]==null & done==false){

						studentMatrices[i][j] = newStudent;
						done = true;
						studentInfo.add(newStudent);
					}
				  }
			  }		

		return "\nStudent was added.\n";
	}

	public String showNames(){

		String out = "\nSTUDENTS NAMES:\n\n";

		for (int i=0; i<10  ; i ++) {
			for (int j=0; j<10  ; j++) {
				if(studentMatrices[i][j]!=null){

					out += studentMatrices[i][j].getName() + "\n";
			 	 }
		  	}	

		}
	
	return out;
	}

	public String searchFromId(String id){

		String name = "\nStudent doesn't exists...\n";
		boolean done = false;

		for (int i=0; i<10  ; i ++) {
			for (int j=0; j<10  ; j++) {
				if(studentMatrices[i][j]!=null & done==false){

					if(studentMatrices[i][j].getStudentId().equals(id)){

						name = studentMatrices[i][j].toString();

						done = true;
					}

				}
		  	}	

		}

		return name;
	}

	public void studentList(){

		studentList = new String[studentInfo.size()][5];
		fillList();

		for(int i = 1; i<studentInfo.size()-1; i++){
			for(int j = 1;j<5;j++){

				if(studentList[i][j]==null){

					studentList[i][j] = studentInfo.get(i-1).getName();

				}
				if(studentList[i][j+1]==null){

					studentList[i][j+1] = studentInfo.get(i-1).getAge();

				}

				if(studentList[i][j+2]==null){

					studentList[i][j+2] = studentInfo.get(i-1).getStudentId();
				}

				
				if(studentList[i][j+3]==null){

					studentList[i][j+3] = studentInfo.get(i-1).getStudentId();
				}


			}
		}

		/*for(int i = 0;i<5;i++){
			for(int j = 0;j<studentInfo.size();j++){

				out+= studentList[i][j];
			}
		}
		*/
	}


	public String showList(){

		String out = "\nSTUDENTS INFO\n";

		studentList();

		for (int i=0; i< studentList.length; i++ ) { // filas numbers.length
			for (int j = 0; j < studentList[0].length; j++) { //columnas numbers[0].length
				out += studentList[i][j] + " ";
			}
			out += "\n";
		}
		return out;
	}

	public void fillList(){

		studentList[0][0] = "";
		studentList[0][1] = "\t\tName";
		studentList[0][2] = "\tAge";
		studentList[0][3] = "\tAverage";
		studentList[0][4] = "\tID";

		for(int i = 1; i<studentInfo.size();i++){

			studentList[i][0] = "Student " + i;
		}

	}

	

}
