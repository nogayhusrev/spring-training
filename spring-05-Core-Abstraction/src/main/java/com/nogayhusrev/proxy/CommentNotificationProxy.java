package com.nogayhusrev.proxy;

import com.nogayhusrev.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
