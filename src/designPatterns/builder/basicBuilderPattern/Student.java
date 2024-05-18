package designPatterns.builder.basicBuilderPattern;

public class Student {
    private final String name;
    private final Integer age;
    private final String gender;
    private final Integer grade;

    public Student(String name, Integer age, String gender, Integer grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", grade=" + grade +
                '}';
    }
}
