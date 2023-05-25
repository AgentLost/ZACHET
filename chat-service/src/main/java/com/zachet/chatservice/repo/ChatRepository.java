package com.zachet.chatservice.repo;

import com.zachet.chatservice.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Transactional
public interface ChatRepository extends JpaRepository<Chat, Integer> {

    @Modifying
    @Query("update Chat c set c.employeeId=?1 where c.id=?2")
    void updateEmployeeByChatId(String employeeId, int chatId);

    List<Chat> findAllByClientId(String clientId);
}