package com.github.piotrselak.blog.repository;

import com.github.piotrselak.blog.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PostRepository extends MongoRepository<Post, String> {
    Optional<Post> findByTitle(String title);

}
