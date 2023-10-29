package com.system.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentOpetion extends Bg {

	private JPanel contentPane;

	public StudentOpetion(String flag) {

		super(flag);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(166, 53, 751, 494);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("学生模块基本操作");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblNewLabel.setBounds(282, 72, 191, 44);
		panel.add(lblNewLabel);

		JButton btnNewButton = new JButton("查询学生");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(true);
				new StudentSelect("admin").setVisible(true);
			}
		});
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 14));
		btnNewButton.setBounds(158, 140, 134, 44);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("增加学生");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag.equals("学生")) {
					JOptionPane.showMessageDialog(null, "没有权限！");
				} else {
					setVisible(true);
					new StudentAdd("admin").setVisible(true);
				}

			}
		});
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 14));
		btnNewButton_1.setBounds(437, 140, 134, 44);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("修改学生");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag.equals("学生")) {
					JOptionPane.showMessageDialog(null, "没有权限！");
				} else {
					setVisible(false);
					new StudentUpdate("admin").setVisible(true);
				}
			}
		});
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 14));
		btnNewButton_2.setBounds(158, 251, 134, 44);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("删除学生");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag.equals("学生")) {
					JOptionPane.showMessageDialog(null, "没有权限！");
				} else {
					setVisible(false);
					new StudentDelete("admin").setVisible(true);
				}
			}
		});
		btnNewButton_3.setBackground(SystemColor.activeCaption);
		btnNewButton_3.setFont(new Font("微软雅黑", Font.BOLD, 14));
		btnNewButton_3.setBounds(437, 251, 134, 44);
		panel.add(btnNewButton_3);
	}
}
