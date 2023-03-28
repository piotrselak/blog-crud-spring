package com.github.piotrselak.blog.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Post already exists")
public class PostAlreadyExistsException extends RuntimeException{
}
