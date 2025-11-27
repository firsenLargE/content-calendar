package dev.zion.content_calendar.model;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        String name,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {}
