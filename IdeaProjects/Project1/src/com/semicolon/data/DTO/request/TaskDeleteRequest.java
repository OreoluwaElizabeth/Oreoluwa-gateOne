package com.semicolon.data.DTO.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskDeleteRequest {
    private String taskId;
    private String taskName;
    private Boolean forceDelete;
}