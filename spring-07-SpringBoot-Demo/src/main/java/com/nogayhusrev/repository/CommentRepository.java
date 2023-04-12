package com.nogayhusrev.repository;

import com.nogayhusrev.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
