package com.jamsirat.atmapi.dto.response.product;

import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDeleteProductDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
}

