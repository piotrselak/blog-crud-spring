package com.github.piotrselak.blog.repository;

import com.github.piotrselak.blog.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
