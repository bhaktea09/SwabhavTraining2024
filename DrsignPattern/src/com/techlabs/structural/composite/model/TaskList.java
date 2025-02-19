package com.techlabs.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements ITaskcomponent {
	private String title;
	private List<TaskList> tasks = new ArrayList<>();

	public TaskList(String title) {
		this.title = title;
		this.tasks = new ArrayList<>();
	}

	@Override
	public String gettitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void addTask(TaskList task) {
		tasks.add(task);
	}

	public void removeTask(TaskList task) {
		tasks.remove(task);
	}

	@Override
	public void display() {
		for (TaskList task : tasks) {
			System.out.println("task list :" + title);
		}
	}

}
