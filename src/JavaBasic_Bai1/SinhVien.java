package JavaBasic_Bai1;

public class SinhVien {

    String studentName = "Vu Thi Kim Dung";
    static String university = "National Economics University";

    public static void main(String[] agrs) {
        double mathScore = 7.5;
        double englishScore = 7.5;
        double literatureScore = 7.5;

        System.out.println(mathScore);
        System.out.println(englishScore);
        System.out.println(literatureScore);

        SinhVien sinhVien = new SinhVien();
        System.out.println(sinhVien.studentName);
        System.out.println(university);

//        ThongTin thongTin = new ThongTin();
//        System.out.println(thongTin.email);
//        System.out.println(thongTin.totalScore);
//        System.out.println(thongTin.telephoneNo);

        System.out.println(ThongTin.email);
        System.out.println(ThongTin.totalScore);
        System.out.println(ThongTin.telephoneNo);
    }
}
