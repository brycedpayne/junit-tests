import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private static Scanner scanner = new Scanner(System.in);
    private static long counter;
    public String name;
    public long id;
    public ArrayList<Integer> grades;

    public Student() {
        counter++;
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

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void updateGrade() {
        int index = -1;
        System.out.println(grades.toString());
        System.out.print("Which grade would you like to change?: ");
        int gradeToChange = scanner.nextInt();
        System.out.print("What is the new grade?: ");
        int newGrade = scanner.nextInt();

        for (int grade : grades) {
            index++;
            if (gradeToChange == grade) {
                grades.set(index,newGrade);
                System.out.println("Grade was changed to " + grade);
                break;
            }
        }
        System.out.println(grades);
    }

    public void deleteGrade() {
        System.out.println(grades.toString());
        System.out.print("Which grade would you like to remove?: ");
        int gradeToRemove = scanner.nextInt();

        for (int grade : grades) {
            if (gradeToRemove == grade) {
                grades.remove((Integer) grade);
                System.out.println("Grade was removed");
                break;
            }
        }
        System.out.println(grades);
    }

}
