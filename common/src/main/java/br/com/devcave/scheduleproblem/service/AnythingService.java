package br.com.devcave.scheduleproblem.service;

import lombok.extern.java.Log;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Log
public class AnythingService {

    @Scheduled(cron="0 0/1 * 1/1 * ?")
    public void validateSomething(){
        log.info("Executamos o metodo de validacao");
    }
}
