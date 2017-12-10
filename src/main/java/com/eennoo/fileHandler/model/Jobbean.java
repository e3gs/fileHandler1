package com.eennoo.fileHandler.model;

public class Jobbean {
	// id
	private String id;
	// 年龄
	private String age;
	// 工作年限
	private String workage;
	// 性别
	private String sex;
	// 职能/职位
	private String position;
	// 学历
	private String education;
	// 学校
	private String school;
	// 最近工作
	private String lastwork;
	// 已下载？
	private String isdown;
	// 关键字
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
