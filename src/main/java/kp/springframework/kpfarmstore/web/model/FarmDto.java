package kp.springframework.kpfarmstore.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

//this is created for data transfer object
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FarmDto {
    private UUID id;
    private String EssentialName;
    private String EssentialType;
    private int price;
}
