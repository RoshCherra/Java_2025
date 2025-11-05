import java.util.HashMap;

class GradeBook {
    private HashMap<String, Student> students;

    public GradeBook() {
        students = new HashMap<>();
    }

    public void addStudent(Student student) { // додаємо студентів за Id
        students.put(student.getId(), student);
    }

    public void removeStudent(String id) { // видаляємо студентів за Id
        students.remove(id);
    }

    public void findStudent(String id) {
        Student student = students.get(id);
        if (student == null) {
            System.out.println("There is no such student :(");
        } else {
            System.out.println(student);
        }
    }

    public void printStudents() { // виводимо всіх студентів з їх оцінками
        for (Student s : students.values()) {
            System.out.println(s);
        }

    }
}