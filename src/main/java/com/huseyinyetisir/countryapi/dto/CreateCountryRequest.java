package com.huseyinyetisir.countryapi.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CreateCountryRequest {

    String id;

    String name;

    String president;
}
