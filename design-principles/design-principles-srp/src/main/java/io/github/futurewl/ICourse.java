package io.github.futurewl;


/**
 * 单一职责的错误例子
 * <p>
 * 拆成
 * <p>
 * ICourseInfo
 * ICourseManager
 */
public interface ICourse {

    // 获得基本信息
    String getCourseName();

    // 获得视频流
    byte[] getCourseVideo();

    // 学习课程
    void studyCourse();

    // 退款
    void refundCourse();
}
