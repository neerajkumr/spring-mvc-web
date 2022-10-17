package com.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	Student s1 = new Student();
	static List<Student> list = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);
	String name;
	int id;
	String DOB;

	public List<Student> insert() {
		System.out.println("Enter name, id, DOB");
		name = sc.next();
		id = sc.nextInt();
		DOB = sc.next();
		list.add(new Student(name, id, DOB));
		return list;
	}

	public Student updateID() {
		System.out.println("Enter the ID to compare");
		id = sc.nextInt();
		System.out.println("eter the ID to replace");
		Integer rId = sc.nextInt();
		for (Student s : list) {
			if (s.getsId() == id) {
				s.setsId(rId);
				s1 = s;
				break;
			}
		}
		return s1;
	}

	public List<Student> deleteByName(String name) {
		for (Student s : list) {
			if (s.getsName().equals(name)) {
				list.remove(s);
			}
		}
		return list;
	}
}
