package com.benjaminhalasz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benjaminhalasz.domain.Kids;
import com.benjaminhalasz.domain.Parents;
import com.benjaminhalasz.repository.KidsRepo;
import com.benjaminhalasz.repository.ParentsRepo;

@Service
public class KidsService {
    KidsRepo kidsRepository;
    ParentsRepo parentsRepository;

    @Autowired
    public void setKidsRepository(KidsRepo kidsRepository) {
        this.kidsRepository = kidsRepository;
    }
    public List<Kids> getKids(Parents id) {
        return kidsRepository.findKidsByParentId(id);
    }
}