package com.academy.lesson11.excel;

import com.academy.lesson04.Person;
import com.academy.lesson05.Gender;
import com.academy.util.PropertyProvider;
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
        String path = PropertyProvider.get("data.excel.persons");
        
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet();
        Person person = new Person();
        person.setFirstName("Вася");
        person.setLastName("Иванов");
        person.setAge(27);
        person.setGender(Gender.MALE);

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0); // firstName
//        Cell cellLastName = row.createCell(1); // firstName
        cell.setCellValue(name);

        try (FileOutputStream fos = new FileOutputStream(path)) {
            book.write(fos);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
