package w6.education;

public class TestSchool {
    public static void main(String[] args) {
        School s1 = new School("High School No. 1", "ul. Kopernika 1, 10-001 Olsztyn", 450);
        School s2 = new School("", null, -5);
        School s3 = new School("Other name", "ul. Kopernika 1, 10-001 Olsztyn", 10);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s3) + " " + (s1.hashCode() == s3.hashCode())); // true true

        s1.recruitment(100);
        System.out.println(s1.getStudents());                      // 500

        University u1 = new University("City University", "ul. Akademicka 1, 10-002 Olsztyn",
                300, "", 12);
        University u2 = new University("City University", "ul. Akademicka 1, 10-002 Olsztyn",
                200, "classical", 12);
        System.out.println(u1);
        System.out.println(u1.equals(u2));                         // true: address + studies
        u2.recruitment(35);
        System.out.println(u1.equals(u2));                         // false: 12 vs 15 studies

        School s4 = new School("City University", "ul. Akademicka 1, 10-002 Olsztyn", 300);
        System.out.println(s4.equals(u1) + " " + u1.equals(s4));   // false false
    }
}
