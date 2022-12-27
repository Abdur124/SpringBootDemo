package com.example.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessInput {
	
	int num;
	List<Integer> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void process() {
	
	for(int i=0; i<5; i++) {
		num = sc.nextInt();
		list.add(num);
	}
	
	for(Integer itr: list) {
		System.out.println(itr);
	}
	}

}