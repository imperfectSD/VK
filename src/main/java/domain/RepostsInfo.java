package domain;

public class RepostsInfo {

    private int repostsCount;
    private boolean canRepost;

    public int getRepostsCount () {
        return repostsCount;
    }

    public void setRepostsCount (int count) {
        this.repostsCount = repostsCount;
    }

    public boolean isCanRepost () {
        return canRepost;
    }

    public void setCanRepost (boolean canRepost) {
        this.canRepost = canRepost;
    }
}
