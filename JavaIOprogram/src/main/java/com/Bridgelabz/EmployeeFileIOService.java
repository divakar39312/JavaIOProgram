package com.Bridgelabz;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class EmployeeFileIOService {
        public static String PAYROLL_FILE_NAME = "F:\\Programs\\src\\Emppayrollfile.txt";
        public void writeDataToFile(List<EmployeePayRoll> employeePayrollList) {
            StringBuffer empBuffer = new StringBuffer();
            employeePayrollList.forEach(employee -> {
                String employeeDataString = employee.toString().concat("\n");
                empBuffer.append(employeeDataString);
            });
            try {
                Files.write(Paths.get(PAYROLL_FILE_NAME), empBuffer.toString().getBytes());
            }catch (IOException e) {
                System.out.println(e);
            }
        }
    }

