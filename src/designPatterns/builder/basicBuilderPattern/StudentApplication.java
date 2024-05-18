package designPatterns.builder.basicBuilderPattern;

public class StudentApplication {
    public static void main(String[] args) {
        Student student = new StudentBuilder("test")
                .age(20)
                .gender("male")
                .grade(1)
                .build();

        System.out.println(student);
    }
}
