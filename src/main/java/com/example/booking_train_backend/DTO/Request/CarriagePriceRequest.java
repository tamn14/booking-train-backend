package com.example.booking_train_backend.DTO.Request;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarriagePriceRequest {
    private  String carriageClass ;
    private String scheduleName  ;
    private int price ;


}
