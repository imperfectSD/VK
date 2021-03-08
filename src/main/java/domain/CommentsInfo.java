package domain;

public class CommentsInfo {

        private int commentsCount;
        private boolean canComment;

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
    }

