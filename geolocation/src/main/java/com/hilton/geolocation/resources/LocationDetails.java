package com.hilton.geolocation.resources;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LocationDetails {
	

	 public LocationDetails() {
	        // Jackson deserialization
	    }
	
	 
	 //"status":"success","country":"United States","countryCode":"US","region":"NC","regionName":"North Carolina","city":"Charlotte","zip":"28277","lat":35.0562,"lon":-80.8194,"timezone":"America/New_York","isp":"AT\u0026T Services, Inc.","org":"AT\u0026T Corp","as":"AS7018 AT\u0026T Services, Inc.","query":"23.115.83.100"
	 
	public String status;
	public String message;
	public String country;
	public String countryCode;
	public String region;
	public String regionName;
	public String city;
	public String zip;
	public Float lat;
	public Float lon;
	public String timezone;
	public String query;
	public String isp;
	public String org;
	public String as;
	
	
	@JsonProperty
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty
	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

	@JsonProperty
	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty
	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@JsonProperty
	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}

	@JsonProperty
	public String getRegionName() {
		return regionName;
	}


	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@JsonProperty
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty
	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}

	@JsonProperty
	public Float getLat() {
		return lat;
	}


	public void setLat(Float lat) {
		this.lat = lat;
	}

	@JsonProperty
	public Float getLon() {
		return lon;
	}


	public void setLon(Float lon) {
		this.lon = lon;
	}

	@JsonProperty
	public String getTimezone() {
		return timezone;
	}


	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	@JsonProperty
	public String getQuery() {
		return query;
	}


	public void setQuery(String query) {
		this.query = query;
	}

	@JsonProperty
	public String getIsp() {
		return isp;
	}


	public void setIsp(String isp) {
		this.isp = isp;
	}

	@JsonProperty
	public String getOrg() {
		return org;
	}


	public void setOrg(String org) {
		this.org = org;
	}

	@JsonProperty
	public String getAs() {
		return as;
	}


	public void setAs(String as) {
		this.as = as;
	}

	@JsonIgnoreProperties
	public LocationDetails(String status, String message, String country, String countryCode, String region, String regionName, String city, String zip, Float lat, Float lon, String timezone, String query, String isp, String org, String as ) {
		this.status = status;
		this.message= message;
		this.country= country;
		this.countryCode= countryCode;
		this.region= region;
		this.regionName= regionName;
		this.city= city;
		this.zip= zip;
		this.lat= lat;
		this.lon= lon;
		this.timezone= timezone;
		this.query= query;
		this.isp = isp;
		this.org = org;
		this.as = as;

		
	}

}
