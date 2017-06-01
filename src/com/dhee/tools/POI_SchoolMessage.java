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

import com.dhee.vo.SchoolMessage;

public class POI_SchoolMessage {

	public HSSFWorkbook getExcel(List<SchoolMessage> list) {
		SchoolMessage si;
		// 获得excel模板的路径
		String sourceFilePath = ServletActionContext.getServletContext().getRealPath("/EXL")+"\\SchoolMessage.xls";
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
				si = (SchoolMessage) list.get(i);
				// 设置序号的值
				HSSFRow row = sheet.getRow(2 + i);
				HSSFCell cell = row.getCell(0);
				cell.setCellValue(i + 1);

				// 设置学校名称
				row = sheet.getRow(2 + i);
				cell = row.getCell(1);
				cell.setCellValue(si.getSchool_name());

				// 设置院校层次
				row = sheet.getRow(2 + i);
				cell = row.getCell(2);
				cell.setCellValue(si.getSchool_level());

//				int bNameLength = si.getSchool_level().length();// 超过指定长度换行
//				int bNameHeigth = 1;
//				if (bNameLength > 6) {
//					bNameHeigth = bNameLength / 6;
//					if ((bNameLength % 6) != 0) {
//						bNameHeigth++;
//					}
//				}

				// 设置学院名称
				row = sheet.getRow(2 + i);
				cell = row.getCell(3);
				cell.setCellValue(si.getCollage_name());
				int bTypeLength = si.getCollage_name().length(); // 换行
				int bTypeHeigth = 1;
				if (bTypeLength > 3) {
					bTypeHeigth = bTypeLength / 3;
					if ((bTypeLength % 3) != 0) {
						bTypeHeigth++;
					}
				}
				// 设置专业
				row = sheet.getRow(2 + i);
				cell = row.getCell(4);
				cell.setCellValue(si.getProfessional());
				int bIndustryLength = si.getProfessional().length();
				int bIndustryHeigth = 1;
				if (bIndustryLength > 3) {
					bIndustryHeigth = bIndustryLength / 3;
					if ((bIndustryLength % 3) != 0) {
						bIndustryHeigth++;
					}
				}
				// 设置联系人以及职务
				row = sheet.getRow(2 + i);
				cell = row.getCell(5);
				cell.setCellValue(si.getContact_service());

				// 设置电话
				row = sheet.getRow(2 + i);
				cell = row.getCell(6);
				cell.setCellValue(si.getTel());
				// 设置学生人数
				row = sheet.getRow(2 + i);
				cell = row.getCell(7);
				cell.setCellValue(si.getStudent_number());
				// 设置学校所在地
				row = sheet.getRow(2 + i);
				cell = row.getCell(8);
				cell.setCellValue(si.getSchool_location());
				int schoolLength = si.getSchool_location().length();
				int schoolHeigth = 1;
				if (schoolLength > 9) {
					schoolHeigth = schoolLength / 9;
					if (schoolLength % 9 != 0) {
						schoolHeigth++;
					}
				}
				// 设置学院简介
				row = sheet.getRow(2 + i);
				cell = row.getCell(9);
				cell.setCellValue(si.getSchool_profile());
				int skillLength = si.getSchool_profile().length();
				int skillHeigth = 1;
				if (skillLength > 9) {
					skillHeigth = skillLength / 9;
					if (skillLength % 9 != 0) {
						skillHeigth++;
					}
				}
				// 设置学院网站
				row = sheet.getRow(2 + i);
				cell = row.getCell(10);
				cell.setCellValue(si.getSchool_web());
				//设置学校地址
				row = sheet.getRow(2 + i);
				cell = row.getCell(11);
				cell.setCellValue(si.getSchool_address());
				// 设置是否有合作
				
				row = sheet.getRow(2 + i);
				cell = row.getCell(12);
				cell.setCellValue(si.getCooperate());
				// 设置合作企业
				
				row = sheet.getRow(2 + i);
				cell = row.getCell(13);
				cell.setCellValue(si.getCooperate_company());
				// 设置学生动态
				
				row = sheet.getRow(2 + i);
				cell = row.getCell(14);
				cell.setCellValue(si.getStudent_dynamic());
				// 设置可离校时间
				
				row = sheet.getRow(2 + i);
				cell = row.getCell(15);
				cell.setCellValue(si.getLeaveschooltime());
//				// 设置备注
				row = sheet.getRow(2 + i);
				cell = row.getCell(16);
				cell.setCellValue(si.getPs());


				// 设置行高
//				int[] h = { bNameHeigth, bTypeHeigth, bIndustryHeigth, homeHeigth, skillHeigth, schoolHeigth };
//
//				Arrays.sort(h);
//				float height = 15.00f;
//				row.setHeightInPoints(height * h[5]);
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
