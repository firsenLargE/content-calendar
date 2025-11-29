package dev.zion.content_calendar.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

public record Content(
        @Id
        Integer id,
        String title,

        @Column("description")
        String desc,

        Status status,
        Type contentType,

        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,

        String url
) {}
