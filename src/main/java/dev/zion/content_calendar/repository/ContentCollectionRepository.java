package dev.zion.content_calendar.repository;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import dev.zion.content_calendar.model.Content;

/*
 * This interface declares that ContentRepository extends ListCrudRepository,
 * which provides methods for performing CRUD operations on Content objects
 * identified by an Integer type ID.
 *
 * By extending ListCrudRepository, ContentRepository inherits:
 * - save(S entity)
 * - findById(ID id)
 * - deleteById(ID id)
 * - findAll()
 * - and other CRUD operations.
 *
 * Custom Query Method:
 * List<Content> findAllByContentType(String type);
 */
public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findAllByContentType(String type);
}
