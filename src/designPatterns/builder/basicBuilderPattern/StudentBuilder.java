package designPatterns.builder.basicBuilderPattern;

public class StudentBuilder {
    private final String name;
    private Integer age;
    private String gender;
    private Integer grade;

    public StudentBuilder(String name) {
        this.name = name;
    }

    public StudentBuilder age(Integer age) {
        this.age = age;
        return this;
    }

    public StudentBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }

    public StudentBuilder grade(Integer grade) {
        this.grade = grade;
        return this;
    }

    public Student build() {
        return new Student(name, age, gender, grade);
    }
}
