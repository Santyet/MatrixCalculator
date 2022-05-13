package ui;

import java.util.Scanner;

import model.MatrixCalculator;



public class Main {
	
	private Scanner sc;
	private MatrixCalculator calculator;
	
	public Main(){
		sc= new Scanner(System.in);
		calculator = new MatrixCalculator();
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to the matrix calculator");
		Main ppal= new Main();
		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Main menu, please pick an option\n" +
				"(1) Create a matrix \n" +
				"(2) Show the contents of all matrices \n"+
				"(3) Numeric matrices\n"+
				"(4) String matrices\n" + 
				"(5) Create student\n" + 
				"(6) Show all students names\n" +
				"(7) Search student from id\n"  +
				"(0) To leave the application"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			createMatrix();
			break;
		case 2:
			System.out.println(calculator.showMatrices());
			break;
	
		case 3:
			createNumericMatrix();
			break;

		case 4:
			createStringMatrix();
			break;

		case 5:
			createStudent();
		break;

		case 6:
			System.out.println(calculator.showNames());
		break;

		case 7:
			searchFromId();
		break;

		case 8:
			System.out.println(calculator.showList());
		
		default:
			System.out.println("Error, wrong option");
		
		}
	

	}

	private void createMatrix() {
		System.out.println("Please select the type of matrix \n (1) Numeric matrix\n (2) String's matrix");
		int type= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please digit the number of rows");
		int rows= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please digit the number of columns");
		int columns= sc.nextInt();
		sc.nextLine();

		
		int[][] code = new int[rows][columns];
		
		System.out.println("new matrix");
		System.out.println(calculator.createMatrix(type, rows, columns));
	}
	
	public void createNumericMatrix() {
		
		int row, col, num;
		
		System.out.println("Digite el num de filas");
		row= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite el num de columnas");
		col= sc.nextInt();
		sc.nextLine();
		
		int [][] tmp= new int[row][col];

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.println( "What is the number you want to register in the " + i + 
					" " + j + " pos");
				num= sc.nextInt();
				sc.nextLine();
				tmp[i][j]=num;
			}
		}
		calculator.addNumeric(tmp);
		
		
	}

	public void createStringMatrix(){

		int row, col;
		String str;
		
		System.out.println("Digite el num de filas");
		row= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite el num de columnas");
		col= sc.nextInt();
		sc.nextLine();
		
		String [][] tmp= new String[row][col];

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.println( "What is the String you want to register in the " + i + 
					" " + j + " pos");
				str= sc.nextLine();
				tmp[i][j]=str;
			}
		}
		calculator.addString(tmp);
		
	}

	public void createStudent(){

		String name, studentId;
		String age;
		double average;

		System.out.println("Please type the student's name:");
		name = sc.nextLine();

		System.out.println("Please type the student's age:");
		age = sc.nextLine();

		System.out.println("Please type the student's average:");
		average = Double.parseDouble(sc.nextLine());

		System.out.println("Please type the student's id:");
		studentId = sc.nextLine();

		System.out.println(calculator.addStudent(name, age, average, studentId));
	}

	public void searchFromId(){

		String id;

		System.out.println("Please type the id of the student:");
		id = sc.nextLine();

		System.out.println(calculator.searchFromId(id));
	}

	public void askForNotes(){

		double note1,note2,note3,note4,note5,note6,note7,note8,note9;
		String nameSubject1, nameSubject2, nameSubject3, id, nameNote1, nameNote2, nameNote3, nameNote4, nameNote5, nameNote6, nameNote7, nameNote8, nameNote9;

		System.out.println("Please type the id of the student:");
		id = sc.nextLine();

		System.out.println("Please type the name of the first subject: ");
		nameSubject1 = sc.nextLine();

		System.out.println("Please type the name of the note 1:");
		nameNote1 = sc.nextLine();

		System.out.println("Please type the " + nameSubject1 + " " + nameNote1 + " grade:");
		note1 = Double.parseDouble(sc.nextLine());

		System.out.println("Please type the name of the note 2:");
		nameNote2 = sc.nextLine();

		System.out.println("Please type the second" + nameSubject1  + " " + nameNote2 + "grade:");
		note1 = Double.parseDouble(sc.nextLine());

		System.out.println("Please type the name of the note 3:");
		nameNote3 = sc.nextLine();

		System.out.println("Please type the third" + nameSubject1 + " " + nameNote3 + " grade:");
		note1 = Double.parseDouble(sc.nextLine());


		//CONTINUAR DESDE AQUI!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11
		System.out.println("Please type the name of the second subject: ");
		nameSubject2 = sc.nextLine();

		System.out.println("Please type the first" + nameSubject2 + " mid term:");
		note1 = Double.parseDouble(sc.nextLine());

		System.out.println("Please type the second" + nameSubject2 + " mid term:");
		note1 = Double.parseDouble(sc.nextLine());

		System.out.println("Please type the third" + nameSubject2 + " mid term:");
		note1 = Double.parseDouble(sc.nextLine());

		System.out.println("Please type the name of the second subject: ");
		nameSubject3 = sc.nextLine();

		System.out.println("Please type the first" + nameSubject3 + " mid term:");
		note1 = Double.parseDouble(sc.nextLine());

		System.out.println("Please type the second" + nameSubject3 + " mid term:");
		note1 = Double.parseDouble(sc.nextLine());

		System.out.println("Please type the third" + nameSubject3 + " mid term:");
		note1 = Double.parseDouble(sc.nextLine());

		calculator.fillNotes(id, nameSubject1, nameSubject2, nameSubject3, note1, note2, note3);




	}

}
