package com.github.piotrselak.blog.service;

import com.github.piotrselak.blog.models.Post;
import com.github.piotrselak.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    public void savePost(Post post) {
        if (postRepository.findByTitle(post.getTitle()).isPresent()) {
            throw new PostAlreadyExistsException();
        }
        postRepository.save(post);
    }

    public void deletePost(String id) {
        if (postRepository.existsById(id)) {
            throw new PostNotFoundException();
        }
        postRepository.deleteById(id);
    }

    @Transactional
    public void updatePost(String id, String title, String content) {
        Post post = postRepository.findById(id).orElseThrow(PostNotFoundException::new);
        if (title != null)
            post.setTitle(title);
        if (content != null)
            post.setContent(content);
    }
}
