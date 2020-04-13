package com.example.area.repos;

import com.example.area.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.*;

public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
