package com.uni;

import java.awt.FlowLayout;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test {
	public static void main(String[] args) {
		ArrayList<SaveTest> data = new ArrayList<SaveTest>();

		SaveTest test = new SaveTest("test1", new ImageIcon("images/girl.jpg"));
		data.add(test);

		test = new SaveTest("test1", new ImageIcon("images/tel.jpg"));
		data.add(test);// ArrayList에 클래스 저장

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
			oos.writeObject(data);// 파일에 ArrayList 저장
			oos.close();
		} catch (Exception ex) {

		}

		JFrame frame = new JFrame();
		ArrayList<SaveTest> read_data = null;// 파일에서 읽어서 저장할 변수

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
			read_data = (ArrayList<SaveTest>) ois.readObject();// 파일에서 ArrayList읽기
			ois.close();
		} catch (Exception ex) {

		}

		frame.setLayout(new FlowLayout());

		for (int i = 0; i < read_data.size(); i++) {
			frame.add(new JLabel(read_data.get(i).icon));// 읽어들인 아이콘을 화면에 출력
		}
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class SaveTest implements Serializable {
	public String name;
	public ImageIcon icon;

	public SaveTest(String name, ImageIcon icon) {
		this.name = name;
		this.icon = icon;
	}
}
