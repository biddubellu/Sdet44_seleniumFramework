package com.trendeeverse.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/** 
 * This class contains excel reusable methods
 * @author Biddappa1
 *
 */

public class ExcelUtility
{
	private Workbook book;
	private FileInputStream fisexcel;
	private DataFormatter df;
	/**This method is used to fetch the data from the excel using row and cell index
	 * 
	 * @param excelPath
	 * @param sheetName
	 * @param RowNumber
	 * @param cellNumber
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */





	//Open the excel sheet
	public void openExcel() throws EncryptedDocumentException, IOException
	{

		fisexcel= new FileInputStream(IConstant.EXCEL_PATH);
		book= WorkbookFactory.create(fisexcel);

	}


	//Fetch the Data from the Excel
	public String getDataFromExcel( String sheetName, int RowNumber,int cellNumber) throws EncryptedDocumentException, IOException
	{

		df= new DataFormatter();
		String data = df.formatCellValue(book.getSheet(sheetName).getRow(RowNumber).getCell(cellNumber));
		return data;

	}

	public void setDataToExcel( String excelPath, String sheetName,int rowNumber,int cellNumber,String message) throws IOException
	{
		book.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).setCellValue(message);
		FileOutputStream fos= new FileOutputStream(excelPath);
		book.write(fos);
	}


	/**
	 * This method is used to close the excel
	 * @throws IOException 
	 */

	public void closeExcel() throws IOException
	{

		book.close();
		fisexcel.close();


	}
	/**
	 * this method is ud=sed to fetch multiple datat from excel ad store in string[][]
	 * @return 
	 */
	public String[][] getDataFromExcel(String sheetName) {
		Sheet sheet = book.getSheet(sheetName);
		int lastrownumber = sheet.getLastRowNum();// returns the index
		short lastcellnumber = sheet.getRow(0).getLastCellNum();//return count
		df= new DataFormatter();
		String[][] arr=new String[lastrownumber][lastcellnumber];
		for(int i=0;i<lastrownumber;i++) {
			for(int j=0;j<lastcellnumber;j++) {

				arr[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}

		}
		return arr;

	}
}