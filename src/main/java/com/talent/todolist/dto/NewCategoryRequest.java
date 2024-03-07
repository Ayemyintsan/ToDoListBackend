package com.talent.todolist.dto;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewCategoryRequest {
    private String name;
    private String imageUrl;
}
