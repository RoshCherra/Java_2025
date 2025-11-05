import java.util.ArrayList;

class Student {
    private String id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getId() { // дістаємо Id студента
        return id;
    }

    public void addGrade(int grade) { // дістаємо оцінку студента
        grades.add(grade);
    }

    @Override
    public String toString() { // змінюємо метод toString() на зручний нам
        return "Id: " + id + "; Name: " + name + "; Grades: " + grades;
    }
}