package socialfeed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewestFirstStrategy implements FeedSortStrategy {

    public List<Post> sort(List<Post> posts) {
        List<Post> result = new ArrayList<>(posts);
        Collections.reverse(result);
        return result;
    }
}