package domain;

public class Post {

    private LikesInfo likesCount;
    private LikesInfo canLike;
    private ViewsInfo viewsCount;
    private Date date;
    private Text text;
    private RepostsInfo repostsCount;
    private RepostsInfo canRepost;
    private CommentsInfo commentsCount;
    private CommentsInfo canComment;
    private AuthorInfo authorId;
    private AuthorInfo authorName;

    public LikesInfo getLikesCount() {
        return likesCount;
    }

    public void setLikes(int count) {
        this.likesCount = likesCount;
    }

    public LikesInfo getCanLike() {
        return canLike;
    }

    public void setCanLike(LikesInfo canLike) {
        this.canLike = canLike;
    }

    public ViewsInfo getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(ViewsInfo viewsCount) {
        this.viewsCount = viewsCount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public RepostsInfo getRepostsCount() {
        return repostsCount;
    }

    public void setRepostsCount(RepostsInfo repostsCount) {
        this.repostsCount = repostsCount;
    }

    public RepostsInfo getCanRepost() {
        return canRepost;
        }

        public void setCanRepost(RepostsInfo canRepost) {
           this.canRepost = canRepost;
        }

    public CommentsInfo getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(CommentsInfo commentsCount) {
        this.commentsCount = commentsCount;
    }

    public CommentsInfo getCanComment() {
        return canComment;
    }

    public void setCanComment (CommentsInfo canComment) {
        this.canComment = canComment;
    }

    public AuthorInfo getAuthorId() {
        return authorId;
    }

    public void setAuthorId (AuthorInfo authorId) {
        this.authorId = authorId;
    }

    public AuthorInfo getAuthorName() {
        return authorName;
    }

    public void setAuthorName (AuthorInfo authorName) {
        this.authorName = authorName;
    }
}
