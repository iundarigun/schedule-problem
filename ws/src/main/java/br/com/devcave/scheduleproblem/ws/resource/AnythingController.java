package br.com.devcave.scheduleproblem.ws.resource;

import br.com.devcave.scheduleproblem.service.AnythingService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class AnythingController {

    @Autowired
    private AnythingService anythingService;

    @RequestMapping(value = "/validate-something", method = RequestMethod.POST)
    public void validateSomething(){
        log.info("validamos por ws");
        anythingService.validateSomething();
    }
}
