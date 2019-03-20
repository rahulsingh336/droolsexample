package com.rs.drools.droolsexample.service;

import com.rs.drools.droolsexample.model.Fare;
import com.rs.drools.droolsexample.model.TaxiRide;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxiFareCalculatorService {

  @Autowired
  private KieContainer kieContainer;

  public Long calculateFare(TaxiRide taxiRide, Fare rideFare) {
    KieSession kieSession = kieContainer.newKieSession();
    kieSession.setGlobal("rideFare", rideFare);
    kieSession.insert(taxiRide);
    kieSession.fireAllRules();
    kieSession.dispose();
    return Long.valueOf(rideFare.getRideFare());
  }
}
