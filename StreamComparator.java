import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream s1, Stream s2) {
        int s1SizeStream = s1.getSizeStream();
        int s2SizeStream = s2.getSizeStream();

        return s1SizeStream - s2SizeStream;
    }
}
