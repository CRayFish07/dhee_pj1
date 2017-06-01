package com.dhee.tools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.struts2.ServletActionContext;

import com.dhee.vo.TeacherEva;

public class POI_TeacherEva {

	public HSSFWorkbook getExcel(TeacherEva t) {
		TeacherEva te = t;
		// 获得excel模板的路径
		String sourceFilePath = ServletActionContext.getServletContext().getRealPath("/EXL") + "\\TeacherEva.xls";
		// 文件链接器
		POIFSFileSystem fs;
		// exl工作bo
		HSSFWorkbook wb = null;
		try {
			fs = new POIFSFileSystem(new FileInputStream(sourceFilePath));
			wb = new HSSFWorkbook(fs);
			// 获得exl表
			HSSFSheet sheet = wb.getSheetAt(0);
			// 设置第二行第一个单元格的值
			HSSFRow row = sheet.getRow(1);
			HSSFCell cell = row.getCell(0);
			cell.setCellValue(te.getStudent());

			// 设置第二行第二个单元的值
			row = sheet.getRow(1);
			cell = row.getCell(1);
			cell.setCellValue("班级:" + te.getClasses() + "   培训讲师:" + te.getTeacher() + "   课程：" + te.getCourse());
			// 设置第二行第三个单元的值

			row = sheet.getRow(1);
			cell = row.getCell(2);
			cell.setCellValue("总分：" + te.getSumCore());

			// 设置第二行第三个单元的值
			row = sheet.getRow(1);
			cell = row.getCell(3);
			cell.setCellValue("日期：" + te.getDate());

			// 进行数据处理
			String[] a1 = te.getPerQuality().split("#src#");
			String[] a11 = te.getPerQualityActual().split("#src#");
			String[] a2 = te.getTeachAttitude().split("#src#");
			String[] a22 = te.getTeachAttitudeActual().split("#src#");
			String[] a3 = te.getTeachLevel().split("#src#");
			String[] a33 = te.getTeachLevelActual().split("#src#");

			// 设置分值
			row = sheet.getRow(3);
			cell = row.getCell(2);
			cell.setCellValue(a1[0]);

			// 设置实际情况
			row = sheet.getRow(3);
			cell = row.getCell(3);
			cell.setCellValue(a11[0]);
			int bIndustryLength = a11[0].length();
			int bIndustryHeigth = 1;
			if (bIndustryLength > 3) {
				bIndustryHeigth = bIndustryLength / 3;
				if ((bIndustryLength % 3) != 0) {
					bIndustryHeigth++;
				}
			}
			// 设置分值
			row = sheet.getRow(4);
			cell = row.getCell(2);
			cell.setCellValue(a1[1]);

			// 设置实际情况
			row = sheet.getRow(4);
			cell = row.getCell(3);
			cell.setCellValue(a11[1]);
			int cIndustryLength = a11[1].length();
			int cIndustryHeigth = 1;
			if (cIndustryLength > 3) {
				cIndustryHeigth = cIndustryLength / 3;
				if ((cIndustryLength % 3) != 0) {
					cIndustryHeigth++;
				}
			}
			// 设置分值
			row = sheet.getRow(5);
			cell = row.getCell(2);
			cell.setCellValue(a1[2]);

			// 设置实际情况
			row = sheet.getRow(5);
			cell = row.getCell(3);
			cell.setCellValue(a11[2]);
			int dIndustryLength = te.getPerQualityActual().length();
			int dIndustryHeigth = 1;
			if (cIndustryLength > 3) {
				dIndustryHeigth = dIndustryLength / 3;
				if ((dIndustryLength % 3) != 0) {
					dIndustryHeigth++;
				}
			}

			// 设置分值
			row = sheet.getRow(6);
			cell = row.getCell(2);
			cell.setCellValue(a2[0]);

			// 设置实际情况
			row = sheet.getRow(6);
			cell = row.getCell(3);
			cell.setCellValue(a22[0]);
			int eIndustryLength = a22[0].length();
			int eIndustryHeigth = 1;
			if (eIndustryLength > 3) {
				eIndustryHeigth = eIndustryLength / 3;
				if ((eIndustryLength % 3) != 0) {
					eIndustryHeigth++;
				}
			}
			// 设置分值
			row = sheet.getRow(7);
			cell = row.getCell(2);
			cell.setCellValue(a2[1]);

			// 设置实际情况
			row = sheet.getRow(7);
			cell = row.getCell(3);
			cell.setCellValue(a22[1]);
			int fIndustryLength = a22[1].length();
			int fIndustryHeigth = 1;
			if (fIndustryLength > 3) {
				fIndustryHeigth = eIndustryLength / 3;
				if ((fIndustryLength % 3) != 0) {
					fIndustryHeigth++;
				}
			}
			// 设置分值
			row = sheet.getRow(8);
			cell = row.getCell(2);
			cell.setCellValue(a2[2]);

			// 设置实际情况
			row = sheet.getRow(8);
			cell = row.getCell(3);
			cell.setCellValue(a22[2]);

			// 设置分值
			row = sheet.getRow(9);
			cell = row.getCell(2);
			cell.setCellValue(a2[3]);

			// 设置实际情况
			row = sheet.getRow(9);
			cell = row.getCell(3);
			cell.setCellValue(a22[3]);
			// 设置分值
			row = sheet.getRow(10);
			cell = row.getCell(2);
			cell.setCellValue(a2[4]);

			// 设置实际情况
			row = sheet.getRow(10);
			cell = row.getCell(3);
			cell.setCellValue(a22[4]);
			// 设置分值
			row = sheet.getRow(11);
			cell = row.getCell(2);
			cell.setCellValue(a2[5]);

			// 设置实际情况
			row = sheet.getRow(11);
			cell = row.getCell(3);
			cell.setCellValue(a22[5]);
			// 设置分值
			row = sheet.getRow(12);
			cell = row.getCell(2);
			cell.setCellValue(a2[6]);

			// 设置实际情况
			row = sheet.getRow(12);
			cell = row.getCell(3);
			cell.setCellValue(a22[6]);
			// 设置分值
			row = sheet.getRow(13);
			cell = row.getCell(2);
			cell.setCellValue(a2[7]);

			// 设置实际情况
			row = sheet.getRow(13);
			cell = row.getCell(3);
			cell.setCellValue(a22[7]);

			// 设置分值
			row = sheet.getRow(14);
			cell = row.getCell(2);
			cell.setCellValue(a3[0]);

			// 设置实际情况
			row = sheet.getRow(14);
			cell = row.getCell(3);
			cell.setCellValue(a33[0]);

			// 设置分值
			row = sheet.getRow(15);
			cell = row.getCell(2);
			cell.setCellValue(a3[1]);

			// 设置实际情况
			row = sheet.getRow(15);
			cell = row.getCell(3);
			cell.setCellValue(a33[1]);
			// 设置分值
			row = sheet.getRow(16);
			cell = row.getCell(2);
			cell.setCellValue(a3[2]);

			// 设置实际情况
			row = sheet.getRow(16);
			cell = row.getCell(3);
			cell.setCellValue(a33[2]);
			// 设置分值
			row = sheet.getRow(17);
			cell = row.getCell(2);
			cell.setCellValue(a3[3]);

			// 设置实际情况
			row = sheet.getRow(17);
			cell = row.getCell(3);
			cell.setCellValue(a33[3]);
			// 设置分值
			row = sheet.getRow(18);
			cell = row.getCell(2);
			cell.setCellValue(a3[4]);

			// 设置实际情况
			row = sheet.getRow(18);
			cell = row.getCell(3);
			cell.setCellValue(a33[4]);
			// 设置分值
			row = sheet.getRow(19);
			cell = row.getCell(2);
			cell.setCellValue(a3[5]);

			// 设置实际情况
			row = sheet.getRow(19);
			cell = row.getCell(3);
			cell.setCellValue(a33[5]);
			// 设置意见和建议
			row = sheet.getRow(22);
			cell = row.getCell(0);
			cell.setCellValue(te.getIdea1());

			// 设置意见和建议
			row = sheet.getRow(25);
			cell = row.getCell(0);
			cell.setCellValue(te.getIdea2());

			// 设置意见和建议
			row = sheet.getRow(28);
			cell = row.getCell(0);
			cell.setCellValue(te.getIdea3());
			// 设置后勤支持
			row = sheet.getRow(30);
			cell = row.getCell(0);
			cell.setCellValue("1.教师环境及设备时候合适：" + te.getLogistics1());
			// 设置后勤支持
			row = sheet.getRow(31);
			cell = row.getCell(0);
			cell.setCellValue("2.电脑维护及问题解决是否及时充分：" + te.getLogistics2());
			// 设置后勤支持
			row = sheet.getRow(32);
			cell = row.getCell(0);
			cell.setCellValue("3.获得课程信息是否及时：" + te.getLogistics3());
			// 设置后勤支持
			row = sheet.getRow(33);
			cell = row.getCell(0);
			cell.setCellValue("4.培训中心沟通反馈是否流畅：" + te.getLogistics4());

			// 设置行高
			int[] h = { bIndustryHeigth, cIndustryHeigth, dIndustryHeigth, eIndustryHeigth, fIndustryHeigth };

			Arrays.sort(h);
			float height = 15.00f;
			row.setHeightInPoints(height * h[4]);

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return wb;
	}

}
