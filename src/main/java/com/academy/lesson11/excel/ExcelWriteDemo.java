package com.academy.lesson11.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteDemo {
    public static void main(String[] args) {
        String name = "Olga";
        String path = "C:/Users/af_oleg/Documents/QA-JA-11/maven-project/data/excel.xlsx";
        
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet();
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue(name);

        try (FileOutputStream fos = new FileOutputStream(path)) {
            book.write(fos);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
