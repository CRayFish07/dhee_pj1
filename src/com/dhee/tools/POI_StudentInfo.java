package com.dhee.tools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.struts2.ServletActionContext;

import com.dhee.vo.StudentInfo;

public class POI_StudentInfo {

	public HSSFWorkbook getExcel(List<StudentInfo> list) {
		StudentInfo si;
		// 获得excel模板的路径
		String sourceFilePath = ServletActionContext.getServletContext().getRealPath("/EXL")+"\\StudentInfo.xls";
		// 文件链接器
		POIFSFileSystem fs;
		// exl工作bo
		HSSFWorkbook wb=null;
		try {
			fs = new POIFSFileSystem(new FileInputStream(sourceFilePath));
			wb = new HSSFWorkbook(fs);
			// 获得exl表
			HSSFSheet sheet = wb.getSheetAt(0);
			// 根据记录的数量插入行
			// 添加空行
			HSSFRow sourceRow = null;
			HSSFRow targetRow = null;
			HSSFCell sourceCell = null;
			HSSFCell targetCell = null;
			int num = list.size() - 2;// 表中留有两个空行，只需插入list.size()-2个空行就行
			if (num > 0) {
				for (int j = 1; j <= num; j++) {
					sheet.shiftRows(2 + j, 20 + j, 1, true, false); // 底部数据向下移动一行
					sourceRow = sheet.getRow(1 + j); // 源行
					targetRow = sheet.getRow(2 + j); // 新加入的行
					for (int i = sourceRow.getFirstCellNum(); i < sourceRow.getLastCellNum(); i++) {
						sourceCell = sourceRow.getCell(i);
						targetCell = targetRow.createCell(i);
						targetCell.setCellStyle(sourceCell.getCellStyle());
						targetCell.setCellType(sourceCell.getCellType());
					}
				}
			}

			for (int i = 0; i < list.size(); i++) {
				si = (StudentInfo) list.get(i);
				// 设置序号的值
				HSSFRow row = sheet.getRow(2 + i);
				HSSFCell cell = row.getCell(0);
				cell.setCellValue(i + 1);

				// 设置班级的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(1);
				cell.setCellValue(si.getClasses());

				// 设置姓名的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(2);
				cell.setCellValue(si.getName());

				int bNameLength = si.getName().length();// 超过指定长度换行
				int bNameHeigth = 1;
				if (bNameLength > 6) {
					bNameHeigth = bNameLength / 6;
					if ((bNameLength % 6) != 0) {
						bNameHeigth++;
					}
				}

				// 设置就业情况的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(3);
				cell.setCellValue(si.getEmploymentStatus());
				int bTypeLength = si.getEmploymentStatus().length();
				int bTypeHeigth = 1;
				if (bTypeLength > 3) {
					bTypeHeigth = bTypeLength / 3;
					if ((bTypeLength % 3) != 0) {
						bTypeHeigth++;
					}
				}
				// 设置性别的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(4);
				cell.setCellValue(si.getSex());
				int bIndustryLength = si.getSex().length();
				int bIndustryHeigth = 1;
				if (bIndustryLength > 3) {
					bIndustryHeigth = bIndustryLength / 3;
					if ((bIndustryLength % 3) != 0) {
						bIndustryHeigth++;
					}
				}
				// 设置出生年月日的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(5);
				cell.setCellValue(si.getBirthday());

				// 设置毕业时间的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(6);
				cell.setCellValue(si.getGraduationTime());
				// 设置类型的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(7);
				cell.setCellValue(si.getCategory());
				// 设置所在院校的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(8);
				cell.setCellValue(si.getCollege());
				int schoolLength = si.getCollege().length();
				int schoolHeigth = 1;
				if (schoolLength > 9) {
					schoolHeigth = schoolLength / 9;
					if (schoolLength % 9 != 0) {
						schoolHeigth++;
					}
				}
				// 设置专业的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(9);
				cell.setCellValue(si.getMajor());
				int skillLength = si.getMajor().length();
				int skillHeigth = 1;
				if (skillLength > 9) {
					skillHeigth = skillLength / 9;
					if (skillLength % 9 != 0) {
						skillHeigth++;
					}
				}
				// 设置学历的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(10);
				cell.setCellValue(si.getEducationBg());
				// 设置外语语种的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(11);
				cell.setCellValue(si.getFgLanguage());
				// 设置级别的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(12);
				cell.setCellValue(si.getLevel());
				// 设置分数的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(13);
				cell.setCellValue(si.getLevel2());
				// 设置第二外语的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(14);
				cell.setCellValue(si.getFg2Language());
				// 设置级别的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(15);
				cell.setCellValue(si.getScore());
				// 设置手机的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(16);
				cell.setCellValue(si.getPhone());
				// 设置家庭所在地的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(17);
				cell.setCellValue(si.getAddress());
				int homeLength = si.getAddress().length();
				int homeHeigth = 1;
				if (homeLength > 10) {
					homeHeigth = homeLength / 10;
					if (homeLength % 10 != 0) {
						homeHeigth++;
					}
				}
				// 设置电子邮箱的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(18);
				cell.setCellValue(si.getEmail());
				// 设置家庭电话的值
				row = sheet.getRow(2 + i);
				cell = row.getCell(19);
				cell.setCellValue(si.getHomeTelephone());

				// 设置行高
				int[] h = { bNameHeigth, bTypeHeigth, bIndustryHeigth, homeHeigth, skillHeigth, schoolHeigth };

				Arrays.sort(h);
				float height = 15.00f;
				row.setHeightInPoints(height * h[5]);
			}
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
