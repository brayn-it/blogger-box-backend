package com.dauphine.blogger.controllers;

import com.dauphine.blogger.models.Category;
import com.dauphine.blogger.models.Post;
import com.dauphine.blogger.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/v1/posts")

public class PostController{
    private final PostService service;

    public PostController(PostService service){
        this.service = service;
    }

    @GetMapping("getAllByCategoryId/{id}")
    List<Post> getAllByCategoryId(@PathVariable UUID id){
        return this.service.getAllByCategoryId(id);
    }

    @GetMapping
    List<Post> getAll(){
        return this.service.getAll();
    }

    @GetMapping("{id}")
    Post getById(@PathVariable UUID id){
        return this.service.getById(id);
    }

    @PostMapping()
    Post create(@RequestBody String title, @RequestBody String content, @RequestBody UUID categoryId){
        return this.service.create(title,content,categoryId);
    }

    @PutMapping("{id}")
    Post  update(@PathVariable UUID id, @RequestBody String title, @RequestBody String content){
        return this.service.update(id,title,content);
    }

    @DeleteMapping("{id}")
    boolean deleteById(@PathVariable UUID id){
        return this.service.deleteById(id);
    }
}
