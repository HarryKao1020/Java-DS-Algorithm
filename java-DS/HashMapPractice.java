import java.util.HashMap;





public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String,String> student = new HashMap<>();
        student.put("Name","Harry");
        System.out.println(student.get("Name"));
        student.put("Gender","Male");
        System.out.println(student.get("Gender"));

        System.out.println("Current Size of HashMap:"+ student.size());


    }


}
