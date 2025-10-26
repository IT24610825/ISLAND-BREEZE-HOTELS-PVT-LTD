package com.hotelmanagementsystem.repository;

import com.hotelmanagementsystem.model.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
    List<ContactMessage> findAllByOrderBySubmittedAtDesc();
    List<ContactMessage> findByRepliedFalseOrderBySubmittedAtDesc();
    List<ContactMessage> findByUrgentTrueAndRepliedFalseOrderBySubmittedAtDesc();
    long countByRepliedFalse();
}
