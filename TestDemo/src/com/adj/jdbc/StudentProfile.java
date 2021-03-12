package com.adj.jdbc;

public class StudentProfile extends Thread{
	
	@Override
	public void run() {
		//1. show menu 
		//2. Take menu options from user - getMenuOption();
		//3. call appropriate function based on selected option
		//3.1 if option is show user list- showList();
		//3.1.1 get user list from service class
		//3.1.2 show user list to the user
		//3.2 if option is Add Student - createStudent();
		//3.2.1 get the input from student
		//3.2.2 call service method to create user
		//3.2.3 show message to student-student created
		// 3.3 If option is update-updateStudent();
		// 3.3.1 Take student id from student to update
		// 3.3.2 get current details from service
		// 3.3.3 show current details
		// 3.3.4 take updated details from student
		// 3.3.5 call service method to update student details
		// 3.4 if option is delete- deleteStudent();
		// 3.4.1 Take student id from student to delete
		// 3.4.2 Get current details from service 
		// 3.4.3 show current details
		// 3.4.4 take confirmation from the student
		// 3.4.5 call service to delete the student based on confirmation
		// 3.5 if option is exit - thanks for visiting (message)
		getMenuOptions();
		//2. Take menu options from user - getMenuOption();
		int menuoption=getMenuOptions();
		//3. call appropriate function based on selected option
		
		switch(menuoption){
			case 1: 
		//3.1 if option is show user list- showList();	
				showStudentList();
				break;
			case 2:
		//3.2 if option is Add Student - createStudent();
				createStudent();
				break;
			case 3:
		// 3.3 If option is update-updateStudent();
				updateStudent();
				break;
			case 4:
		// 3.4 if option is delete- deleteStudent();
				deleteStudent();
				break;
			case 5:
		// 3.5 if option is exit - thanks for visiting (message)
				//stop application
				break;
			default: 
				//please select correct option
		}
		
	}

	private void deleteStudent() {
		
		// 3.4.1 Take student id from student to delete
		// 3.4.2 Get current details from service 
		// 3.4.3 show current details
		// 3.4.4 take confirmation from the student
		// 3.4.5 call service to delete the student based on confirmation

	}

	private void updateStudent() {
		// 3.3.1 Take student id from student to update
		// 3.3.2 get current details from service
		// 3.3.3 show current details
		// 3.3.4 take updated details from student
		// 3.3.5 call service method to update student details
	}

	private void createStudent() {
		//3.2.1 get the input from student
		//3.2.2 call service method to create user
		//3.2.3 show message to student-student created
	}

	private void showStudentList() {
		//3.1 if option is show user list- showList();
		//3.1.1 get user list from service class
		//3.1.2 show user list to the user
	}

	private int getMenuOptions() {
		return 0;
	}
}