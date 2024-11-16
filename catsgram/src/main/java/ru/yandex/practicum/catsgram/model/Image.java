package ru.yandex.practicum.catsgram.model;

import lombok.Data;

@Data
public class Image {
    private Long id;
    private long postId;
    String originalFileName;
    String filePath;
}
