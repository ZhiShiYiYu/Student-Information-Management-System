package com.system.view;

import com.system.dao.CourseDao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class CourseDelect extends Bg {

	private JPanel contentPane;
	private JTextField keyField;

	public CourseDelect(String a) {

		super(a);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(165, 54, 752, 493);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("删除课程");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(275, 55, 189, 33);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("课程号：");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblNewLabel_1.setBounds(202, 120, 126, 33);
		panel.add(lblNewLabel_1);

		keyField = new JTextField();
		keyField.setBounds(303, 120, 204, 33);
		panel.add(keyField);
		keyField.setColumns(10);

		JButton btnNewButton = new JButton("删除");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String key = keyField.getText();
				if (key.equals("")) {
					JOptionPane.showMessageDialog(null, "请输入课程号！");
				} else {

					CourseDao course = new CourseDao();
					boolean flag = false;
					try {
						flag = course.delete(key);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if (flag) {
						JOptionPane.showMessageDialog(null, "课程删除成功！");
					} else
						JOptionPane.showMessageDialog(null, "课程删除失败，请检查课程号是否正确！");

				}
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 14));
		btnNewButton.setBounds(525, 120, 102, 33);
		panel.add(btnNewButton);

	}

}
