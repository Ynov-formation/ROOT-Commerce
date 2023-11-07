package com.ynov.commerce.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommandeDto implements Serializable {
    Long id;
    String designation;
    String description;
    LocalDateTime date;
}