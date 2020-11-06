package com.foxrider;

public class StudentByMarks {
    private Student[] students;

    StudentByMarks(Student[] s){
        this.students = new Student[s.length];
        System.arraycopy(s,0,this.students,0,this.students.length);
    }

    public void getCleverStudents(int markOfCleverness) {

        for (Student student : students) {
            if (student.isCleverStudent(markOfCleverness)) {
                System.out.println(student.getName()+" "+student.getNumberOfGroup());
            }
        }
    }

}
