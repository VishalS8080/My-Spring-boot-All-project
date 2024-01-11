package com.example.demo.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
public class FileDataController {

	
	@GetMapping(value = "/exel/export")
	public void excelFileWriting() throws IOException {
		Student student = new Student();
		student.setId(1);
		student.setName("mayur");
		student.setAddress("pune");
		student.setStd("10th");
		student.setDiv("A");

		Student student1 = new Student();
		student.setId(2);
		student.setName("sanjay");
		student.setAddress("mumbai");
		student.setStd("10th");
		student.setDiv("A");

		Student student2 = new Student();
		student.setId(3);
		student.setName("Amit");
		student.setAddress("Thane");
		student.setStd("10th");
		student.setDiv("A");

		Student student3 = new Student();
		student.setId(4);
		student.setName("Akshay");
		student.setAddress("Thane");
		student.setStd("10th");
		student.setDiv("A");

		Student student4 = new Student();
		student.setId(5);
		student.setName("Amar");
		student.setAddress("Thane");
		student.setStd("10th");
		student.setDiv("A");

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("Student_Data");

		Map<String, Object[]> map = new HashMap<String, Object[]>();

		map.put("1", new Object[] { "ID", "NAME", "ADDRESS", "STD", "DIV" });

		map.put("2", new Object[] { student.getId(), student.getName(), student.getAddress(), student.getStd(),
				student.getDiv() });

		map.put("3", new Object[] { student1.getId(), student1.getName(), student.getAddress(), student.getStd(),
				student.getDiv() });

		map.put("4", new Object[] { student2.getId(), student2.getName(), student2.getAddress(), student2.getStd(),
				student2.getDiv() });

		map.put("5", new Object[] { student3.getId(), student3.getName(), student3.getAddress(), student3.getStd(),
				student3.getDiv() });

		map.put("6", new Object[] { student4.getId(), student4.getName(), student4.getAddress(), student4.getStd(),
				student4.getDiv() });

		Set<String> keySet = map.keySet();
		int rowNum = 0;

	for (String key : keySet) {

			Row row = sheet.createRow(rowNum++);
			Object[] objArr = map.get(key);

			int cellNum = 0;

			for (Object obj : objArr) {
				Cell cell = row.createCell(cellNum++);
				if (obj instanceof Integer) {
					cell.setCellValue((Integer) obj);
				} else if (obj instanceof String) {
					cell.setCellValue((String) obj);
				}
			}

		}
		FileOutputStream out = new FileOutputStream(new File("F:\\student_data_new.xlsx"));
		workbook.write(out);
		out.close();
	}
	
}
