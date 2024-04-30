import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class StudentGroup implements Iterable<Student>{
    private List<Student> students = new ArrayList<>();
    private String groupName;
    private int groupNumber;
    public Object getGroupName;

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public Iterator<Student> iterator(){
        return new StudentGroupIterator();
    }

    class StudentGroupIterator implements Iterator<Student>{
        private int index=0;

        public boolean hasNext(){
            return index < students.size();
        }

        public Student next(){
            return students.get(index++);
        }

        public void remove() {
            if (index > 0) {
                students.remove(--index);
            } else {
                throw new IllegalStateException("next должен быть вызван перед remove");
            }
        }
    
    }

    public StudentGroup(String groupName, int groupNumber){

        this.students = new ArrayList<>();
        this.groupName = groupName;
        this.groupNumber = groupNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getGroupSize() {
        return students.size();
    }

    public Student getStudent(String name){
        for (Student student: students){
            if (student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    @Override
    public String toString() {

        return getGroupName();
    }
}
