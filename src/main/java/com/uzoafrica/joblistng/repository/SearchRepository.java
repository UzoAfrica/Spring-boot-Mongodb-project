package com.uzoafrica.joblistng.repository;

import com.uzoafrica.joblistng.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
