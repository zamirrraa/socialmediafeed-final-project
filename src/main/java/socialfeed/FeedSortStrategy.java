package socialfeed;

import java.util.List;

public interface FeedSortStrategy {
    List<Post> sort(List<Post> posts);
}