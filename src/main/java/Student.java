import java.util.ArrayList;

public class Student {

    private static long counter;
    public String name;
    public long id;
    public ArrayList<Integer> grades;

    public Student() {
        counter ++;
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage() {
        double sum =0;
        for (int grade : grades){
            sum += grade;
        }
        return sum/grades.size();
    }

    public void updateGrade() {

    }

    public void deleteGrade() {

    }

}
