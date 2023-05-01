package com.bipin.service;

import com.bipin.model.Speaker;
import com.bipin.respository.HibernateSpeakerRepoImpl;
import com.bipin.respository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;
    public SpeakerServiceImpl()
    {
        System.out.println("SpeakerServiceImpl no args constructor");
    }
    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl with repository arg");
        this.repository = repository;
    }

    @PostConstruct
    private void initialization()
    {
        System.out.println("we're called after the constructor");
    }
    @Override
    public List<Speaker> findAll()
    {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("Setter reporsitory");
        this.repository = repository;
    }
}
