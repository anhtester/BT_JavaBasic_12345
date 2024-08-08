package JavaBasic_Bai4;

public class ForAndArray {

    public static void main(String[] agrs) {

//        int arr[] = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50 };
//
//        for (int i : arr) {
//            System.out.print(" " + i);
//        }

        //Số chẵn là số chia hết cho 2
        //Dùng % để kiểm tra phần dư

        int mangSoNguyen[] = new int[30];
        int index = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
                mangSoNguyen[index] = i; //Gán giá trị số chẵn vào vị trí mảng tuần tự
                index++; //Tăng biến chỉ mục lên 1 đơn vị
            }
        }

        System.out.println("");

        //Duyệt mảng
        for (int value : mangSoNguyen) {
            System.out.println(value);
        }
    }
}
