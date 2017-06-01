package com.dhee.tools;

import java.util.List;
import com.dhee.vo.TeacherEva;

public class TeacherInfoPage {
	
	private List<TeacherEva> pagelist;//页面信息存储集合
	private int nowpage;// 当前页---已知
	private int n;// 每页记录数--已知
	private String className;//查询的班级名---已知
	private String teacherName;//查询的教师名---已知
	private int allrow;// 总记录数
	private int allpage;// 总页数
	private boolean isfirst;// 是否是第一页
	private boolean islast;// 是否是最后一页
	private boolean isup;// 是否有前一页
	private boolean isdown;// 是否有后一页


	public TeacherInfoPage(int nowpage, int n, String className, String teacherName) {
		super();
		this.nowpage = nowpage;
		this.n = n;
		this.className = className;
		this.teacherName = teacherName;
	}
	
	//查询结果放入存储对象
	public void setPagelist(List<TeacherEva> pagelist) {
		this.pagelist = pagelist;
	}
	
	//获取总记录数
	public int getAllrow() {
		return allrow;
	}
	
	// 获取总页数
	public int getAllpage() {
		if (getAllrow() % n != 0) {
			return (int) (allrow / n) + 1;
		}
		return allrow / n;
	}
	
	//是否是第一页
	public boolean isIsfirst() {
		if (nowpage == 0) {
			return true;
		}
		return false;
	}
	
	//是否是最后一页
	public boolean isIslast() {
		if (nowpage == getAllpage()) {
			return true;
		}
		return false;
	}
	
	//是否有上一页
	public boolean isIsup() {
		if (nowpage==0) {
			return false;
		}
		return true;
	}

	//是否有下一页
	public boolean isIsdown() {
		if (nowpage==getAllpage()-1) {
			return false;
		}
		return true;
	}
	
	//获取存储对象
	public List<TeacherEva> getPagelist() {
		return pagelist;
	}
	
	//获取起始行
	public int startrow() {	
		return (nowpage*n);
	}

	public String getClassName() {
		return className;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public int getN() {
		return n;
	}

	public void setAllrow(int allrow) {
		this.allrow = allrow;
	}

	@Override
	public String toString() {
		return "StudentInfoPage [allrow=" + getAllrow() + ", allpage=" + getAllpage() + ", nowpage="
				+ nowpage + ", n=" + n + ", isfirst=" +  isIsfirst()+ ", islast=" + isIslast() + ", isup=" + isIsup() + ", isdown="
				+ isIsdown() + ", className=" + className + ", teacherName=" + teacherName + "]";
	}

	public int getNowpage() {
		return nowpage;
	}

	public void setNowpage(int nowpage) {
		this.nowpage = nowpage;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public void setAllpage(int allpage) {
		this.allpage = allpage;
	}

	public void setIsfirst(boolean isfirst) {
		this.isfirst = isfirst;
	}

	public void setIslast(boolean islast) {
		this.islast = islast;
	}

	public void setIsup(boolean isup) {
		this.isup = isup;
	}

	public void setIsdown(boolean isdown) {
		this.isdown = isdown;
	}

	public TeacherInfoPage(List<TeacherEva> pagelist, int nowpage, int n, String className, String teacherName,
			int allrow, int allpage, boolean isfirst, boolean islast, boolean isup, boolean isdown) {
		super();
		this.pagelist = pagelist;
		this.nowpage = nowpage;
		this.n = n;
		this.className = className;
		this.teacherName = teacherName;
		this.allrow = allrow;
		this.allpage = allpage;
		this.isfirst = isfirst;
		this.islast = islast;
		this.isup = isup;
		this.isdown = isdown;
	}

	public TeacherInfoPage() {
		super();
	}
	
	
	
}