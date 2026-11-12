package socialfeed;

public class FeedStatisticsVisitor implements PostVisitor {

    private int textPosts;
    private int imagePosts;
    private int totalLikes;

    public void visit(TextPost post) {
        textPosts++;
        totalLikes += post.getLikes();
    }

    public void visit(ImagePost post) {
        imagePosts++;
        totalLikes += post.getLikes();
    }

    public int getTextPosts() {
        return textPosts;
    }

    public int getImagePosts() {
        return imagePosts;
    }

    public int getTotalLikes() {
        return totalLikes;
    }
}