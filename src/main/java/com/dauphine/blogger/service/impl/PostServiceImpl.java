package com.dauphine.blogger.service.impl;

import com.dauphine.blogger.models.Category;
import com.dauphine.blogger.models.Post;
import com.dauphine.blogger.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PostServiceImpl implements PostService {
    @Override
    public List<Post> getAllByCategoryId(UUID categoryId) {
        return List.of();
    }

    @Override
    public List<Post> getAll() {
        return List.of();
    }

    @Override
    public Post getById(UUID id) {
        return null;
    }

    @Override
    public Post create(String title, String content, UUID categoryId) {
        return null;
    }

    @Override
    public Post update(UUID id, String title, String content) {
        return null;
    }

    @Override
    public boolean deleteById(UUID id) {
        return false;
    }
}
