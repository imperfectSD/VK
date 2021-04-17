package domain;

public class Post {

    private LikesInfo likesInfo;
    private ViewsInfo viewsInfo;
    private Date date;
    private Text text;
    private RepostsInfo repostsInfo;
    private CommentsInfo commentsInfo;
    private AuthorInfo authorInfo;
    private OwnerId ownerId;
    private Favorite favorite;

    public Date getDate () {
        return date;
    }

    public void setDate (Date date) {
        this.date = date;
    }

    public Text getText () {
        return text;
    }

    public void setText (Text text) {
        this.text = text;
    }

    public OwnerId getOwnerId () {
        return ownerId;
    }

    public void setIdOwner (OwnerId ownerId) {
        this.ownerId = ownerId;
    }

    public Favorite getFavorite () {
        return favorite;
    }

    public void setFavorite (Favorite favorite) {
        this.favorite = favorite;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public AuthorInfo getAuthorInfo() {
        return authorInfo;
    }

    public void setAuthorInfo(AuthorInfo authorInfo) {
        this.authorInfo = authorInfo;
    }
}
