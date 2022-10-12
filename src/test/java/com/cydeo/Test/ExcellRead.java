package com.cydeo.Test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcellRead {

    @Test
    public void excell_read () throws IOException {

        // indexler sıfırdan başlıyor
        String path = "SampleData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("Employee");
        System.out.println(sheet.getRow(1).getCell(0)); // mary


      int usedRows = sheet.getPhysicalNumberOfRows(); // emptleri saymaz
       int lastRow = sheet.getLastRowNum(); // emmpty leri sayar


        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Emre")) {
                System.out.println(sheet.getRow(rowNum).getCell(0));
            }

        }

        System.out.println("**********************************");
        // print out linda's job id

        for (int rowNum = 0; rowNum < usedRows ; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Mary")) {
                System.out.println(sheet.getRow(rowNum).getCell(2));
            }
        }


    }




}
