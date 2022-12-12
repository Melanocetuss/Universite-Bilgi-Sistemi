import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Systems university = new Systems();
        ArrayList<Personnel> personnelArrayList = new ArrayList<>();
        ArrayList<Teacher> teacherArrayList = new ArrayList<>();
        ArrayList<Student> studentArrayList = new ArrayList<>();

        personnelArrayList.add(new Personnel());

        teacherArrayList.add(new Teacher());

        studentArrayList.add(new Student());


        university.systemStart(personnelArrayList,teacherArrayList,studentArrayList);
    }
}
