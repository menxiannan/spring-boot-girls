package com.example.demo.test;

import javax.swing.*;
import java.awt.*;

/**
 * @author 12084
 * @create 2018-05-16 18:57
 */

public class ExampleTest extends JFrame {

    public void CreateJFrame(String title) {
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();
        JLabel jl = new JLabel("这是一个JFrame窗体");
        //使标签文字居中
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        container.setBackground(Color.white);
        jf.setVisible(true);
        jf.setSize(200, 150);
        //设置窗体关闭方式
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new ExampleTest().CreateJFrame("创建一个JFrame窗体");
    }
}
