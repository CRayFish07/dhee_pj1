package com.dhee.action;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.dhee.daoFactory.DAOFactory;
import com.dhee.vo.Student;
import com.dhee.vo.StudentInfo;
import com.dhee.vo.TeacherEva;

public class StudentAction extends SuperAction {
	private DAOFactory daoFactory = new DAOFactory();

	// 是否有该用户名
	public void isStudentName() {
		try {
			Student temp = new Student();
			temp.setSname(request.getParameter("studentName"));
			Student student = daoFactory.getStudentImp().selectStudent(temp);
			if (student == null) {
				response.getWriter().print("0");
			} else {
				response.getWriter().print("1");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("isStudentName方法出错！");
		}
	}

	// 是否有该用户
	public void isStudentUser() {
		try {
			Student temp = new Student();
			temp.setSname(request.getParameter("studentName"));
			Student student = daoFactory.getStudentImp().selectStudent(temp);
			if (student == null) {
				response.getWriter().print("0");
			} else {
				if (request.getParameter("studentPassword").equals(student.getSpassword())) {
					session.setAttribute("nowName", student.getSname());
					session.setAttribute("type", "1");
					session.setAttribute("studentInfo", daoFactory.getStudentImp().selectStudentInfo(student));
					response.getWriter().print("1");
				} else {
					response.getWriter().print("0");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("isStudentUser方法出错！");
		}
	}

	// 注销
	public void loginOut() {
		try {
			session.setAttribute("nowName", null);
			session.setAttribute("type", null);
			session.setAttribute("studentInfo", null);
			response.getWriter().print("1");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("loginOut方法出错！");
		}
	}

	// 注册新用户
	public void saveStudent() {
		try {
			String studentName = request.getParameter("studentName");
			String studentPassword = request.getParameter("studentPassword");
			new DAOFactory().getStudentImp().saveStudent(new Student(studentName, studentPassword));
			int tempId = new DAOFactory().getStudentImp().selectStudent(new Student(studentName, studentPassword))
					.getId();
			new DAOFactory().getStudentImp().saveStudentInfo(new StudentInfo(tempId, studentName));
			response.getWriter().print("1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("saveStudent方法出错！");
		}
	}

	// 旧密码是否正确
	public void isPassword() {
		try {
			String nowUser = session.getAttribute("nowName").toString();
			String tempPW = request.getParameter("oldPassword");
			Student student = new DAOFactory().getStudentImp().selectStudent(new Student(nowUser, ""));
			if (student.getSpassword().equals(tempPW)) {
				response.getWriter().print("1");
			} else {
				response.getWriter().print("0");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("isPassword方法出错！");
		}

	}

	// 更新密码
	public void updatePassword() {
		try {
			String nowUser = session.getAttribute("nowName").toString();
			String newPassword = request.getParameter("newPassword");
			int id = new DAOFactory().getStudentImp().selectStudent(new Student(nowUser, "")).getId();
			new DAOFactory().getStudentImp().updateStudent(new Student(id, nowUser, newPassword));
			response.getWriter().print("1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("updatePassword方法出错！");
		}
	}

	// 提交教师评价
	public void saveTeacherEva() {
		try {
			TeacherEva sqv = new TeacherEva();
			sqv.setClasses(request.getParameter("a1"));
			sqv.setTeacher(request.getParameter("a2"));
			sqv.setCourse(request.getParameter("a3"));
			sqv.setDate(new Date());
			sqv.setStudent(session.getAttribute("nowName").toString());
			sqv.setPerQuality(request.getParameter("a4") + "#src#" + request.getParameter("a6") + "#src#"
					+ request.getParameter("a8"));
			sqv.setTeachAttitude(request.getParameter("a10") + "#src#" + request.getParameter("a12") + "#src#"
					+ request.getParameter("a14") + "#src#" + request.getParameter("a16") + "#src#"
					+ request.getParameter("a18") + "#src#" + request.getParameter("a20") + "#src#"
					+ request.getParameter("a22") + "#src#" + request.getParameter("a24"));
			sqv.setTeachLevel(request.getParameter("a26") + "#src#" + request.getParameter("a28") + "#src#"
					+ request.getParameter("a30") + "#src#" + request.getParameter("a32") + "#src#"
					+ request.getParameter("a34") + "#src#" + request.getParameter("a36"));
			sqv.setPerQualityActual(request.getParameter("a5") + "#src#" + request.getParameter("a7") + "#src#"
					+ request.getParameter("a9"));
			sqv.setTeachAttitudeActual(request.getParameter("a11") + "#src#" + request.getParameter("a13") + "#src#"
					+ request.getParameter("a15") + "#src#" + request.getParameter("a17") + "#src#"
					+ request.getParameter("a19") + "#src#" + request.getParameter("a21") + "#src#"
					+ request.getParameter("a23") + "#src#" + request.getParameter("a25"));
			sqv.setTeachLevelActual(request.getParameter("a27") + "#src#" + request.getParameter("a29") + "#src#"
					+ request.getParameter("a31") + "#src#" + request.getParameter("a33") + "#src#"
					+ request.getParameter("a35") + "#src#" + request.getParameter("a37"));
			sqv.setIdea1(request.getParameter("a38"));
			sqv.setIdea2(request.getParameter("a39"));
			sqv.setIdea3(request.getParameter("a40"));
			sqv.setLogistics1(request.getParameter("a41"));
			sqv.setLogistics2(request.getParameter("a42"));
			sqv.setLogistics3(request.getParameter("a43"));
			sqv.setLogistics4(request.getParameter("a44"));
			daoFactory.getStudentImp().saveTeacherEva(sqv);
			response.getWriter().print("1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("saveTeacherEva方法出错！");
		}
	}

	// 学生信息的录入
	public void isStudentInfo() {
		try {
			StudentInfo stu = (StudentInfo) session.getAttribute("studentInfo");
			StudentInfo temp = new StudentInfo();
			temp.setId(stu.getId());
			temp.setClasses(request.getParameter("Classes"));
			temp.setName(request.getParameter("Name"));
			temp.setEmploymentStatus(request.getParameter("Jyqk"));
			temp.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("Bir")));
			temp.setGraduationTime(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("By")));
			temp.setCategory(request.getParameter("Lb"));
			temp.setSex(request.getParameter("Sex"));
			temp.setCollege(request.getParameter("Col"));
			temp.setMajor(request.getParameter("Maj"));
			temp.setEducationBg(request.getParameter("Bj"));
			temp.setFgLanguage(request.getParameter("Lan"));
			temp.setLevel(request.getParameter("Lev"));
			temp.setScore(Double.parseDouble(request.getParameter("Sco")));
			temp.setFg2Language(request.getParameter("Lan2"));
			temp.setLevel2(request.getParameter("Lev2"));
			temp.setPhone(request.getParameter("Pho"));
			temp.setAddress(request.getParameter("Addr"));
			temp.setEmail(request.getParameter("Ema"));
			temp.setHomeTelephone(request.getParameter("Hpho"));
			int studentInfo = daoFactory.getStudentImp().updateStudentInfo(temp);
			if (studentInfo == 0) {
				response.getWriter().print("0");
			} else {
				session.setAttribute("studentInfo", temp);
				response.getWriter().print("1");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("isStudentInfo方法出错！");
		}
	}

}
