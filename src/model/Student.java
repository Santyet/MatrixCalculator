package model;

public class Student {

    private String name;
    private String age;
    private double average;
    private String studentId;

    public Student(String name, String age, double average, String studentId) {
        this.name = name;
        this.age = age;
        this.average = average;
        this.studentId = studentId;
    }
    
    public String toString(){

        return "\nStudent name: " + name + "\nStudent age: " + age + "\nStudent average: " + average + "\nStudent id: " + studentId + "\n";
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

}
