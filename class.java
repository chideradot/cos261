public class Student {
    // Properties (Fields)
    private String name;
    private String matricNumber;
    private double score;

    // Constructor
    public Student(String name, String matricNumber, double score) {
        this.name = name;
        this.matricNumber = matricNumber;
        this.score = score;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatricNumber() {
        return matricNumber;
    }

    public void setMatricNumber(String matricNumber) {
        this.matricNumber = matricNumber;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Matric Number: " + matricNumber);
        System.out.println("Score: " + score);
    }
}
