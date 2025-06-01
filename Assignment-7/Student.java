class Student {
    int rollNumber;
    String name;

    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    Student(int rollNumber) {
        this.rollNumber = rollNumber;
        this.name = "Unknown";
    }

    void display() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102);

        s1.display();
        s2.display();
    }
}
