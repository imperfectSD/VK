package domain;

public class CommentsInfo {

    private int commentsCount;
    private boolean canComment;
    private boolean canOpen;
    private boolean canClose;

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int count) {
        this.commentsCount = commentsCount;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }
}

