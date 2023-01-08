package effective.item02.builder;

public class Student {

    private int age;
    private String name;
    private int score;

    public Student(String name, int age, int score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    public static Student withScore(String name, int age, int score){
        return new Student(name, age, score);
    }

    public static void main(String[] args) {
        Student.withScore("김길동", 10, 1);
    }
}
