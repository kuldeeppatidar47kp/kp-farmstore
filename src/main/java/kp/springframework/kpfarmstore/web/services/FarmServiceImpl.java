package kp.springframework.kpfarmstore.web.services;

import kp.springframework.kpfarmstore.web.model.FarmDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FarmServiceImpl implements FarmService{
    @Override
    public FarmDto getFarmEssentialById(UUID id) {
        return FarmDto.builder().id(UUID.randomUUID())
                .EssentialName("tractor")
                .EssentialType("Machinary")
                .price(1000000)
                .build();
    }
}
