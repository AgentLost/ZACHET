package com.zachet.chatservice.helper.mapper;


import com.zachet.chatservice.dto.ChatDto;
import com.zachet.chatservice.dto.MessageDto;
import com.zachet.chatservice.model.Chat;
import com.zachet.chatservice.model.Message;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface MessageMapper {

    MessageDto messageToMessageDto(Message chat);

    Message messageDtoToMessage(MessageDto dto);

}
