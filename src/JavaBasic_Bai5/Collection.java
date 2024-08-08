package JavaBasic_Bai5;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection {

    private static ArrayList<String> addEmployee(String name, String age, String jobTitle, String address, String exp) {
        ArrayList<String> employeeInfo = new ArrayList<>();

        employeeInfo.add(name);
        employeeInfo.add(age);
        employeeInfo.add(jobTitle);
        employeeInfo.add(address);
        employeeInfo.add(exp);

        return employeeInfo;

    }

    public static void main(String[] agrs) {
        ArrayList<Integer> list = new ArrayList<>();

        //Kiểm tra số chẵn, add vào ArrayList
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }

        System.out.println("************* Duyệt giá trị trong ArrayList ***************");
        //Duyệt giá trị trong ArrayList
        for (int i : list) {
            System.out.print(i + "\t");
        }

        System.out.println();
        System.out.println("\n************** Thông tin nhân viên **************");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Selenium", "Test Automation"));
        ArrayList<String> list1 = list2;
        System.out.println(list1);
        
        
        ArrayList<String> employee = addEmployee(
                "Vu Thi Kim Dung",
                "33",
                "Manual Tester",
                "Ha Noi",
                "3 years"
        );

        for (String value : employee) {
            System.out.println(value);
        }

//        ArrayList<String> employeeInfo = new ArrayList<>();
//
//        employeeInfo.add("Vu Thi Kim Dung");
//        employeeInfo.add("33 years old");
//        employeeInfo.add("Manual Tester");
//        employeeInfo.add("Ha Noi");
//        employeeInfo.add("Experience - 3 years");

//        System.out.println("Các phần tử của Set");
//        System.out.print("\t" + employeeInfo + "\n");

        //In thông tin nhân viên trong ArrayList
//        for (int i = 0; i < employeeInfo.size(); i++) {
//            System.out.println(employeeInfo.get(i));
//        }
    }
}


