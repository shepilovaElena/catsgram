package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import java.time.Instant;

@Data
public class Post {
    private Long id;
    private long authorId;
    String description;
    Instant postDate;
}
