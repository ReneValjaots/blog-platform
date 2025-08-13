package com.renev.blog.controllers;

import com.renev.blog.domain.dto.TagResponse;
import com.renev.blog.domain.entities.Tag;
import com.renev.blog.mappers.TagMapper;
import com.renev.blog.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/tags")
@RequiredArgsConstructor
public class TagController {

    private final TagService tagService;
    private final TagMapper tagMapper;

    @GetMapping
    public ResponseEntity<List<TagResponse>> getAllTags() {
        List<Tag> tags = tagService.getTags();
        List<TagResponse> responses = tags.stream().map(tagMapper::toTagResponse).toList();
        return ResponseEntity.ok(responses);
    }
}
