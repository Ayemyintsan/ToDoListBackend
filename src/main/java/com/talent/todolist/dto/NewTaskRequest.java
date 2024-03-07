package com.talent.todolist.dto;

import com.talent.todolist.entity.Category;
import com.talent.todolist.enumeration.RepeatType;
import lombok.*;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class NewTaskRequest {
    private String label;
    private LocalTime startTime;
    private LocalTime endTime;
    private RepeatType repeatType;
    private Category category;
}
