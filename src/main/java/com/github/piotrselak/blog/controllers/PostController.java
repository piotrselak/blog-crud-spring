package com.github.piotrselak.blog.controllers;

import com.github.piotrselak.blog.models.Post;
import com.github.piotrselak.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;
    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getPosts();
    }

    @PostMapping
    public void addPost(@RequestBody Post post) {
        postService.savePost(post);
    }

    @DeleteMapping("{id}")
    public void deletePost(@PathVariable("id") String id) {
        postService.deletePost(id);
    }

    @PutMapping("{id}")
    public void updatePost(
        @PathVariable("id") String id,
        @RequestParam(required = false) String title,
        @RequestParam(required = false) String content) {
        postService.updatePost(id, title, content);
    }

}
