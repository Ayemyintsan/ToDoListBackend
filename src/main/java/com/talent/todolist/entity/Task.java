package com.talent.todolist.entity;

import com.talent.todolist.enumeration.RepeatType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Column(columnDefinition = "NVARCHAR(30)")
    private String label;
    private LocalTime startTime;
    private LocalTime endTime;

    @Enumerated(EnumType.STRING)
    private RepeatType repeatType;

    @ManyToOne(cascade = CascadeType.MERGE)
   private Category category;

    public Task(String label, LocalTime startTime, LocalTime endTime, RepeatType repeatType, Category category) {
        this.label = label;
        this.startTime = startTime;
        this.endTime = endTime;
        this.repeatType = repeatType;
        this.category = category;
    }
}
