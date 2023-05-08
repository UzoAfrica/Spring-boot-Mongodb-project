package com.uzoafrica.joblistng.repository;

import com.uzoafrica.joblistng.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
