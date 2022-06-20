package com.fornitfornus.springcreditdocker;

import com.fornitfornus.springcreditdocker.model.Credit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CreditApi {

    private List<Credit> credits;

    public CreditApi() {
        this.credits = new ArrayList<>();
        credits.add(new Credit("Kredyt samochodowy"));
        credits.add(new Credit("Kredyt hipoteczny"));
        credits.add(new Credit("Kredyt konsumencki"));
    }


    @GetMapping("/credits")
    public List<Credit> getCredits() {
        return credits;
    }

    @PostMapping("/credits")
    public boolean addCredits(@RequestBody Credit credit) {
        return credits.add(credit);
    }
}
