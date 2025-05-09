class Student {
    private String name;
    private int marks;
    private String subject;

    public Student(String name, int marks, String subject) {
        this.name = name;
        this.marks = marks;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getSubject() {
        return subject;
    }

    public String getGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else return "F";
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Marks: " + marks + ", Subject: " + subject);
    }
}

