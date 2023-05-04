class Student {

    private static int createdStudentsCount = 0;
    private int id;
    private String surname;
    private String name;

    public Student(String surname, String name) {
        this.id = createdStudentsCount;
        createdStudentsCount++;
        this.surname = surname;
        this.name = name;
    }

    int getId() {
        return id;
    }


    void setSurname(String surname) {
        this.surname = surname;
    }
    

    void setName(String name) {
        this.name = name;
    }
}
