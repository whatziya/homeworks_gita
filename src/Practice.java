public class Practice implements Comparable<Practice> {
    private String firstName;
    private String lastName;
    private int age;

    // Constructor and other methods...

    @Override
    public int compareTo(Practice otherStudent) {
        // Compare students based on their last names
        return Integer.compare(this.age, otherStudent.age);
    }

    // Other methods...
}
