package base.start1;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;

public class FileDatas {
public String getDatas(String sheetName,int rowNum,int colNum) throws IOException {
	
	String filepath="C:\\Users\\deepa.vadivel\\eclipse-workspace\\SampleProject\\src\\main\\java\\base\\start1\\Datas.xlsx";
	FileInputStream fs=new FileInputStream(filepath);
	Workbook wb= WorkbookFactory.create(fs);
	Sheet sh = wb.getSheet(sheetName);
	Row row = sh.getRow(rowNum);
	String data = row.getCell(colNum).getStringCellValue();
	wb.close();
	return data; 
}
}
