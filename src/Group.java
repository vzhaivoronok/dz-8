import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Group {
    private Student lead;
    private HashMap<Integer, Student> students;
    private HashMap<String, ArrayList<Integer>> tasks;

    Group(Student lead, HashMap<Integer, Student> students, HashMap<String, ArrayList<Integer>> tasks) {
        this.lead = lead;
        this.students = students;
        this.tasks = tasks;
        if (!students.containsKey(lead.getId())) {
            students.put(lead.getId(), lead);
        }
    }

    void changeLead(Student newLead){
        lead = newLead;
    }

    void renameStudent(int studentId, String name, String surname)
    {
        if (students.containsKey(studentId))
        {
            Student studentToRename = students.get(studentId);
            studentToRename.setSurname(surname);
            studentToRename.setName(name);
        }
    }
    void addStudent(Student newStudent){
        if (!students.containsKey(newStudent.getId())) {
            students.put(newStudent.getId(), newStudent);
        }
    }
    void removeStudent(int studentId){
        if (students.containsKey(studentId)) {
            students.remove(studentId);
        }
    }
    void addTask(String task) {
        if (!tasks.containsKey(task)) {
            tasks.put(task, new ArrayList<>());
        }
    }
    void markTaskCompleted(String task, Student student){
        if (!tasks.containsKey(task) && !tasks.get(task).contains(student.getId())) {
            tasks.get(task).add(student.getId());
        }
    }


}
