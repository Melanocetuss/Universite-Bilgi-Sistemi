import java.util.Scanner;
public abstract class Human {
    private String nameSurname;
    private String mail;
    private String username;
    private String password;
    public Human(){
        while (true){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Isim Soyisim giriniz");
                String nameSurname = sc.nextLine().trim();
                String[] isimArray = nameSurname.split(" ");
                this.mail = isimArray[0] + "." + isimArray[1] + "@hotmail.com";
                this.nameSurname = nameSurname;
                this.username = isimArray[0].charAt(0) + "." + isimArray[1];

                System.out.println("Kullanici Adiniz: " + this.username);
                System.out.println("Mail Adresiniz: " + this.mail);

                System.out.println("Sifrenizi belirleyin");
                this.password = sc.nextLine();
                break;
            }
            catch (IndexOutOfBoundsException exception){
                System.out.println("Yanlis Giris");
            }
        }
    }

    public boolean passwordControl(String password){
        if(password.equals(this.password))
            return true;

        else
            return false;
    }

    public void passwordChange(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eski sifrenizi giriniz:");
        String oldPassword = sc.nextLine();
        if(oldPassword.equals(this.password)){
            System.out.println("Yeni sifreyi giriniz");
            this.password = sc.nextLine();
            System.out.println("Sifreniz basariyla degistirildi");
        }
        else
            System.out.println("Yanlis sifre");
    }

    public void showInfo(){
        System.out.println("Isim: " + this.nameSurname);
        System.out.println("Mail: " + this.mail);
        System.out.println("Kullanici Adi: " + this.username);
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public String getMail() {
        return mail;
    }

    public String getUsername() {
        return username;
    }



}
