/**
 * Pros and Cons:
 * Guarantees abstraction
 * Code is flexible and adaptable
 * Very useful for frameworks and libraries
 * <p>
 * Complex code X
 * Takes time to set the base X
 * Not a pattern that can be refactored into X
 * */

public class Main {
    public static void main(String[] args) {

        Course hldCourse = CourseFactory.getCourse("HLD");
        Course lldCourse = CourseFactory.getCourse("LLD");

        assert hldCourse!=null;
        System.out.println("HLD modules: ");
        System.out.println(hldCourse.modules);

        assert lldCourse!=null;
        System.out.println("lLD modules: ");
        System.out.println(lldCourse.modules);

    }
}