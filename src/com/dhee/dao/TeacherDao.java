package com.dhee.dao;

import java.util.List;

import com.dhee.tools.SchoolMessagePage;
import com.dhee.tools.StudentInfoPage;
import com.dhee.tools.TeacherInfoPage;
import com.dhee.vo.SchoolMessage;
import com.dhee.vo.Student;
import com.dhee.vo.StudentInfo;
import com.dhee.vo.Teacher;
import com.dhee.vo.TeacherEva;

public interface TeacherDao extends PublicDao {
	// 查询教师--教师登陆
	public Teacher selectTeacher(Teacher t);

	// 分页查询教师评价
	public TeacherInfoPage selectTeacherEva(TeacherInfoPage tp);

	// 删除教师评价
	public int deletTeacherEva(TeacherEva te);

	// 删除学生信息
	public int deletStudent(Student s);

	// 更新教师--修改密码
	public int updateTeacher(Teacher t);

	// 分页查询学生信息
	public StudentInfoPage selectStudentInfo(StudentInfoPage sp);

	// 导出exl查询学生的详细信息
	public List<StudentInfo> selectStudentInfo(String className, String studentName);

	// 是否已经添加过该学生的详细信息
	public int isStudentInfoName(String name);

	// 删除学生详细信息
	public int deletStudentInfo(String id);

	// 查找指定ID的教师评价表
	public TeacherEva selectTeacherEva(TeacherEva te);

	// 删除学院详细评价
	public int deleteSchoolMessage(String id);

	// 更新学院评价
	public int updateSchoolMessage(SchoolMessage sm);

	// 添加学院评价
	public int addSchoolMessage(SchoolMessage sm);

	// 查询学院评价
	public SchoolMessagePage selectSchoolMessagePage(SchoolMessagePage smp);

	// 导出exl查询学生的详细信息
	public List<SchoolMessage> selectSchoolMessage(String schoolname, String collagename);

	// 删除学院评价
	public int deleteSchoolMessageProject(SchoolMessage sm);
}
