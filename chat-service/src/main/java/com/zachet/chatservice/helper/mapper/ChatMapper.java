package com.zachet.chatservice.helper.mapper;

import com.zachet.chatservice.dto.ChatDto;
import com.zachet.chatservice.model.Chat;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChatMapper {
    ChatDto chatToChatDto(Chat chat);

    Chat chatDtoToChat(ChatDto dto);
}
