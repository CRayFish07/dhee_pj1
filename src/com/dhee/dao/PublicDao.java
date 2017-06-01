package com.dhee.dao;

import com.dhee.vo.Student;
import com.dhee.vo.StudentInfo;

public interface PublicDao {
	// 更新学生信息--学生再次修改学生信息
	public int updateStudentInfo(StudentInfo sInfo);

	// 保存学生信息--学生第一次保存个人信息
	public int saveStudentInfo(StudentInfo sInfo);

	// 保存学生--学生注册
	public int saveStudent(Student s);

}
