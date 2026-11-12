package socialfeed;

public interface PostVisitor {
    void visit(TextPost post);
    void visit(ImagePost post);
}