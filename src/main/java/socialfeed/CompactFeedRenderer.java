package socialfeed;

public class CompactFeedRenderer implements FeedRenderer {
    public String render(Post post) {
        return post.getAuthor() + " • " + post.getText() + " (" + post.getLikes() + ")";
    }
}

