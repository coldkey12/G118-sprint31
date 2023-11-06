package kz.don.G118sprint31.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private Long id;
    private String name;
    private String surname;
    private Integer exam;
    private String mark;
}
