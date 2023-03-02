package com.emma.inyeccion_dependencia.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ConsultListExamDTO {

    @NotNull
    private ConsultDTO consult;
    @NotNull
    private List<ExamDTO> lstExam;


}
