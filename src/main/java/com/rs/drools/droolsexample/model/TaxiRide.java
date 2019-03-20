package com.rs.drools.droolsexample.model;

/**
 * Created by E076103 on 20-03-2019.
 */
public class TaxiRide {

  private boolean nightSurCharge;
  private Long distanceInMile;

  public boolean isNightSurCharge() {
    return nightSurCharge;
  }

  public void setNightSurCharge(boolean nightSurCharge) {
    this.nightSurCharge = nightSurCharge;
  }

  public Long getDistanceInMile() {
    return distanceInMile;
  }

  public void setDistanceInMile(Long distanceInMile) {
    this.distanceInMile = distanceInMile;
  }
}
