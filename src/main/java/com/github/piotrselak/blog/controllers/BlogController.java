package com.github.piotrselak.blog.controllers;

import com.github.piotrselak.blog.models.Post;
import com.github.piotrselak.blog.repository.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class BlogController {
    private final PostRepository postRepository;

    public BlogController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/")
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @PostMapping("/")
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    @GetMapping("/{id}")
    public Post getPostById(String id) {
        return postRepository.findById(id).orElseThrow(PostNotFoundException::new);
    }
}
