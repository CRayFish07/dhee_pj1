package com.dhee.daoLmpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.dhee.dao.TeacherDao;
import com.dhee.dbConnection.DBO;
import com.dhee.tools.SchoolMessagePage;
import com.dhee.tools.StudentInfoPage;
import com.dhee.tools.TeacherInfoPage;
import com.dhee.vo.SchoolMessage;
import com.dhee.vo.Student;
import com.dhee.vo.StudentInfo;
import com.dhee.vo.Teacher;
import com.dhee.vo.TeacherEva;

public class TeacherImpl implements TeacherDao {
	private DBO dbo;

	public TeacherImpl() {
		// TODO Auto-generated constructor stub
		dbo = new DBO();
	}

	@Override
	public int updateStudentInfo(StudentInfo sInfo) {
		// TODO Auto-generated method stub
		int temp = 0;
		String sql = "UPDATE student_info SET classes='" + sInfo.getClasses() + "', name='" + sInfo.getName()
				+ "', employment_status='" + sInfo.getEmploymentStatus() + "', sex='" + sInfo.getSex() + "', birthday='"
				+ new SimpleDateFormat("yyyy-MM-dd").format(sInfo.getBirthday()) + "', graduation_time='"
				+ new SimpleDateFormat("yyyy-MM-dd").format(sInfo.getGraduationTime()) + "', category='"
				+ sInfo.getCategory() + "', college='" + sInfo.getCollege() + "', major='" + sInfo.getMajor()
				+ "', education_bg='" + sInfo.getEducationBg() + "', fg_language='" + sInfo.getFgLanguage()
				+ "', level='" + sInfo.getLevel() + "', level2='" + sInfo.getLevel2() + "', fg2_language='"
				+ sInfo.getFg2Language() + "', score='" + sInfo.getScore() + "', phone='" + sInfo.getPhone()
				+ "', address='" + sInfo.getAddress() + "', email='" + sInfo.getEmail() + "', home_telephone='"
				+ sInfo.getHomeTelephone() + "' WHERE id=" + sInfo.getId() + "";
		temp = dbo.save(sql);
		return temp;
	}

	@Override
	public int saveStudentInfo(StudentInfo sInfo) {
		// TODO Auto-generated method stub
		int temp = 0;
		String sql = "insert student_info (classes,name,employment_status,sex,birthday,graduation_time,category,college,major,education_bg,fg_language,level,level2,fg2_language,score,phone,address,email,home_telephone) VALUES('"
				+ sInfo.getClasses() + "','" + sInfo.getName() + "','" + sInfo.getEmploymentStatus() + "','"
				+ sInfo.getSex() + "','" + new SimpleDateFormat("yyyy-MM-dd").format(sInfo.getBirthday()) + "','"
				+ new SimpleDateFormat("yyyy-MM-dd").format(sInfo.getGraduationTime()) + "','" + sInfo.getCategory()
				+ "','" + sInfo.getCollege() + "','" + sInfo.getMajor() + "','" + sInfo.getEducationBg() + "','"
				+ sInfo.getFgLanguage() + "','" + sInfo.getLevel() + "','" + sInfo.getLevel2() + "','"
				+ sInfo.getFg2Language() + "','" + sInfo.getScore() + "','" + sInfo.getPhone() + "','"
				+ sInfo.getAddress() + "','" + sInfo.getEmail() + "','" + sInfo.getHomeTelephone() + "')";
		temp = dbo.save(sql);
		return temp;
	}

	@Override
	public Teacher selectTeacher(Teacher t) {
		// TODO Auto-generated method stub
		Teacher teacher = null;
		try {
			String sql = "SELECT * FROM teacher WHERE tname='" + t.getTname() + "'";
			ResultSet resultSet = dbo.select(sql);
			while (resultSet.next()) {
				teacher = new Teacher();
				teacher.setTname(resultSet.getString(1));
				teacher.setTpassword(resultSet.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teacher;
	}

	@Override
	public TeacherInfoPage selectTeacherEva(TeacherInfoPage tp) {
		// TODO Auto-generated method stub
		String sql = "";
		String sqlnum = "";
		List<TeacherEva> list = null;
		int sum = 0;
		if (!tp.getTeacherName().equals("") && !tp.getClassName().equals("")) {
			sql = "SELECT * FROM teacher_eva WHERE classes='" + tp.getClassName() + "' AND `teacher` LIKE '%"
					+ tp.getTeacherName() + "%' ORDER BY score limit " + tp.startrow() + "," + tp.getN() + "";
			sqlnum = "SELECT COUNT(*) FROM teacher_eva WHERE classes='" + tp.getClassName() + "' AND `teacher` LIKE '%"
					+ tp.getTeacherName() + "%'";
		} else {
			if (tp.getTeacherName().equals("")) {
				sql = "SELECT * FROM teacher_eva WHERE classes='" + tp.getClassName() + "' ORDER BY score limit "
						+ tp.startrow() + "," + tp.getN() + "";
				sqlnum = "SELECT COUNT(*) FROM teacher_eva WHERE classes='" + tp.getClassName() + "'";
			} else {
				sql = "SELECT * FROM teacher_eva WHERE  `teacher` LIKE '%" + tp.getTeacherName()
						+ "%' ORDER BY score limit " + tp.startrow() + "," + tp.getN() + "";
				sqlnum = "SELECT COUNT(*) FROM teacher_eva WHERE  `teacher` LIKE '%" + tp.getTeacherName() + "%'";
			}
		}
		try {
			ResultSet resultSet = dbo.select(sql);
			ResultSet resultSet2 = new DBO().select(sqlnum);
			list = new ArrayList<TeacherEva>();
			while (resultSet.next()) {
				TeacherEva teacherEva = new TeacherEva();
				teacherEva.setId(resultSet.getInt(1));
				teacherEva.setClasses(resultSet.getString(2));
				teacherEva.setTeacher(resultSet.getString(3));
				teacherEva.setCourse(resultSet.getString(4));
				teacherEva.setDate(resultSet.getTimestamp(5));
				teacherEva.setStudent(resultSet.getString(6));
				teacherEva.setPerQuality(resultSet.getString(7));
				teacherEva.setTeachAttitude(resultSet.getString(8));
				teacherEva.setTeachLevel(resultSet.getString(9));
				teacherEva.setPerQualityActual(resultSet.getString(10));
				teacherEva.setTeachAttitudeActual(resultSet.getString(11));
				teacherEva.setTeachLevelActual(resultSet.getString(12));
				teacherEva.setIdea1(resultSet.getString(13));
				teacherEva.setIdea2(resultSet.getString(14));
				teacherEva.setIdea3(resultSet.getString(15));
				teacherEva.setLogistics1(resultSet.getString(16));
				teacherEva.setLogistics2(resultSet.getString(17));
				teacherEva.setLogistics3(resultSet.getString(18));
				teacherEva.setLogistics4(resultSet.getString(19));
				list.add(teacherEva);
			}
			tp.setPagelist(list);
			while (resultSet2.next()) {
				sum = resultSet2.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tp.setAllrow(sum);
		return tp;
	}

	@Override
	public int deletTeacherEva(TeacherEva te) {
		// TODO Auto-generated method stub
		int cjwo = 0;
		String sql = "delete from teacher_eva where id='" + te.getId() + "'";
		cjwo = dbo.delete(sql);
		return cjwo;
	}

	@Override
	public int deletStudent(Student s) {
		// TODO Auto-generated method stub
		int hi = 0;
		String sql = "delete from student where id='" + s.getId() + "'";
		hi = dbo.delete(sql);
		return hi;
	}

	@Override
	public int updateTeacher(Teacher t) {
		// TODO Auto-generated method stub
		int iu = 0;
		String sql = "update teacher SET tpassword='" + t.getTpassword() + "' WHERE tname='" + t.getTname() + "'";
		iu = dbo.update(sql);
		return iu;
	}

	@Override
	public StudentInfoPage selectStudentInfo(StudentInfoPage sp) {
		// TODO Auto-generated method stub
		String sql = "";
		String sqlnum = "";
		List<StudentInfo> list = null;
		int sum = 0;
		if (!sp.getStudentName().equals("") && !sp.getClassName().equals("")) {
			sql = "SELECT * FROM student_info WHERE classes='" + sp.getClassName() + "' AND `name` LIKE '%"
					+ sp.getStudentName() + "%' limit " + sp.startrow() + "," + sp.getN() + "";
			sqlnum = "SELECT COUNT(*) FROM student_info WHERE classes='" + sp.getClassName() + "' AND `name` LIKE '%"
					+ sp.getStudentName() + "%'";
			;
		} else {
			if (sp.getStudentName().equals("")) {
				sql = "SELECT * FROM student_info WHERE classes='" + sp.getClassName() + "' limit " + sp.startrow()
						+ "," + sp.getN() + "";
				sqlnum = "SELECT COUNT(*) FROM student_info WHERE classes='" + sp.getClassName() + "'";
			} else {
				sql = "SELECT * FROM student_info WHERE  `name` LIKE '%" + sp.getStudentName() + "%' limit "
						+ sp.startrow() + "," + sp.getN() + "";
				sqlnum = "SELECT COUNT(*) FROM student_info WHERE  `name` LIKE '%" + sp.getStudentName() + "%'";
			}
		}
		try {
			ResultSet resultSet = dbo.select(sql);
			ResultSet resultSet2 = new DBO().select(sqlnum);
			list = new ArrayList<StudentInfo>();
			while (resultSet.next()) {
				StudentInfo studentInfo = new StudentInfo();
				studentInfo = new StudentInfo();
				studentInfo.setId(resultSet.getInt(1));
				studentInfo.setClasses(resultSet.getString(2));
				studentInfo.setName(resultSet.getString(3));
				studentInfo.setEmploymentStatus(resultSet.getString(4));
				studentInfo.setSex(resultSet.getString(5));
				studentInfo.setBirthday(resultSet.getDate(6));
				studentInfo.setGraduationTime(resultSet.getDate(7));
				studentInfo.setCategory(resultSet.getString(8));
				studentInfo.setCollege(resultSet.getString(9));
				studentInfo.setMajor(resultSet.getString(10));
				studentInfo.setEducationBg(resultSet.getString(11));
				studentInfo.setFgLanguage(resultSet.getString(12));
				studentInfo.setLevel(resultSet.getString(13));
				studentInfo.setLevel2(resultSet.getString(14));
				studentInfo.setFg2Language(resultSet.getString(15));
				studentInfo.setScore(resultSet.getDouble(16));
				studentInfo.setPhone(resultSet.getString(17));
				studentInfo.setAddress(resultSet.getString(18));
				studentInfo.setEmail(resultSet.getString(19));
				studentInfo.setHomeTelephone(resultSet.getString(20));
				list.add(studentInfo);
			}
			sp.setPagelist(list);
			while (resultSet2.next()) {
				sum = resultSet2.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sp.setAllrow(sum);
		return sp;
	}

	@Override
	public int isStudentInfoName(String name) {
		// TODO Auto-generated method stub
		int temp = 0;
		String sql = "SELECT * FROM student_info WHERE name='" + name + "'";
		try {
			ResultSet resultSet = dbo.select(sql);
			if (resultSet.next()) {
				temp = 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public int saveStudent(Student s) {
		// TODO Auto-generated method stub
		int temp = 0;
		String sql = "INSERT INTO dhee_system.student (sname,spassword) VALUES('" + s.getSname() + "','"
				+ s.getSpassword() + "')";
		temp = dbo.save(sql);
		return temp;
	}

	@Override
	public int deletStudentInfo(String id) {
		// TODO Auto-generated method stub
		int temp = 0;
		String sql = "delete from student_info where id=" + id;
		temp = dbo.delete(sql);
		return temp;
	}

	@Override
	public List<StudentInfo> selectStudentInfo(String className, String studentName) {
		// TODO Auto-generated method stub
		String sql = "";
		List<StudentInfo> list = null;
		if (!className.equals("") && !studentName.equals("")) {
			sql = "SELECT * FROM student_info WHERE classes='" + className + "' AND `name` LIKE '%" + studentName
					+ "%'";
		} else {
			if (studentName.equals("")) {
				sql = "SELECT * FROM student_info WHERE classes='" + className + "'";
			} else {
				sql = "SELECT * FROM student_info WHERE  `name` LIKE '%" + studentName + "%'";
			}
		}
		try {
			ResultSet resultSet = dbo.select(sql);
			list = new ArrayList<StudentInfo>();
			while (resultSet.next()) {
				StudentInfo studentInfo = new StudentInfo();
				studentInfo = new StudentInfo();
				studentInfo.setId(resultSet.getInt(1));
				studentInfo.setClasses(resultSet.getString(2));
				studentInfo.setName(resultSet.getString(3));
				studentInfo.setEmploymentStatus(resultSet.getString(4));
				studentInfo.setSex(resultSet.getString(5));
				studentInfo.setBirthday(resultSet.getDate(6));
				studentInfo.setGraduationTime(resultSet.getDate(7));
				studentInfo.setCategory(resultSet.getString(8));
				studentInfo.setCollege(resultSet.getString(9));
				studentInfo.setMajor(resultSet.getString(10));
				studentInfo.setEducationBg(resultSet.getString(11));
				studentInfo.setFgLanguage(resultSet.getString(12));
				studentInfo.setLevel(resultSet.getString(13));
				studentInfo.setLevel2(resultSet.getString(14));
				studentInfo.setFg2Language(resultSet.getString(15));
				studentInfo.setScore(resultSet.getDouble(16));
				studentInfo.setPhone(resultSet.getString(17));
				studentInfo.setAddress(resultSet.getString(18));
				studentInfo.setEmail(resultSet.getString(19));
				studentInfo.setHomeTelephone(resultSet.getString(20));
				list.add(studentInfo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public TeacherEva selectTeacherEva(TeacherEva te) {
		// TODO Auto-generated method stub
		TeacherEva teacherEva = null;
		String sql = "SELECT * FROM teacher_eva WHERE id=" + te.getId();
		try {
			ResultSet resultSet = dbo.select(sql);
			while (resultSet.next()) {
				teacherEva = new TeacherEva();
				teacherEva.setId(resultSet.getInt(1));
				teacherEva.setClasses(resultSet.getString(2));
				teacherEva.setTeacher(resultSet.getString(3));
				teacherEva.setCourse(resultSet.getString(4));
				teacherEva.setDate(resultSet.getTimestamp(5));
				teacherEva.setStudent(resultSet.getString(6));
				teacherEva.setPerQuality(resultSet.getString(7));
				teacherEva.setTeachAttitude(resultSet.getString(8));
				teacherEva.setTeachLevel(resultSet.getString(9));
				teacherEva.setPerQualityActual(resultSet.getString(10));
				teacherEva.setTeachAttitudeActual(resultSet.getString(11));
				teacherEva.setTeachLevelActual(resultSet.getString(12));
				teacherEva.setIdea1(resultSet.getString(13));
				teacherEva.setIdea2(resultSet.getString(14));
				teacherEva.setIdea3(resultSet.getString(15));
				teacherEva.setLogistics1(resultSet.getString(16));
				teacherEva.setLogistics2(resultSet.getString(17));
				teacherEva.setLogistics3(resultSet.getString(18));
				teacherEva.setLogistics4(resultSet.getString(19));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teacherEva;
	}

	@Override
	public int deleteSchoolMessage(String id) {
		// TODO Auto-generated method stub
		int temp = 0;
		String sql = "delete from school_message where id=" + id;
		temp = dbo.delete(sql);
		return temp;
	}

	@Override
	public int updateSchoolMessage(SchoolMessage sm) {
		// TODO Auto-generated method stub
		int temp = 0;
		String sql = "UPDATE school_message SET school_name='" + sm.getSchool_name() + "', school_level='"
				+ sm.getSchool_level() + "', collage_name='" + sm.getCollage_name() + "', professional='"
				+ sm.getProfessional() + "', contact_service='" + sm.getContact_service() + "', tel='" + sm.getTel()
				+ "', student_number='" + sm.getStudent_number() + "', school_location='" + sm.getSchool_location()
				+ "', school_profile='" + sm.getSchool_profile() + "', school_web='" + sm.getSchool_web()
				+ "', school_address='" + sm.getSchool_address() + "', cooperate='" + sm.getCooperate()
				+ "', cooperate_company='" + sm.getCooperate_company() + "', student_dynamic='"
				+ sm.getStudent_dynamic() + "', leaveschooltime='" + sm.getLeaveschooltime() + "', ps='" + sm.getPs()
				+ "' WHERE id=" + sm.getId() + "";
		temp = dbo.save(sql);
		return temp;
	}

	@Override
	public int addSchoolMessage(SchoolMessage sm) {
		// TODO Auto-generated method stub
		int temp = 0;
		String sql = "insert into school_message (school_name,school_level,collage_name,professional,contact_service,tel,student_number,school_location,school_profile,school_web,school_address,cooperate,cooperate_company,student_dynamic,leaveschooltime,ps) VALUES('"
				+ sm.getSchool_name() + "','" + sm.getSchool_level() + "','" + sm.getCollage_name() + "','"
				+ sm.getProfessional() + "','" + sm.getContact_service() + "','" + sm.getTel() + "','"
				+ sm.getStudent_number() + "','" + sm.getSchool_location() + "','" + sm.getSchool_profile() + "','"
				+ sm.getSchool_web() + "','" + sm.getSchool_address() + "','" + sm.getCooperate() + "','"
				+ sm.getCooperate_company() + "','" + sm.getStudent_dynamic() + "','" + sm.getLeaveschooltime() + "','"
				+ sm.getPs() + "')";
		temp = dbo.save(sql);
		return temp;
	}

	@Override
	public SchoolMessagePage selectSchoolMessagePage(SchoolMessagePage smp) {
		// TODO Auto-generated method stub
		String sql = "";
		String sqlnum = "";
		List<SchoolMessage> list = null;
		int sum = 0;
		if (!smp.getSchoolname().equals("") && !smp.getCollagename().equals("")) {
			sql = "SELECT * FROM school_message WHERE school_name='" + smp.getSchoolname() + "' AND `collage_name` LIKE '%"
					+ smp.getCollagename() + "%' limit " + smp.startrow() + "," + smp.getN() + "";
			sqlnum = "SELECT COUNT(*) FROM school_message WHERE school_name='" + smp.getSchoolname() + "' AND `collage_name` LIKE '%"
					+ smp.getCollagename() + "%'";
			;
		} else {
			if (smp.getSchoolname().equals("")) {
				sql = "SELECT * FROM school_message WHERE collage_name='" + smp.getCollagename() + "' limit " + smp.startrow()
						+ "," + smp.getN() + "";
				sqlnum = "SELECT COUNT(*) FROM school_message WHERE collage_name='" + smp.getCollagename() + "'";
			} else {
				sql = "SELECT * FROM school_message WHERE  `school_name` LIKE '%" + smp.getSchoolname() + "%' limit "
						+ smp.startrow() + "," + smp.getN() + "";
				sqlnum = "SELECT COUNT(*) FROM school_message WHERE  `school_name` LIKE '%" + smp.getSchoolname() + "%'";
			}
		}
		try {
			ResultSet resultSet = dbo.select(sql);
			ResultSet resultSet2 = new DBO().select(sqlnum);
			list = new ArrayList<SchoolMessage>();
			while (resultSet.next()) {
				SchoolMessage sm = new SchoolMessage();
				sm.setId(resultSet.getInt(1));
				sm.setSchool_name(resultSet.getString(2));
				sm.setSchool_level(resultSet.getString(3));
				sm.setCollage_name(resultSet.getString(4));
				sm.setProfessional(resultSet.getString(5));
				sm.setContact_service(resultSet.getString(6));
				sm.setTel(resultSet.getString(7));
				sm.setStudent_number(resultSet.getString(8));
				sm.setSchool_location(resultSet.getString(9));
				sm.setSchool_profile(resultSet.getString(10));
				sm.setSchool_web(resultSet.getString(11));
				sm.setSchool_address(resultSet.getString(12));
				sm.setCooperate(resultSet.getString(13));
				sm.setCooperate_company(resultSet.getString(14));
				sm.setStudent_dynamic(resultSet.getString(15));
				sm.setLeaveschooltime(resultSet.getString(16));
				sm.setPs(resultSet.getString(17));
				list.add(sm);
			}
			smp.setPagelist(list);
			while (resultSet2.next()) {
				sum = resultSet2.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		smp.setAllrow(sum);
		return smp;
	}
	public List<SchoolMessage> selectSchoolMessage(String schoolname, String collagename){
		String sql = "";
		List<SchoolMessage> list = null;
		if (!schoolname.equals("") && !collagename.equals("")) {
			sql = "SELECT * FROM school_message WHERE school_name='" + schoolname + "' AND `collage_name` LIKE '%" + collagename
					+ "%'";
		} else {
			if (collagename.equals("")) {
				sql = "SELECT * FROM school_message WHERE school_name='" + schoolname + "'";
			} else {
				sql = "SELECT * FROM school_message WHERE  `collage_name` LIKE '%" + collagename + "%'";
			}
		}
		try {
			ResultSet resultSet = dbo.select(sql);
			list = new ArrayList<SchoolMessage>();
			while (resultSet.next()) {
				SchoolMessage sm = new SchoolMessage();
				sm.setId(resultSet.getInt(1));
				sm.setSchool_name(resultSet.getString(2));
				sm.setSchool_level(resultSet.getString(3));
				sm.setCollage_name(resultSet.getString(4));
				sm.setProfessional(resultSet.getString(5));
				sm.setContact_service(resultSet.getString(6));
				sm.setTel(resultSet.getString(7));
				sm.setStudent_number(resultSet.getString(8));
				sm.setSchool_location(resultSet.getString(9));
				sm.setSchool_profile(resultSet.getString(10));
				sm.setSchool_web(resultSet.getString(11));
				sm.setSchool_address(resultSet.getString(12));
				sm.setCooperate(resultSet.getString(13));
				sm.setCooperate_company(resultSet.getString(14));
				sm.setStudent_dynamic(resultSet.getString(15));
				sm.setLeaveschooltime(resultSet.getString(16));
				sm.setPs(resultSet.getString(17));
				list.add(sm);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	@Override
	public int deleteSchoolMessageProject(SchoolMessage sm) {
		// TODO Auto-generated method stub
		int hi = 0;
		String sql = "delete from school_message where id='" + sm.getId() + "'";
		hi = dbo.delete(sql);
		return hi;
	}

}
