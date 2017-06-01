package com.dhee.daoFactory;

import com.dhee.dao.StudentDao;
import com.dhee.dao.TeacherDao;
import com.dhee.daoLmpl.StudentImpl;
import com.dhee.daoLmpl.TeacherImpl;

public class DAOFactory {
	
	public StudentDao getStudentImp() {
		return new StudentImpl();
	}
	
	public TeacherDao getTeacherImp() {
		return new TeacherImpl();
	}

}
