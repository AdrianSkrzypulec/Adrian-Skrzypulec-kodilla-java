package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private int userQuantity;
    private int postQuantity;
    private int commentQuantity;
    private double postsPerUser;
    private double commentPerUser;
    private double commentPerPost;

    void calculateAdvStatistics(Statistics statistics) {
        userQuantity = statistics.usersNames().size();
        postQuantity = statistics.postsCount();
        commentQuantity = statistics.commentsCount();
        if (postQuantity > 0 && userQuantity > 0) {
            postsPerUser = (double)postQuantity / (double)userQuantity;
        }
        if (userQuantity > 0) {
            commentPerUser = (double)commentQuantity / (double)userQuantity;
        }
        if (postQuantity > 0) {
            commentPerPost = (double)commentQuantity / (double)postQuantity;
        }
    }

    public int getUserQuantity() {
        return userQuantity;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public int getCommentQuantity() {
        return commentQuantity;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentPerUser() {
        return commentPerUser;
    }

    public double getCommentPerPost() {
        return commentPerPost;
    }
}
