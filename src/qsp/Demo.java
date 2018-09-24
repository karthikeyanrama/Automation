package qsp;

import java.io.File;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo {
	public static void main(String[] args) throws Exception {
	Workbook book = WorkbookFactory.create(new File("./data/book1.xlsx"));
	String a = book.getSheet("sheet1").getRow(0).getCell(0).toString();
	System.out.println(a);
	}

}
