package com;

import java.util.Date;

/**
 * Created by zf on 2017/2/27.
 */
public class RobotAnswer {
    private int result;
    private String content;
    private String answer;

    public RobotAnswer() {
    }

    public String getAnswer() {
        if (result == 0) {
            answer = "AI：" + "\n" + content;
        } else {
            answer = ".....";
        }
        return answer;
    }
}
