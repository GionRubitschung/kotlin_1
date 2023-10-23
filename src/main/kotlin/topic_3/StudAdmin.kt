package topic_3

import kotlin.random.Random

class Course {
    private val students = ArrayList<Student>()

    fun addStudent(student: Student) {
        students.add(student)
    }

    fun removeStudent(student: Student) {
        students.removeIf { it.id == student.id }
    }

    fun numberOfStudents() = students.size

    fun averageGrade() = students.sumOf { it.grade } / students.size

    override fun toString(): String {
        var content = "${numberOfStudents()} students in this course\n"
        content += "Average grade: ${averageGrade()}\n"
        content += "Students in this course:\n"
        for (student in students) content += "- $student\n"
        return content
    }
}

class Student(id: String, grade: Double) {
    var id = id
        private set

    var grade = grade
        private set(value) {
            if (value < 1.0 || value > 6.0) throw Error("Grade has to be between 1.0 and 6.0")
            field = value
        }

    override fun toString() = "Student $id has grade $grade"
}

fun main() {
    val course = Course()
    val students = ArrayList<Student>()

    for (stud in 1..Random.nextInt(20, 100)) {
        val student = Student("$stud", Random.nextDouble(1.0, 6.0))
        course.addStudent(student)
        students.add(student)
    }

    println(course.toString())

    val randomStudent = students.random()
    println("Number of students in course before student ${randomStudent.id} gets removed: ${course.numberOfStudents()} with average grade: ${course.averageGrade()}")
    course.removeStudent(randomStudent)
    println("Number of students in course after student ${randomStudent.id} got removed: ${course.numberOfStudents()} with average grade: ${course.averageGrade()}")

    println(course.toString())
}