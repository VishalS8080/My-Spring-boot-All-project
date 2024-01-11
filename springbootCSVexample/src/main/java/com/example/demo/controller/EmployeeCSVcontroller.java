package com.example.demo.controller;





import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.io.ICsvWriter;
import org.supercsv.prefs.CsvPreference;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeCSVcontroller {
	@Autowired
	private EmployeeService employeeService;
	
 @GetMapping(value="/csvExport")
  public String exportCSVFile(HttpServletResponse responce) throws IOException {
	 
	 responce.setContentType("text/csv");
	 
	 SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	 String strDate = dateformat.format(new Date());
	 
	 responce.setHeader("content-Disposition","attachment;filename=employee_"+strDate+".csv");
	 
	 List<Employee> elist = employeeService.getAllEmployee();
	 
	 ICsvBeanWriter csvWriter = new CsvBeanWriter(responce.getWriter(),CsvPreference.STANDARD_PREFERENCE);
	 String[] csvHeader = {"ID","NAME","ADDRESS","COMPANY NAME"};
	 String[] csvMapping = {"id","name","address","cname"};
	 
	 csvWriter.writeHeader(csvHeader);
	 for(Employee e : elist) {
		 csvWriter.write(e,csvMapping); 
	 }
	 
	 csvWriter.close();
	 return "Data Wtrite in CSV File.";
 }
	
	

}
