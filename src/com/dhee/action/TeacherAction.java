package com.dhee.action;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.dhee.daoFactory.DAOFactory;
import com.dhee.tools.POI_SchoolMessage;
import com.dhee.tools.POI_StudentInfo;
import com.dhee.tools.POI_TeacherEva;
import com.dhee.tools.SchoolMessagePage;
import com.dhee.tools.StudentInfoPage;
import com.dhee.tools.TeacherInfoPage;
import com.dhee.vo.SchoolMessage;
import com.dhee.vo.Student;
import com.dhee.vo.StudentInfo;
import com.dhee.vo.Teacher;
import com.dhee.vo.TeacherEva;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

public class TeacherAction extends SuperAction {
	private DAOFactory daoFactory = new DAOFactory();

	// 是否有该用户名
	public void isTeacherName() {
		try {
			Teacher temp = new Teacher();
			temp.setTname(request.getParameter("teacherName"));
			Teacher teacher = daoFactory.getTeacherImp().selectTeacher(temp);
			if (teacher == null) {
				response.getWriter().print("0");
			} else {
				response.getWriter().print("1");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("isTeacherName方法出错！");
		}
	}

	// 是否有该用户
	public void isTeacherUser() {
		try {
			Teacher temp = new Teacher();
			temp.setTname(request.getParameter("teacherName"));
			Teacher teacher = daoFactory.getTeacherImp().selectTeacher(temp);
			if (teacher == null) {
				response.getWriter().print("0");
			} else {
				if (request.getParameter("teacherPassword").equals(teacher.getTpassword())) {
					session.setAttribute("nowName", teacher.getTname());
					session.setAttribute("type", "0");
					response.getWriter().print("1");
				} else {
					response.getWriter().print("0");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("isTeacherUser方法出错！");
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

	// 查询学生信息
	public void selectStudentInfo() {
		try {
			String className = request.getParameter("className");
			String studentName = request.getParameter("studentName");
			String newPag = request.getParameter("newPag");
			StudentInfoPage temp = new StudentInfoPage(Integer.parseInt(newPag), 10, className, studentName);
			StudentInfoPage studentInfoPage = new DAOFactory().getTeacherImp().selectStudentInfo(temp);
			JsonConfig jsonConfig = new JsonConfig();
			jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonValueProcessor() {
				private SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

				public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {
					return value == null ? "" : sd.format(value);
				}

				public Object processArrayValue(Object value, JsonConfig jsonConfig) {
					return null;
				}
			});

			response.setHeader("Content-type", "text/html;charset=UTF-8");
			response.getWriter().print(JSONArray.fromObject(studentInfoPage, jsonConfig).toString());
			System.out.println(JSONArray.fromObject(studentInfoPage, jsonConfig).toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("selectStudentInfo方法出错！");
		}

	}

	// 添加学生信息
	public void saveStudentInfo() {
		try {
			String classes = request.getParameter("classes");
			String name = request.getParameter("name");
			String employment_status = request.getParameter("employment_status");
			String sex = request.getParameter("sex");
			String birthday = request.getParameter("birthday");
			String graduation_time = request.getParameter("graduation_time");
			String category = request.getParameter("category");
			String college = request.getParameter("college");
			String major = request.getParameter("major");
			String education_bg = request.getParameter("education_bg");
			String fg_language = request.getParameter("fg_language");
			String level = request.getParameter("level");
			String score = request.getParameter("score");
			String fg2_language = request.getParameter("fg2_language");
			String level2 = request.getParameter("level2");
			String phone = request.getParameter("phone");
			String address = request.getParameter("address");
			String email = request.getParameter("email");
			String home_telephone = request.getParameter("home_telephone");
			StudentInfo studentInfo = new StudentInfo();
			studentInfo.setClasses(classes);
			studentInfo.setName(name);
			studentInfo.setEmploymentStatus(employment_status);
			studentInfo.setSex(sex.equals("boy") ? "TT" : "FF");
			studentInfo.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(birthday));
			studentInfo.setGraduationTime(new SimpleDateFormat("yyyy-MM-dd").parse(graduation_time));
			studentInfo.setCategory(category);
			studentInfo.setCollege(college);
			studentInfo.setMajor(major);
			studentInfo.setEducationBg(education_bg);
			studentInfo.setFgLanguage(fg_language);
			studentInfo.setLevel(level);
			studentInfo.setScore(Double.parseDouble(score));
			studentInfo.setFg2Language(fg2_language);
			studentInfo.setLevel2(level2);
			studentInfo.setPhone(phone);
			studentInfo.setAddress(address);
			studentInfo.setEmail(email);
			studentInfo.setHomeTelephone(home_telephone);
			new DAOFactory().getTeacherImp().saveStudent(new Student(name, "000000"));
			new DAOFactory().getTeacherImp().saveStudentInfo(studentInfo);
			response.getWriter().print("1");
		} catch (Exception e) {
			System.out.println("saveStudentInfo方法出错！");
		}
	}

	// 添加学生时判断是否添加过
	public void isStudentInfoName() {
		try {
			String name = request.getParameter("name");
			response.getWriter().print(new DAOFactory().getTeacherImp().isStudentInfoName(name));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("isStudentInfoName方法出错！");
		}
	}

	// 删除学生详细信息
	public void deleteStudentInfo() {
		try {
			String deletRow = request.getParameter("deletRow");
			new DAOFactory().getTeacherImp().deletStudent(new Student(Integer.parseInt(deletRow), "", ""));
			new DAOFactory().getTeacherImp().deletStudentInfo(deletRow);
			response.getWriter().print("1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("deleteStudentInfo方法出错！");
		}
	}

	// 更新学生的详细信息
	public void updateStudentInfo() {
		try {
			String id = request.getParameter("id");
			String classes = request.getParameter("classes");
			String name = request.getParameter("name");
			String employment_status = request.getParameter("employment_status");
			String sex = request.getParameter("sex");
			String birthday = request.getParameter("birthday");
			String graduation_time = request.getParameter("graduation_time");
			String category = request.getParameter("category");
			String college = request.getParameter("college");
			String major = request.getParameter("major");
			String education_bg = request.getParameter("education_bg");
			String fg_language = request.getParameter("fg_language");
			String level = request.getParameter("level");
			String score = request.getParameter("score");
			String fg2_language = request.getParameter("fg2_language");
			String level2 = request.getParameter("level2");
			String phone = request.getParameter("phone");
			String address = request.getParameter("address");
			String email = request.getParameter("email");
			String home_telephone = request.getParameter("home_telephone");
			StudentInfo studentInfo = new StudentInfo();
			studentInfo.setId(Integer.parseInt(id));
			studentInfo.setClasses(classes);
			studentInfo.setName(name);
			studentInfo.setEmploymentStatus(employment_status);
			studentInfo.setSex(sex.equals("boy") ? "T" : "F");
			studentInfo.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(birthday));
			studentInfo.setGraduationTime(new SimpleDateFormat("yyyy-MM-dd").parse(graduation_time));
			studentInfo.setCategory(category);
			studentInfo.setCollege(college);
			studentInfo.setMajor(major);
			studentInfo.setEducationBg(education_bg);
			studentInfo.setFgLanguage(fg_language);
			studentInfo.setLevel(level);
			studentInfo.setScore(Double.parseDouble(score));
			studentInfo.setFg2Language(fg2_language);
			studentInfo.setLevel2(level2);
			studentInfo.setPhone(phone);
			studentInfo.setAddress(address);
			studentInfo.setEmail(email);
			studentInfo.setHomeTelephone(home_telephone);
			new DAOFactory().getTeacherImp().updateStudentInfo(studentInfo);
			response.getWriter().print("1");
		} catch (Exception e) {
			System.out.println("updateStudentInfo方法出错！");
		}
	}

	// 导出学生EXL
	public void outStudentExl() {
		try {
			String className = request.getParameter("className");
			String studentName = request.getParameter("studentName");
			List<StudentInfo> list = new DAOFactory().getTeacherImp().selectStudentInfo(className, studentName);
			HSSFWorkbook wb = new POI_StudentInfo().getExcel(list);

			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/x-download");
			String filedisplay = className + "-" + studentName + "学生管理表.xls";
			filedisplay = URLEncoder.encode(filedisplay, "UTF-8");
			response.addHeader("Content-Disposition", "attachment;filename=" + filedisplay);
			OutputStream out = response.getOutputStream();
			wb.write(out);
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("outStudentExl方法出错！");
		}
	}
	

	// 旧密码是否正确
	public void isPassword() {
		try {
			String nowUser = session.getAttribute("nowName").toString();
			String tempPW = request.getParameter("oldPassword");
			Teacher teacher = new DAOFactory().getTeacherImp().selectTeacher(new Teacher(nowUser, ""));

			if (teacher.getTpassword().equals(tempPW)) {
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
			new DAOFactory().getTeacherImp().updateTeacher(new Teacher(nowUser, newPassword));
			response.getWriter().print("1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("updatePassword方法出错！");
		}
	}

	// 查询老师评价页
	public void selectStudentEva() {
		try {
			String className = request.getParameter("className");
			String teacherName = request.getParameter("teacherName");
			String newPag = request.getParameter("newPag");
			TeacherInfoPage temp = new TeacherInfoPage(Integer.parseInt(newPag), 10, className, teacherName);
			TeacherInfoPage teacherInfoPage = new DAOFactory().getTeacherImp().selectTeacherEva(temp);
			JsonConfig jsonConfig = new JsonConfig();
			jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonValueProcessor() {
				private SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

				public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {
					return value == null ? "" : sd.format(value);
				}

				public Object processArrayValue(Object value, JsonConfig jsonConfig) {
					return null;
				}
			});
			response.setHeader("Content-type", "text/html;charset=UTF-8");
			response.getWriter().print(JSONArray.fromObject(teacherInfoPage, jsonConfig).toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("selectStudentEva方法出错！");
		}
	}

	// 删除教师评价表
	public void deleteTeacherEva() {
		try {
			String deletRow = request.getParameter("deletRow");
			new DAOFactory().getTeacherImp().deletTeacherEva(new TeacherEva(Integer.parseInt(deletRow)));
			response.getWriter().print("1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("deleteTeacherEva方法出错！");
		}
	}

	// 导出教师评价表Exl
	public void outTeacherExl() {
		try {
			TeacherEva tEva = new DAOFactory().getTeacherImp()
					.selectTeacherEva(new TeacherEva(Integer.parseInt(request.getParameter("outId"))));
			HSSFWorkbook wb = new POI_TeacherEva().getExcel(tEva);
			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/x-download");
			String filedisplay = "讲师授课效果评价表-" + tEva.getTeacher() + ".xls";
			filedisplay = URLEncoder.encode(filedisplay, "UTF-8");
			response.addHeader("Content-Disposition", "attachment;filename=" + filedisplay);
			OutputStream out = response.getOutputStream();
			wb.write(out);
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("outTeacherExl方法出错！");
		}
	}
	// 查看学院评价信息
	public void selectSchoolMessage(){
		String schoolname = request.getParameter("schoolname");
		String collagename = request.getParameter("collagename");
		String newPag = request.getParameter("newPag");
		SchoolMessagePage smp = new SchoolMessagePage(Integer.parseInt(newPag), 10, schoolname, collagename);
		SchoolMessagePage schoolMessagePage = new DAOFactory().getTeacherImp().selectSchoolMessagePage(smp);
		JsonConfig jsonConfig = new JsonConfig();
		try {
			response.setHeader("Content-type", "text/html;charset=UTF-8");
			response.getWriter().print(JSONArray.fromObject(schoolMessagePage, jsonConfig).toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//导出学校信息EXL
		public void outSchoolMessageExl(){
			try {
			String schoolname = request.getParameter("schoolname");
			String collagename = request.getParameter("collagename");
			List<SchoolMessage> list=new DAOFactory().getTeacherImp().selectSchoolMessage(schoolname, collagename);
			HSSFWorkbook wb = new POI_SchoolMessage().getExcel(list);
			
			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/x-download");
			String filedisplay = schoolname + "-" + collagename + "学校信息表.xls";
			
				filedisplay = URLEncoder.encode(filedisplay, "UTF-8");
			
			response.addHeader("Content-Disposition", "attachment;filename=" + filedisplay);
			OutputStream out;
			
				out = response.getOutputStream();
				wb.write(out);
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	// 删除学院评价信息
	public void deleteSchoolMessage(){
		try {
			String deletRow = request.getParameter("deletRow");
			new DAOFactory().getTeacherImp().deleteSchoolMessageProject(new SchoolMessage(Integer.parseInt(deletRow)));
			new DAOFactory().getTeacherImp().deleteSchoolMessage(deletRow);
			response.getWriter().print("1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("deleteStudentInfo方法出错！");
		}
	}
	// 添加学院评价信息
		public void saveSchoolMessage() {
			try {			
				String school_name = request.getParameter("school_name");
				String school_level = request.getParameter("school_level");
				String collage_name = request.getParameter("collage_name");
				String professional= request.getParameter("professional");
				String contact_service = request.getParameter("contact_service");
				String tel = request.getParameter("tel");
				String student_number = request.getParameter("student_number");
				String school_location = request.getParameter("school_location");
				String school_profile = request.getParameter("school_profile");
				String school_web = request.getParameter("school_web");
				String school_address = request.getParameter("school_address");
				String cooperate = request.getParameter("cooperate");
				String cooperate_company = request.getParameter("cooperate_company");
				String student_dynamic = request.getParameter("student_dynamic");
				String leaveschooltime = request.getParameter("leaveschooltime");
				String ps = request.getParameter("ps");
				SchoolMessage SchoolMessage=new SchoolMessage();
				SchoolMessage.setSchool_name(school_name);
				SchoolMessage.setSchool_level(school_level);
				SchoolMessage.setCollage_name(collage_name);
				SchoolMessage.setProfessional(professional);
				SchoolMessage.setContact_service(contact_service);
				SchoolMessage.setTel(tel);
				SchoolMessage.setStudent_number(student_number);
				SchoolMessage.setSchool_location(school_location);
				SchoolMessage.setSchool_profile(school_profile);
				SchoolMessage.setSchool_web(school_web);
				SchoolMessage.setSchool_address(school_address);
				SchoolMessage.setCooperate(cooperate);
				SchoolMessage.setCooperate_company(cooperate_company);
				SchoolMessage.setStudent_dynamic(student_dynamic);
				SchoolMessage.setLeaveschooltime(leaveschooltime);
				SchoolMessage.setPs(ps);
				new DAOFactory().getTeacherImp().addSchoolMessage(SchoolMessage);
				response.getWriter().print("1");
			} catch (Exception e) {
				System.out.println("saveSchoolMessage方法出错！");
			}
		}
		// 更新学生的详细信息
		public void updateSchoolMessage() {
			try {
				System.out.println("123");
				String id = request.getParameter("id");
				String school_name = request.getParameter("school_name");
				String school_level = request.getParameter("school_level");
				String collage_name = request.getParameter("collage_name");
				String professional= request.getParameter("professional");
				String contact_service = request.getParameter("contact_service");
				String tel = request.getParameter("tel");
				String student_number = request.getParameter("student_number");
				String school_location = request.getParameter("school_location");
				String school_profile = request.getParameter("school_profile");
				String school_web = request.getParameter("school_web");
				String school_address = request.getParameter("school_address");
				String cooperate = request.getParameter("cooperate");
				String cooperate_company = request.getParameter("cooperate_company");
				String student_dynamic = request.getParameter("student_dynamic");
				String leaveschooltime = request.getParameter("leaveschooltime");
				String ps = request.getParameter("ps");
				SchoolMessage SchoolMessage=new SchoolMessage();
				SchoolMessage.setId(Integer.parseInt(id));
				SchoolMessage.setSchool_name(school_name);
				SchoolMessage.setSchool_level(school_level);
				SchoolMessage.setCollage_name(collage_name);
				SchoolMessage.setProfessional(professional);
				SchoolMessage.setContact_service(contact_service);
				SchoolMessage.setTel(tel);
				SchoolMessage.setStudent_number(student_number);
				SchoolMessage.setSchool_location(school_location);
				SchoolMessage.setSchool_profile(school_profile);
				SchoolMessage.setSchool_web(school_web);
				SchoolMessage.setSchool_address(school_address);
				SchoolMessage.setCooperate(cooperate);
				SchoolMessage.setCooperate_company(cooperate_company);
				SchoolMessage.setStudent_dynamic(student_dynamic);
				SchoolMessage.setLeaveschooltime(leaveschooltime);
				SchoolMessage.setPs(ps);
				new DAOFactory().getTeacherImp().updateSchoolMessage(SchoolMessage);
				response.getWriter().print("1");
			} catch (Exception e) {
				System.out.println("updateSchoolMessage方法出错！");
			}
		}

}
