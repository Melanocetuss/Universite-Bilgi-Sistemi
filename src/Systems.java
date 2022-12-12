import java.util.ArrayList;
import java.util.Scanner;

public class Systems {

    public void systemStart(ArrayList<Personnel> personnelArrayList, ArrayList<Teacher> teacherArrayList, ArrayList<Student> studentArrayList) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Kullanici adini giriniz: ");
            String username = sc.nextLine();

            System.out.println("Sifrenizi giriniz: ");
            String password = sc.nextLine();

            int logIn = 0;
            boolean logInFlag = false;

            for (int i = 0; i < personnelArrayList.size(); i++) {
                if (personnelArrayList.get(i).getUsername().equals(username) && personnelArrayList.get(i).passwordControl(password)) {
                    System.out.println("Personel giris basarili");
                    personnelMenu(personnelArrayList.get(i), teacherArrayList);
                    logInFlag = true;
                    break;
                }
            }

            for (int i = 0; i < teacherArrayList.size(); i++) {
                if (teacherArrayList.get(i).getUsername().equals(username) && teacherArrayList.get(i).passwordControl(password)) {
                    System.out.println("Akedemik giris basarili");
                    teacherMenu(teacherArrayList.get(i), studentArrayList);
                    logInFlag = true;
                    break;
                }
            }

            for (int i = 0; i < studentArrayList.size(); i++) {
                if (studentArrayList.get(i).getUsername().equals(username) && studentArrayList.get(i).passwordControl(password)) {
                    System.out.println("Personel giris basarili");
                    studentMenu(studentArrayList.get(i));
                    logInFlag = true;
                    break;
                }
            }

            if (!logInFlag) {
                System.out.println("Giris basarisiz");
            }

            System.out.println("Devam etmek icin 'e'\nCikmak icin 'h' giriniz ");
            String control = sc.nextLine();
            if (control.equals("h")) {
                break;
            }
        }
    }

    public void personnelMenu(Personnel logIn, ArrayList<Teacher> teacherArrayList) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("""
                    1- Hoca Ekle
                    2- Hoca Maas Duzenle
                    3- Hoca Sil
                    4- Cikis
                    """);
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    logIn.teacherAdd(teacherArrayList);
                    break;
                case "2":
                    logIn.teacherEdit(teacherArrayList);
                    break;
                case "3":
                    logIn.teacherDelete(teacherArrayList);
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Yanlis Deger girdiniz");
            }
        }
    }

    public void teacherMenu(Teacher logIn, ArrayList<Student> studentArrayList) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("""
                    1- Not Ver
                    2- Maas Goruntule
                    3- Cikis
                    """);
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    logIn.pointGive(studentArrayList);
                    break;
                case "2":
                    System.out.println("Maasiniz: " + logIn.getWage());
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Yanlis Deger girdiniz");
            }
        }
    }

    public void studentMenu(Student logIn) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("""
                    1- Not Goruntule
                    2- Harc Ode
                    3- Cikis
                    """);
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    logIn.showPoint();
                    break;
                case "2":
                    logIn.taxPay();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Yanlis Deger girdiniz");
            }
        }
    }
    private Human logInPanelShow(ArrayList<Personnel> personnelArrayList,ArrayList<Teacher> teacherArrayList, ArrayList<Student> studentArrayList ){
        return null;
    }
}