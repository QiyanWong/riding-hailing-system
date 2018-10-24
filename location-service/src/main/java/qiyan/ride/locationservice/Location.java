package qiyan.ride.locationservice;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class Location {

    private double latitude;
    private double longitude;
    private long id;
    private LocalDateTime timestamp;
    @JsonProperty
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Location() {
    }

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = LocalDateTime.now();
    }

    @JsonProperty
    public double getLatitude() {

        return latitude;
    }

    public void setLatitude(double latitude) {

        this.latitude = latitude;
    }

    @JsonProperty
    public double getLongitude() {

        return longitude;
    }

    public void setLongitude(double longitude) {

        this.longitude = longitude;
    }
    @JsonProperty
    public String getGeohash() {
        return GeoHashUtils.encode(latitude, longitude);
    }
}
