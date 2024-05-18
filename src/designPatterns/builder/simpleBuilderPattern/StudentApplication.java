package designPatterns.builder.simpleBuilderPattern;

public class StudentApplication {
    public static void main(String[] args) {
        Student student = new Student.Builder("test")
                .age(20)
                .gender("male")
                .grade(4)
                .build();

        System.out.println(student);
    }
}
