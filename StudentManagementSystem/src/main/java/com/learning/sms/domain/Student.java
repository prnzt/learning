package com.learning.sms.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "STUDENT")
public class Student {
	

@Id
@GeneratedValue
@Column(name = "ID")
private int id;	

@Column(name = "Name")
private String studentName;

@Column(name = "rollnumber")
private int rollNumber;


@Column(name = "Stream")
private String stream;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public int getRollNumber() {
	return rollNumber;
}

public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
}

public String getStream() {
	return stream;
}

public void setStream(String stream) {
	this.stream = stream;
}

public Student() {
	
}


public Student(String studentName, int rollNumber, String stream) {
	super();
	this.studentName = studentName;
	this.rollNumber = rollNumber;
	this.stream = stream;
}

@Override
public int hashCode() {
	return Objects.hash(id, rollNumber, stream, studentName);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return id == other.id && rollNumber == other.rollNumber && Objects.equals(stream, other.stream)
			&& Objects.equals(studentName, other.studentName);
}

}
