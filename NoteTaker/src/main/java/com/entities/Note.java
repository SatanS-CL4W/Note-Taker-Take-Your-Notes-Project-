package com.entities;

import java.util.Date;
import java.util.Random;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "notes")
public class Note {
	@Id
	private int id;
	@Column(name = "Note Title")
	private String title;
	@Column(length = 1500)
	private String content;
	private Date addedDAte;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getAddedDAte() {
		return addedDAte;
	}

	public void setAddedDAte(Date addedDAte) {
		this.addedDAte = addedDAte;
	}

	public Note(String title, String content, Date addedDAte) {
		super();
		this.id = new Random().nextInt(100000);
		this.title = title;
		this.content = content;
		this.addedDAte = addedDAte;
	}

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

}
