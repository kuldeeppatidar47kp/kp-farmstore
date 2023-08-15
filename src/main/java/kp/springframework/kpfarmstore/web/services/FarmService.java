package kp.springframework.kpfarmstore.web.services;

import kp.springframework.kpfarmstore.web.model.FarmDto;

import java.util.UUID;

public interface FarmService {
    FarmDto getFarmEssentialById(UUID id);
}
