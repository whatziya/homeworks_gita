package lesson_11.home3;

public abstract class A {
    int age;

    public A(int age) {
        this.age = age;
    }

    public abstract int getAge();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        A other = (A) obj;
        return age == other.age;
    }
}