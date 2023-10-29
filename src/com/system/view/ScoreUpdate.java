package com.system.view;

import com.system.dao.ScoreDao;
import com.system.entity.Score;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class ScoreUpdate extends Bg {

	private JPanel contentPane;
	private JTextField snoKeyField;
	private JTextField cnameKeyField;
	private JLabel snoLabel;
	private JLabel snameLabel;
	private JLabel cnameLabel;
	private JTextField sscoreField;
	private JTextField rescoreField;
	private String cno;


	public ScoreUpdate(String a) {

		super(a);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(165, 53, 752, 494);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);

		JLabel lblNewLabel_2 = new JLabel("修改成绩");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 18));
		lblNewLabel_2.setBounds(252, 28, 238, 30);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_1_4 = new JLabel("学号：");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("微软雅黑", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(92, 67, 61, 30);
		panel_1.add(lblNewLabel_1_4);

		snoKeyField = new JTextField();
		snoKeyField.setColumns(10);
		snoKeyField.setBounds(145, 68, 163, 29);
		panel_1.add(snoKeyField);

		JLabel lblNewLabel_1_1_1 = new JLabel("课程号：");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("微软雅黑", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(327, 68, 61, 30);
		panel_1.add(lblNewLabel_1_1_1);

		cnameKeyField = new JTextField();
		cnameKeyField.setColumns(10);
		cnameKeyField.setBounds(388, 68, 163, 29);
		panel_1.add(cnameKeyField);

		JButton btnNewButton_1 = new JButton("查询");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String snoKey = snoKeyField.getText();
				String cnameKey = cnameKeyField.getText();
				if (snoKey.equals("") || cnameKey.equals("")) {
					JOptionPane.showMessageDialog(null, "请输入完整的信息进行查询！");
				} else {
					ScoreDao scoreDao = new ScoreDao();
					Score score = new Score();

					try {
						score = scoreDao.select(snoKey, cnameKey);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if (score != null) {

						snoLabel.setText(score.getSno());
						snameLabel.setText(score.getSname());
						cnameLabel.setText(score.getCname());
						sscoreField.setText(score.getSscore());
						rescoreField.setText(score.getRescore());
						cno = score.getCno();
					} else {
						JOptionPane.showMessageDialog(null, "查无此课程成绩信息！");
					}
				}
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 14));
		btnNewButton_1.setBounds(579, 67, 76, 30);
		panel_1.add(btnNewButton_1);

		JLabel lblNewLabel_1_2_1 = new JLabel("学生成绩信息如下：");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setFont(new Font("微软雅黑", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(92, 129, 163, 30);
		panel_1.add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_1_3_2 = new JLabel("学号：");
		lblNewLabel_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_2.setFont(new Font("微软雅黑", Font.BOLD, 15));
		lblNewLabel_1_3_2.setBounds(92, 169, 61, 30);
		panel_1.add(lblNewLabel_1_3_2);

		JLabel lblNewLabel_1_3_1_1 = new JLabel("姓名：");
		lblNewLabel_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_1.setFont(new Font("微软雅黑", Font.BOLD, 15));
		lblNewLabel_1_3_1_1.setBounds(92, 209, 61, 30);
		panel_1.add(lblNewLabel_1_3_1_1);

		JLabel lblNewLabel_1_3_1_2 = new JLabel("课程名：");
		lblNewLabel_1_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_2.setFont(new Font("微软雅黑", Font.BOLD, 15));
		lblNewLabel_1_3_1_2.setBounds(92, 259, 61, 30);
		panel_1.add(lblNewLabel_1_3_1_2);

		JLabel lblNewLabel_1_3_1_3 = new JLabel("成绩：");
		lblNewLabel_1_3_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_3.setFont(new Font("微软雅黑", Font.BOLD, 15));
		lblNewLabel_1_3_1_3.setBounds(92, 309, 61, 30);
		panel_1.add(lblNewLabel_1_3_1_3);

		JLabel lblNewLabel_1_3_1_4 = new JLabel("补考成绩：");
		lblNewLabel_1_3_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_4.setFont(new Font("微软雅黑", Font.BOLD, 15));
		lblNewLabel_1_3_1_4.setBounds(80, 357, 101, 30);
		panel_1.add(lblNewLabel_1_3_1_4);

		snoLabel = new JLabel("");
		snoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		snoLabel.setFont(new Font("微软雅黑", Font.BOLD, 15));
		snoLabel.setBounds(163, 169, 163, 30);
		panel_1.add(snoLabel);

		snameLabel = new JLabel("");
		snameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		snameLabel.setFont(new Font("微软雅黑", Font.BOLD, 15));
		snameLabel.setBounds(163, 209, 163, 30);
		panel_1.add(snameLabel);

		cnameLabel = new JLabel("");
		cnameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		cnameLabel.setFont(new Font("微软雅黑", Font.BOLD, 15));
		cnameLabel.setBounds(163, 259, 204, 30);
		panel_1.add(cnameLabel);

		sscoreField = new JTextField();
		sscoreField.setBounds(163, 315, 204, 30);
		panel_1.add(sscoreField);
		sscoreField.setColumns(10);

		rescoreField = new JTextField();
		rescoreField.setColumns(10);
		rescoreField.setBounds(163, 363, 204, 30);
		panel_1.add(rescoreField);

		JButton btnNewButton_2 = new JButton("修改");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sno = snoLabel.getText();
				String sscore = sscoreField.getText();
				String rescore = rescoreField.getText();

				ScoreDao scoreDao = new ScoreDao();
				boolean istrue = false;
				try {
					istrue = scoreDao.update(sno, cno, sscore, rescore);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (istrue) {
					JOptionPane.showMessageDialog(null, "更新成绩成功！");
				} else {
					JOptionPane.showMessageDialog(null, "更新成绩失败！");
				}
				
			}
		});
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 14));
		btnNewButton_2.setBounds(194, 418, 93, 39);
		panel_1.add(btnNewButton_2);
	}

}
