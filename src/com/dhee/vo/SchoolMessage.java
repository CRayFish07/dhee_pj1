package com.dhee.vo;

public class SchoolMessage {
	 
	private int id;
	private String school_name;
	private String school_level;
	private String collage_name;
	private String professional; 		//专业
	private String contact_service;  	//联系人以及服务
	private String tel;
	private String student_number;
	private String school_location;
	private String school_profile;  	//学院简介
	private String school_web;
	private String school_address;
	private String cooperate;			//是否合作
	private String cooperate_company;
	private String student_dynamic;		//学生动态
	private String leaveschooltime;
	private String ps;
	
	public SchoolMessage(){
		super();
	}
	public SchoolMessage(int id){
		super();
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public String getSchool_level() {
		return school_level;
	}
	public void setSchool_level(String school_level) {
		this.school_level = school_level;
	}
	public String getCollage_name() {
		return collage_name;
	}
	public void setCollage_name(String collage_name) {
		this.collage_name = collage_name;
	}
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	public String getContact_service() {
		return contact_service;
	}
	public void setContact_service(String contact_service) {
		this.contact_service = contact_service;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getStudent_number() {
		return student_number;
	}
	public void setStudent_number(String student_number) {
		this.student_number = student_number;
	}
	public String getSchool_location() {
		return school_location;
	}
	public void setSchool_location(String school_location) {
		this.school_location = school_location;
	}
	public String getSchool_profile() {
		return school_profile;
	}
	public void setSchool_profile(String school_profile) {
		this.school_profile = school_profile;
	}
	public String getSchool_web() {
		return school_web;
	}
	public void setSchool_web(String school_web) {
		this.school_web = school_web;
	}
	public String getSchool_address() {
		return school_address;
	}
	public void setSchool_address(String school_address) {
		this.school_address = school_address;
	}
	public String getCooperate() {
		return cooperate;
	}
	public void setCooperate(String cooperate) {
		this.cooperate = cooperate;
	}
	public String getCooperate_company() {
		return cooperate_company;
	}
	public void setCooperate_company(String cooperate_company) {
		this.cooperate_company = cooperate_company;
	}
	public String getStudent_dynamic() {
		return student_dynamic;
	}
	public void setStudent_dynamic(String student_dynamic) {
		this.student_dynamic = student_dynamic;
	}
	public String getLeaveschooltime() {
		return leaveschooltime;
	}
	public void setLeaveschooltime(String leaveschooltime) {
		this.leaveschooltime = leaveschooltime;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}

}

