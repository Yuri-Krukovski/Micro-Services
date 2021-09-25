package com.example.notification.config;

import com.example.notification.domain.enums.Status;
import com.example.notification.domain.enums.Type;
import com.example.notification.domain.model.Notification;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.core.serializer.support.SerializationFailedException;

import java.io.IOException;
import java.time.LocalDate;

@JsonComponent
public class CustomNotificationJsonDeserializer extends StdDeserializer<Notification> {

    public CustomNotificationJsonDeserializer() {
        this(null);
    }

    public CustomNotificationJsonDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Notification deserialize(JsonParser jp, DeserializationContext ctxt)
            {
                JsonNode node;
                try {
                    node = jp.getCodec().readTree(jp);
                    return Notification.builder().message(node.get("message").asText())
                            .type(Type.valueOf(node.get("type").asText()))
                            .status(Status.valueOf((node.get("status").asText())))
                            .created(LocalDate.parse(node.get("created").asText()))
                            .createdBy(node.get("createdBy").asText())
                            .modified(LocalDate.parse(node.get("modified").asText()))
                            .modifiedBy(node.get("modifiedBy").asText())
                            .build();
                } catch (IOException e) {
                    throw new SerializationFailedException(e.getMessage());
                }
            }
}
