package com;

import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by zf on 2017/2/27.
 */
public class MainUI {
    private JFrame jFrame;
    private JPanel jPanel;
    private JButton sendMsgBtn;
    private JTextArea msgTextArea;
    private JTextArea historyTextArea;
    private static String MSG;
    private static StringBuilder history = new StringBuilder();

    public MainUI() {
        jFrame = new JFrame("自动聊天");
        jPanel = new JPanel();
        sendMsgBtn = new JButton("发送");
        msgTextArea = new JTextArea("这里发生消息");
        historyTextArea = new JTextArea(20,20);
        historyTextArea.setBackground(new Color(255, 255, 255));
        jPanel.add(historyTextArea);
        jPanel.add(msgTextArea);
        jPanel.add(sendMsgBtn);
        jFrame.add(jPanel);
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

        sendMsgBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MSG = msgTextArea.getText();
                history.append("我：" + "\n" + MSG + "\n");
                Gson gson = new Gson();
                RobotAnswer robotAnswer = gson.fromJson(HttpUtil.getInstance().sendRequest2API(MSG), RobotAnswer.class);
                history.append(robotAnswer.getAnswer());
                historyTextArea.setText(history.toString());
                System.out.println(history);
            }
        });
    }

    public static void main(String[] args) {
        new MainUI();
    }
}
