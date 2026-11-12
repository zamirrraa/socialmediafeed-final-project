package socialfeed;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MostLikedStrategy implements FeedSortStrategy {

    public List<Post> sort(List<Post> posts) {
        List<Post> result = new ArrayList<>(posts);
        result.sort(Comparator.comparingInt(Post::getLikes).reversed());
        return result;
    }
}