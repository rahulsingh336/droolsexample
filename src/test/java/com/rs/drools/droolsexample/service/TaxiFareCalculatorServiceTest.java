package com.rs.drools.droolsexample.service;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

import com.rs.drools.droolsexample.configuration.TaxiFareConfiguration;
import com.rs.drools.droolsexample.model.Fare;
import com.rs.drools.droolsexample.model.TaxiRide;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = TaxiFareConfiguration.class)
@SpringBootTest
public class TaxiFareCalculatorServiceTest {

  @Autowired
  private TaxiFareCalculatorService taxiFareCalculatorService;

  @Test
  public void whenNightSurchargeFalseAndDistLessThan10_thenFixWithoutNightSurcharge() {

    TaxiRide taxiRide = new TaxiRide();
    taxiRide.setNightSurCharge(false);
    taxiRide.setDistanceInMile(9L);
    Fare rideFare = new Fare();

    Long totalCharge = taxiFareCalculatorService.calculateFare(taxiRide, rideFare);

    assertNotNull(totalCharge);
    assertEquals(Long.valueOf(70), totalCharge);
  }

}
