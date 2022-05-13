package model;

public class Student {

    private String name;
    private String age;
    private double average;
    private String studentId;
    private String[][] notes;

    public Student(String name, String age, double average, String studentId) {
        this.name = name;
        this.age = age;
        this.average = average;
        this.studentId = studentId;
    }
    
    public String toString(){

        return "\nStudent name: " + name + "\nStudent age: " + age + "\nStudent average: " + average + "\nStudent id: " + studentId + "\n";
    }

    public void fillNotes(String subject1, String subject2, String subject3, String nameNote1, String nameNote2, String nameNote3){

		notes[0][0] = "";
		notes[0][1] = "\t\t" + subject1;
		notes[0][2] = "\t" + subject2;
		notes[0][3] = "\t" + subject3;

		notes[1][0] = nameNote1;
		notes[2][0] = nameNote2;
		notes[3][0] = nameNote3;

	}

    public void assignNotes(double note1,double note2,double note3,double note4,double note5,double note6,double note7,double note8,double note9){

        


    }
   

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return double return the average
     */
    public double getAverage() {
        return average;
    }

    /**
     * @param average the average to set
     */
    public void setAverage(double average) {
        this.average = average;
    }

    /**
     * @return String return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    /**
     * @return String return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }


    public void setNotes(double note1,double note2,double note3,double note4,double note5,double note6,double note7,double note8,double note9){



    }

}
