import java.util.ArrayList;
import java.util.Scanner;
public class Teacher extends Human implements IStudentEdit{

    private double wage;

    public Teacher(){
        super();
        while (true){
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Maas: ");
                this.wage = sc.nextDouble();
                break;
            }
            catch (NumberFormatException exception){
                System.out.println("Sayı Değeri Girinz");
            }
            catch (Exception exception){
                System.out.println("Hata Meydana Geldi");
            }
        }

    }

    public void wageChange(){
        while (true){
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Yeni Maas: ");
                this.wage = sc.nextDouble();
                break;
            }
            catch (NumberFormatException exception){
                System.out.println("Sayı Değeri Girinz");
            }
            catch (Exception exception){
                System.out.println("Hata Meydana Geldi");
            }
        }

    }

    @Override
    public void pointGive(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println( i + ". Student: " );
            list.get(i).showInfo();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen degistirmek istediginiz ogrencinin indisini giriniz");
        String index = sc.nextLine();
        list.get(Integer.parseInt(index)).pointChange();
        System.out.println("Islem Basarili");
    }
    public double getWage() {
        return wage;
    }
}
