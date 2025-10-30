package method_references;

public class PatientIDPrint {
    public static void main(String[] args) {
        Integer[] ids = {1001, 1002, 1003};
        for (Integer id : ids) {
            System.out.println(id);
        }
    }
}
