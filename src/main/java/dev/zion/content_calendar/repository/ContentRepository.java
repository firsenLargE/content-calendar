package dev.zion.content_calendar.repository;

import dev.zion.content_calendar.model.Content;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContentRepository {
private final List<Content> content  = new ArrayList<>();

    public ContentRepository() {
    }

    public List<Content> findAll(){
        return content;
    }

}

