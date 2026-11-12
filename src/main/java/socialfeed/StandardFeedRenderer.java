package socialfeed;

public class StandardFeedRenderer implements FeedRenderer {
    public String render(Post post) {
        return "[" + post.getType() + "] " + post.getAuthor() + ": " + post.getText()
                + " | likes: " + post.getLikes();
    }
}
