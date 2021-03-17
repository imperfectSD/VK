package domain;

public class LikesInfo {

        private int likesCount;
        private boolean canLike;
        private boolean userLike;

        public int getLikesCount () {
            return likesCount;
        }

        public void setLikesCount (int likesCount) {
            this.likesCount = likesCount;
        }

        public boolean isCanLike () {
            return canLike;
        }

        public void setCanLike (boolean canLike) {
            this.canLike = canLike;
        }

        public boolean isUserLike () {
        return userLike;
    }

        public void setUserLike (boolean userLike) {
        this.userLike = userLike;
    }
    }
