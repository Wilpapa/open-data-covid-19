package com.mongodb.coronavirus;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.util.Date;
import java.util.Objects;

public class GlobalAndUs {

    private ObjectId id;
    private Integer uid;
    private String country;
    @BsonProperty("country_code")
    private Integer countryCode;
    @BsonProperty("country_iso2")
    private String countryIso2;
    @BsonProperty("country_iso3")
    private String countryIso3;
    private String state;
    private String city;
    @BsonProperty("combined_name")
    private String combinedName;
    private Integer confirmed;
    private Integer deaths;
    private Integer recovered;
    private Integer population;
    private Date date;
    private Integer fips;
    private Coordinate loc;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryIso2() {
        return countryIso2;
    }

    public void setCountryIso2(String countryIso2) {
        this.countryIso2 = countryIso2;
    }

    public String getCountryIso3() {
        return countryIso3;
    }

    public void setCountryIso3(String countryIso3) {
        this.countryIso3 = countryIso3;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCombinedName() {
        return combinedName;
    }

    public void setCombinedName(String combinedName) {
        this.combinedName = combinedName;
    }

    public Integer getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getFips() {
        return fips;
    }

    public void setFips(Integer fips) {
        this.fips = fips;
    }

    public Coordinate getLoc() {
        return loc;
    }

    public void setLoc(Coordinate loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Statistic{");
        sb.append("id=").append(id);
        sb.append(", uid='").append(uid).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", countryCode='").append(countryCode).append('\'');
        sb.append(", countryIso2='").append(countryIso2).append('\'');
        sb.append(", countryIso3='").append(countryIso3).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", combinedName='").append(combinedName).append('\'');
        sb.append(", confirmed=").append(confirmed);
        sb.append(", deaths=").append(deaths);
        sb.append(", recovered=").append(recovered);
        sb.append(", population=").append(population);
        sb.append(", date=").append(date);
        sb.append(", fips=").append(fips);
        sb.append(", loc=").append(loc);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        GlobalAndUs globalAndUs = (GlobalAndUs) o;
        return Objects.equals(id, globalAndUs.id) && Objects.equals(uid, globalAndUs.uid) && Objects.equals(country,
                                                                                                            globalAndUs.country) && Objects
                .equals(countryCode, globalAndUs.countryCode) && Objects.equals(countryIso2,
                                                                                globalAndUs.countryIso2) && Objects.equals(
                countryIso3, globalAndUs.countryIso3) && Objects.equals(state, globalAndUs.state) && Objects.equals(city,
                                                                                                                    globalAndUs.city) && Objects
                .equals(combinedName, globalAndUs.combinedName) && Objects.equals(confirmed, globalAndUs.confirmed) && Objects.equals(
                deaths, globalAndUs.deaths) && Objects.equals(recovered, globalAndUs.recovered) && Objects.equals(population,
                                                                                                                  globalAndUs.population) && Objects
                .equals(date, globalAndUs.date) && Objects.equals(fips, globalAndUs.fips) && Objects.equals(loc, globalAndUs.loc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uid, country, countryCode, countryIso2, countryIso3, state, city, combinedName, confirmed, deaths,
                            recovered, population, date, fips, loc);
    }
}