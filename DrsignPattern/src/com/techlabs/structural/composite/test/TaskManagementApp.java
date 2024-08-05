package com.techlabs.structural.composite.test;

import com.techlabs.structural.composite.model.ITaskcomponent;
import com.techlabs.structural.composite.model.Simpletaskleaf;
import com.techlabs.structural.composite.model.TaskList;

// Client

public class TaskManagementApp {
	public static void main(String[] args) {
		
		Simpletaskleaf simpleTask1 = new Simpletaskleaf();
		simpleTask1.setTitle("heyyy");
		simpleTask1.display();
		
		TaskList projectTasks = new TaskList("hello");
		projectTasks.addTask(projectTasks);
		projectTasks.display();
	}
}
