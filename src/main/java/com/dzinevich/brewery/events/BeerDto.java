package com.dzinevich.brewery.events;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class BeerDto implements Serializable {
    private static final long serialVersionUID = 4540009248496159729L;
    @Null
    private UUID id;
    @Null
    private Integer version;

    @Null
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss:Z", shape = JsonFormat.Shape.STRING)
    private OffsetDateTime createdOn;
    @Null
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss:Z", shape = JsonFormat.Shape.STRING)
    private OffsetDateTime lastModifiedOn;

    @NotBlank
    private String name;
    @NotNull
    private String style;

    @Positive
    @NotNull
    private Long upc;
    @Positive
    @NotNull
    private BigDecimal price;
    private Integer quantityOnHand;
}
