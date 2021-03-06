package com.mongo2.repository;

import com.mongo2.domain.Post;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.util.List;

public interface PostRepository extends CrudRepository<Post, BigInteger> {

    Post findFirstByOrderByPostedOnDesc();

    List<Post> findAllByOrderByPostedOnDesc();

    Post findBySlug(String slug);

}
