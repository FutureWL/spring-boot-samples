package io.github.futurewl;

public class Tom {
    public void studyJavaCourse() {
        System.out.println("Tom 在学习 Java 的课程");
    }

    public void studyPythonCourse() {
        System.out.println("Tom 在学习 Python 的课程");
    }

    public void study(ICourse course) {
        course.study();
    }
}
