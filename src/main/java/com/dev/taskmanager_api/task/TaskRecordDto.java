package com.dev.taskmanager_api.task;

import java.util.UUID;

public record TaskRecordDto(String title, String description, String status, UUID userId) {
}
