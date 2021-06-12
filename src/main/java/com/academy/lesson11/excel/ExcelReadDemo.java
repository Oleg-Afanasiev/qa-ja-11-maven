package com.academy.lesson11.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReadDemo {
    public static void main(String[] args) {
        String path = "C:/Users/af_oleg/Documents/QA-JA-11/maven-project/data/excel.xlsx";

        try (FileInputStream fis = new FileInputStream(path);
        Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(0);
            Cell cell = row.getCell(0);
            String name = cell.getStringCellValue();
            System.out.println(name);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
