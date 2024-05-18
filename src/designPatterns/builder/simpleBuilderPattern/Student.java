package designPatterns.builder.simpleBuilderPattern;

public class Student {
    private final String name;
    private final Integer age;
    private final String gender;
    private final Integer grade;

    public static class Builder {
        // 필수 파라미터
        private final String name;

        // 선택 파라미터
        private Integer age;
        private String gender;
        private Integer grade;

        // 필수 파라미터의 경우 빌더 생성자로 받음
        public Builder(String name) {
            this.name = name;
        }

        // 선택 파라미터는 각 메서드를 통해 받음
        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder grade(Integer grade) {
            this.grade = grade;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.grade = builder.grade;
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
