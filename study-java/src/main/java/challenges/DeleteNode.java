package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DeleteNode {
    public static void main(String[] args) {

        List<Integer> nodes = new ArrayList<>(Arrays.asList(1 ,6 ,3 ,9,6));
        Integer x = 2;
        nodes.remove(x);
        for (Integer i:nodes) {
            System.out.print(i);
        }
    }
}

class GfG
{
    Stream<Integer> deleteNode(int x, Integer... head)
    {
        return Arrays.stream(head).filter(h -> h.equals(x));
    }
}
