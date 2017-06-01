package com.dhee.daoLmpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import com.dhee.dao.StudentDao;
import com.dhee.dbConnection.DBO;
import com.dhee.vo.Student;
import com.dhee.vo.StudentInfo;
import com.dhee.vo.TeacherEva;

public class StudentImpl implements StudentDao{
	private DBO dbo;
	public StudentImpl() {
		// TODO Auto-generated constructor stub
		dbo=new DBO();
	}

	@Override
	public int updateStudentInfo(StudentInfo sInfo) {
		// TODO Auto-generated method stub
		int temp=0;
		String sql="UPDATE student_info SET classes='"+sInfo.getClasses()+"', name='"+sInfo.getName()+"', employment_status='"+sInfo.getEmploymentStatus()+"', sex='"+sInfo.getSex()+"', birthday='"+new SimpleDateFormat("yyyy-MM-dd").format(sInfo.getBirthday())+"', graduation_time='"+new SimpleDateFormat("yyyy-MM-dd").format(sInfo.getGraduationTime())+"', category='"+sInfo.getCategory()+"', college='"+sInfo.getCollege()+"', major='"+sInfo.getMajor()+"', education_bg='"+sInfo.getEducationBg()+"', fg_language='"+sInfo.getFgLanguage()+"', level='"+sInfo.getLevel()+"', level2='"+sInfo.getLevel2()+"', fg2_language='"+sInfo.getFg2Language()+"', score='"+sInfo.getScore()+"', phone='"+sInfo.getPhone()+"', address='"+sInfo.getAddress()+"', email='"+sInfo.getEmail()+"', home_telephone='"+sInfo.getHomeTelephone()+"' WHERE (id="+sInfo.getId()+")";
		temp=dbo.save(sql);
		return temp;
	}

	@Override
	public int saveStudentInfo(StudentInfo sInfo) {
		// TODO Auto-generated method stub
		int temp=0;
		String sql="insert student_info (classes,name,employment_status,sex,birthday,graduation_time,category,college,major,education_bg,fg_language,level,level2,fg2_language,score,phone,address,email,home_telephone) VALUES('"+sInfo.getClasses()+"','"+sInfo.getName()+"','"+sInfo.getEmploymentStatus()+"','"+sInfo.getSex()+"','"+((sInfo.getBirthday()==null)?"0000-00-00":new SimpleDateFormat("yyyy-MM-dd").format(sInfo.getBirthday()))+"','"+((sInfo.getGraduationTime()==null)?"0000-00-00":new SimpleDateFormat("yyyy-MM-dd").format(sInfo.getGraduationTime()))+"','"+sInfo.getCategory()+"','"+sInfo.getCollege()+"','"+sInfo.getMajor()+"','"+sInfo.getEducationBg()+"','"+sInfo.getFgLanguage()+"','"+sInfo.getLevel()+"','"+sInfo.getLevel2()+"','"+sInfo.getFg2Language()+"','"+((sInfo.getScore()==0.0)?"0.0":sInfo.getScore())+"','"+sInfo.getPhone()+"','"+sInfo.getAddress()+"','"+sInfo.getEmail()+"','"+sInfo.getHomeTelephone()+"')";
		temp=dbo.save(sql);
		return temp;
	}

	@Override
	public Student selectStudent(Student s) {
		// TODO Auto-generated method stub
		Student student=null;
		try {
			String sql="SELECT * FROM student WHERE sname='"+s.getSname()+"'";
			ResultSet resultSet=dbo.select(sql);
			while(resultSet.next()){
				student=new Student();
				student.setId(resultSet.getInt(1));
				student.setSname(resultSet.getString(2));
				student.setSpassword(resultSet.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public int saveStudent(Student s) {
		// TODO Auto-generated method stub
		int temp=0;
		String sql="INSERT INTO dhee_system.student (sname,spassword) VALUES('"+s.getSname()+"','"+s.getSpassword()+"')";
		temp=dbo.save(sql);
		return temp;
	}

	@Override
	public int updateStudent(Student s) {
		// TODO Auto-generated method stub
		int temp=0;
		String sql="UPDATE student SET sname = '"+s.getSname()+"',spassword='"+s.getSpassword()+"' WHERE id = "+s.getId()+"";
		temp=dbo.update(sql);
		return temp;
	}

	@Override
	public int saveTeacherEva(TeacherEva te) {
		// TODO Auto-generated method stub
		int temp=0;
		String sql="INSERT INTO teacher_eva (classes, teacher,course, date, student, per_quality, teach_attitude, teach_level, per_quality_actual,teach_attitude_actual, teach_level_actual, idea_1, idea_2, idea_3, logistics_1, logistics_2, logistics_3, logistics_4,score) VALUES ('"+te.getClasses()+"','"+te.getTeacher()+"','"+te.getCourse()+"','"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(te.getDate())+"','"+te.getStudent()+"','"+te.getPerQuality()+"','"+te.getTeachAttitude()+"','"+te.getTeachLevel()+"','"+te.getPerQualityActual()+"','"+te.getTeachAttitudeActual()+"','"+te.getTeachLevelActual()+"','"+te.getIdea1()+"','"+te.getIdea2()+"','"+te.getIdea3()+"','"+te.getLogistics1()+"','"+te.getLogistics2()+"','"+te.getLogistics3()+"','"+te.getLogistics4()+"',"+te.getSumCore()+")";
		temp=dbo.save(sql);
		return temp;
	}

	@Override
	public StudentInfo selectStudentInfo(Student s) {
		// TODO Auto-generated method stub
		StudentInfo studentInfo=null;
		try {
			String sql="SELECT * FROM student_info WHERE id="+s.getId();
			ResultSet resultSet=dbo.select(sql);
			while(resultSet.next()){
				studentInfo=new StudentInfo();
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
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		}
		return studentInfo;
	}

}
