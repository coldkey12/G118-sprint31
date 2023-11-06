package kz.don.G118sprint31.controller;

import kz.don.G118sprint31.db.DbManager;
import kz.don.G118sprint31.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        List<Student> students = DbManager.getStudents();
        model.addAttribute("students", students);
        return "home";
    }

    @GetMapping("/add-student")
    public String addStudentPage() {
        return "addStudent";
    }

    @PostMapping("/add-student")
    public String addStudent(Student student){
        DbManager.addStudent(student);
        return "redirect:/";
    }

}
