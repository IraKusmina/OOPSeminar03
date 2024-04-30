import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private List<StudentGroup> streams;
    private StudentGroup stream;

    public Stream(StudentGroup... groups){
        this.streams = new ArrayList<>();
        for (StudentGroup group : groups) {
            streams.add(group);
        }
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return streams.iterator();
    }

    public void addStream(StudentGroup stream) {
        this.stream = stream;
        streams.add(stream);
    }

    public StudentGroup getStudentGroup(String name) {
        for (StudentGroup stream : streams) {
            if (stream.getGroupName().equals(name)) {
                return stream;
            }
        }
        return null;
    }

    public int getSizeStream(){
        return streams.size();
    }

    public int compareTo(Stream o) {
        return streams.size() - o.getSizeStream();
    }

}