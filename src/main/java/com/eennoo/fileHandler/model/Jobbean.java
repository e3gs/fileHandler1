package com.eennoo.fileHandler.model;

public class Jobbean {
	// id
	private String id;
	// ����
	private String age;
	// ��������
	private String workage;
	// �Ա�
	private String sex;
	// ְ��/ְλ
	private String position;
	// ѧ��
	private String education;
	// ѧУ
	private String school;
	// �������
	private String lastwork;
	// �����أ�
	private String isdown;
	// �ؼ���
	private String keyword;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getWorkage() {
		return workage;
	}

	public void setWorkage(String workage) {
		this.workage = workage;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getLastwork() {
		return lastwork;
	}

	public void setLastwork(String lastwork) {
		this.lastwork = lastwork;
	}

	public String getIsdown() {
		return isdown;
	}

	public void setIsdown(String isdown) {
		this.isdown = isdown;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "jobbean [id=" + id + ", age=" + age + ", workage=" + workage + ", sex=" + sex + ", position=" + position
				+ ", education=" + education + ", school=" + school + ", lastwork=" + lastwork + ", isdown=" + isdown
				+ "]";
	}

}
