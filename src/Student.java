import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Human{

    private ArrayList<Lesson> lessons = new ArrayList<Lesson>();

    private double tax;

    public Student(){
        super();
        lessons.add(new Lesson("Matematik"));
        lessons.add(new Lesson("Turkce"));
        this.tax = 500;
    }

    public void showPoint(){
        for (int i = 0; i < lessons.size(); i++) {
            System.out.println(lessons.get(i).getName() + " : " + lessons.get(i).getPoint());
        }
    }

    public void taxPay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Odemeniz gerken harc Miktari : " + this.tax + " 'dir");
        System.out.println("Odeme yapmak icin 1\nCikis yapmak icin 2 giriniz.");
        String index = sc.nextLine();
        if(index.equals("1")){
            this.tax = 0;
        }

        else{
            return;
        }
    }
    public void pointChange(){
        for (int i = 0; i <lessons.size(); i++) {
            java.lang.System.out.println( i + ". Ders : " + lessons.get(i).getName());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen not girmek istediniz dersin insdini giriniz: ");
        String index = sc.nextLine();

        System.out.println("Lutfen not giriniz: ");
        String point = sc.nextLine();

        lessons.get(Integer.parseInt(index)).setPoint(Integer.parseInt(point));
    }

}
