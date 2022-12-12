import java.util.ArrayList;
import java.util.Scanner;
public class Personnel extends Human implements ITeacherEdit{
    @Override
    public void teacherAdd(ArrayList<Teacher> list) {
        list.add(new Teacher());
    }

    @Override
    public void teacherEdit(ArrayList<Teacher> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println( i + ". Teacher : ");
            list.get(i).showInfo();
        }
        while (true){
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Lutfen degistirmek istediniz hocanin indisini giriniz.");
                String index = sc.nextLine();
                list.get(Integer.parseInt(index)).wageChange();
                System.out.println("Islem Basarili");
                break;
            }
            catch (IndexOutOfBoundsException exception){
                System.out.println("Yanlış İndis");
            }
            catch (NumberFormatException exception){
                System.out.println("Sayı Değeri Giriniz");
            }
            catch (Exception exception){
                System.out.println("Bir Hata Meydana Geldi");
            }
        }
    }

    @Override
    public void teacherDelete(ArrayList<Teacher> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println( i + ". Teacher : ");
            list.get(i).showInfo();
        }
        while (true){
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Lutfen degistirmek istediniz hocanin indisini giriniz.");
                String index = sc.nextLine();
                list.remove(Integer.parseInt(index));
                System.out.println("Islem Basarili");
                break;
            }
            catch (IndexOutOfBoundsException exception){
                System.out.println("Yanlış İndis");
            }
            catch (NumberFormatException exception){
                System.out.println("Sayı Değeri Giriniz");
            }
            catch (Exception e){
                e.getMessage();
            }
        }
    }
}
