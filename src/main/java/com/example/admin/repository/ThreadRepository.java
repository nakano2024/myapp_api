package com.example.admin.repository;

import com.example.admin.entity.Thread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ThreadRepository extends JpaRepository<Thread, Long> {

    @Query("SELECT DISTINCT th FROM Thread th WHERE th.user.userId = ?1")
    List<Thread> findAllByUserId(Long userId);

}