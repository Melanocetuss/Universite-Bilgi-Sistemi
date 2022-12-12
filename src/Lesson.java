public class Lesson {

    private String name;

    private int point;

    public Lesson(String name){
        this.name = name;
        this.point = -1;
    }

    public void setPoint(int point){
        if(point >= 0 && point <= 100){
            this.point = point;
        }

        else {
            System.out.println("Hatali bir not girdiniz");
        }
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }
}
