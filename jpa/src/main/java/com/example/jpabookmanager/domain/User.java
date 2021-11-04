package com.example.jpabookmanager.domain;

import lombok.*;

import java.time.LocalDateTime;
/*
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
 */
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class User {
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
