//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {  // перевіримо чи працють створені класи коректно
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook(); // створили книгу

        // стоврюємо студентів
        Student s1 = new Student("001", "Iryna");
        s1.addGrade(100);
        s1.addGrade(90);
        Student s2 = new Student("002", "Kate");
        s2.addGrade(99);
        Student s3 = new Student("003", "John");
        s3.addGrade(99);
        s3.addGrade(100);
        s3.addGrade(60);

        // додаємо студентів
        gradeBook.addStudent(s1);
        gradeBook.addStudent(s2);
        gradeBook.addStudent(s3);

        // виводимо студентів
        System.out.println("GradeBook:");
        gradeBook.printStudents();

        // шукаємо студента
        gradeBook.findStudent("001");
        gradeBook.findStudent("005");
        gradeBook.findStudent("002");

        // видаляємо студента
        gradeBook.removeStudent("003");
        System.out.println("GradeBook:");
        gradeBook.printStudents();

    }
}