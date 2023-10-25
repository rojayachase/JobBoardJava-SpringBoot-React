package com.jobboard.joblisting.repository;

import com.jobboard.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
