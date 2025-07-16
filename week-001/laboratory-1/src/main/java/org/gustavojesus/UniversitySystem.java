package org.gustavojesus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UniversitySystem {
    public static void main(String[] args) {
        // Create a new university
        University university = new University();

        // Add some students
        university.addStudent(new Student("Carlos", 8, new String[]{"Mat", "Fisica"}));
        university.addStudent(new Student("Maria", 9, new String[]{"Quimica", "Biologia"}));

        // Add courses to students
        university.addCourseToStudent(0, "Ciência da Computação");
        university.addCourseToStudent(1, "Mathematics");

        // Promote grades
        university.promoteGradeForStudent(0, 10);

        // List students by course
        System.out.println("Alunos no curso de 'Matematica': " + university.listStudentsByCourse("Matematica"));

        // List all students
        System.out.println(university.listAllStudents());
    }
}

/**
 * Represents a student in a university system.
 *
 * @author Gustavo Jesus
 */
class Student {
    private String name;
    private int grade;
    private String[] courses;

    /**
     * Constructs a new Student object with the given name, grade, and courses.
     *
     * @param name    the student's name
     * @param grade   the student's grade
     * @param courses the student's enrolled courses
     */
    public Student(String name, int grade, String[] courses) {
        this.name = name;
        this.grade = grade;
        this.courses = courses;
    }

    /**
     * Returns the student's name.
     *
     * @return the student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the student's name.
     *
     * @param name the new student's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the student's grade.
     *
     * @return the student's grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Sets the student's grade.
     *
     * @param grade the new student's grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Returns the student's enrolled courses.
     *
     * @return the student's enrolled courses
     */
    public String[] getCourses() {
        return courses;
    }

    /**
     * Sets the student's enrolled courses.
     *
     * @param courses the new student's enrolled courses
     */
    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    /**
     * Adds a new course to the student's enrolled courses.
     *
     * @param course the course to be added
     */
    public void addCourse(String course) {
        List<String> courseList = new ArrayList<>(Arrays.asList(courses));
        courseList.add(course);
        courses = courseList.toArray(new String[0]);
    }

    /**
     * Returns a string representation of the student's information.
     *
     * @return a string representation of the student's information
     */
    @Override
    public String toString() {
        return "Nome: " + name + ", Nota: " + grade + ", Cursos: " + String.join(", ", courses);
    }
}

/**
 * Represents a university system.
 *
 * @author Gustavo Jesus
 */
class University {
    private Student[] students;
    private int count;

    /**
     * Constructs a new University object with an initial capacity of 100 students.
     */
    public University() {
        students = new Student[100]; // Limit of 100 students for simplicity
        count = 0;
    }

    /**
     * Adds a new student to the university.
     *
     * @param student the student to be added
     */
    public void addStudent(Student student) {
        if (count < students.length) {
            students[count++] = student;
            System.out.println("📘 Estudante" + student.getName() + " adicionando com sucesso!");
        } else {
            System.out.println("⚠ Limite de estudantes.");
        }
    }

    /**
     * Assigns a course to a student at a given index.
     *
     * @param index  the index of the student in the university's student array
     * @param course the course to be assigned
     */
    public void addCourseToStudent(int index, String course) {
        if (index >= 0 && index < count) {
            students[index].addCourse(course);
            System.out.println("📚 Curso \"" + course + "\" para " + students[index].getName() + ".");
        } else {
            System.out.println("⚠ Indice invalido do estudante");
        }
    }

    /**
     * Updates the grade of a student at a given index.
     *
     * @param index    the index of the student in the university's student array
     * @param newGrade the new grade to be assigned
     */
    public void promoteGradeForStudent(int index, int newGrade) {
        if (index >= 0 && index < count) {
            students[index].setGrade(newGrade);
            System.out.println("⭐ Grade atualizada para " + students[index].getName() + ": " + newGrade);
        } else {
            System.out.println("⚠ Indice invalido do estudante");
        }
    }

    /**
     * Lists all students enrolled in a specific course.
     *
     * @param course the course to search for
     * @return a list of student names enrolled in the given course
     */
    public List<String> listStudentsByCourse(String course) {
        List<String> studentsInCourse = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (Arrays.asList(students[i].getCourses()).contains(course)) {
                studentsInCourse.add(students[i].getName());
            }
        }
        return studentsInCourse;
    }

    /**
     * Lists all students in the university.
     *
     * @return a string representation of all students in the university
     */
    public String listAllStudents() {
        StringBuilder result = new StringBuilder("\n### Nova lista de estudantes ###\n");
        for (int i = 0; i < count; i++) {
            result.append(students[i].toString()).append("\n");
        }
        return result.toString();
    }
}