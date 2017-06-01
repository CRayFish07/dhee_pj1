package com.dhee.dao;

import com.dhee.vo.Student;
import com.dhee.vo.StudentInfo;
import com.dhee.vo.TeacherEva;

public interface StudentDao extends PublicDao {
	// 查询学生--学生登陆验证
	public Student selectStudent(Student s);

	// 更新学生--学生修改密码
	public int updateStudent(Student s);

	// 添加教师评价--学生提交教师评价
	public int saveTeacherEva(TeacherEva te);

	// 查询学生详细信息
	public StudentInfo selectStudentInfo(Student s);

}
