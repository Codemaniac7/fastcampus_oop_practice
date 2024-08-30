package org.example3;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }
    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    public double calculateGrade() {
//      (학점수 * 교과목 평점)의 합계
        double totalMultipliedCreditAndCoursesGrade = courses.multiplyCreditAndCourseGrade();

//        수강신청 총 학점 수
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return totalMultipliedCreditAndCoursesGrade / totalCompletedCredit;
    }
}
