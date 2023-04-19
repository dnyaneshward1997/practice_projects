package com.cdac.dao;

import java.util.Iterator;
import java.util.List;

import com.cdac.service.AnswerService;

public class QuestionDao {
	private int id;
	private String name;
	private List<AnswerService> answers;

	// setters and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AnswerService> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerService> answers) {
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println("answers are :");
		Iterator<AnswerService> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
