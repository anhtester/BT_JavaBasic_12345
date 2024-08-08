package JavaBasic_Bai1;

public class Company {

    public double sum;

    public void cong2So() {
        int a = 10;
        int b = 5;
        sum = a + b;
    }

    public static void main(String[] args) {
        Company company = new Company();
        company.cong2So();
        System.out.println(company.sum);
    }
}
