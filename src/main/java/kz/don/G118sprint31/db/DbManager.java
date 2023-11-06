package kz.don.G118sprint31.db;

import kz.don.G118sprint31.model.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DbManager {
    @Getter
    private static List<Student> students = new ArrayList<>();

    private static Long id = 3L;

    static {
        students.add(new Student(1L, "Alizhan", "Alizhan", 20, "F"));
        students.add(new Student(2L, "Elnur", "Elnur", 80, "B"));
    }

    private static void calculateMark(Student student) {
        var exam = student.getExam();
        if (student.getExam() == null) {
            return;
        }
        if (exam >= 90) {
            student.setMark("A");
        } else if (exam >= 75) {
            student.setMark("B");
        } else if (exam >= 65) {
            student.setMark("C");
        } else if (exam >= 50) {
            student.setMark("D");
        } else {
            student.setMark("F");
        }
    }

    public static void addStudent(Student student) {
        if (student==null) {
            return;
        }
        calculateMark(student);
        student.setId(id);
        students.add(student);
        id++;
    }
}
