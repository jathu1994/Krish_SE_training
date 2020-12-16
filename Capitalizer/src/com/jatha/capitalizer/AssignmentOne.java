package com.jatha.capitalizer;

public class AssignmentOne {
	public static void main(String[] args) {
		ReadFileM1 rd1 = new ReadFileM1();
		ReadFileM2 rd2 = new ReadFileM2();
		
		System.out.println("out put from ReadfileM1 class");
		System.out.println(rd1.readingFile("D:\\xx\\resource.txt"));
		System.out.println("________________________________");
		
		System.out.println("out put from ReadfileM2 class");
		System.out.println(rd2.readingFile("D:\\xx\\resource.txt"));
	}

}