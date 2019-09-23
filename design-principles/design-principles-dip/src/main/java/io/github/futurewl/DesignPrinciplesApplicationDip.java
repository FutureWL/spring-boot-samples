package io.github.futurewl;

public class DesignPrinciplesApplicationDip {
    public static void main(String[] args) {
        Tom tom = new Tom();
//        tom.studyJavaCourse();
//        tom.studyPythonCourse();
        tom.study(new JavaCourse());
        tom.study(new PythonCourse());
    }
}
