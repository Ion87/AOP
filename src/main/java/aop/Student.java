package aop;

public class Student {
    private String name;
    private int course;
    private double avgGrage;

    public Student(String name, int course, double avgGrage) {
        this.name = name;
        this.course = course;
        this.avgGrage = avgGrage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", avgGrage=" + avgGrage +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrage() {
        return avgGrage;
    }

    public void setAvgGrage(double avgGrage) {
        this.avgGrage = avgGrage;
    }
}
