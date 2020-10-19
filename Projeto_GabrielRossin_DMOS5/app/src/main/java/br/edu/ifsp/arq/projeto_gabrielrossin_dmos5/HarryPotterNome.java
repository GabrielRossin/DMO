package br.edu.ifsp.arq.projeto_gabrielrossin_dmos5;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HarryPotterNome {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("house")
    @Expose
    private String house;
    @SerializedName("school")
    @Expose
    private String school;
    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("wand")
    @Expose
    private String wand;
    @SerializedName("boggart")
    @Expose
    private String boggart;
    @SerializedName("patronus")
    @Expose
    private String patronus;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("ministryOfMagic")
    @Expose
    private Boolean ministryOfMagic;
    @SerializedName("orderOfThePhoenix")
    @Expose
    private Boolean orderOfThePhoenix;
    @SerializedName("dumbledoresArmy")
    @Expose
    private Boolean dumbledoresArmy;
    @SerializedName("deathEater")
    @Expose
    private Boolean deathEater;
    @SerializedName("bloodStatus")
    @Expose
    private String bloodStatus;
    @SerializedName("species")
    @Expose
    private String species;

    /**
     * No args constructor for use in serialization
     *
     */
    public HarryPotterNome() {
    }

    /**
     *
     * @param patronus
     * @param role
     * @param ministryOfMagic
     * @param orderOfThePhoenix
     * @param house
     * @param bloodStatus
     * @param school
     * @param species
     * @param v
     * @param deathEater
     * @param wand
     * @param dumbledoresArmy
     * @param name
     * @param alias
     * @param id
     * @param boggart
     */
    public HarryPotterNome(String id, String name, String role, String house, String school, String alias, String wand, String boggart, String patronus, Integer v, Boolean ministryOfMagic, Boolean orderOfThePhoenix, Boolean dumbledoresArmy, Boolean deathEater, String bloodStatus, String species) {
        super();
        this.setId(id);
        this.setName(name);
        this.setRole(role);
        this.setHouse(house);
        this.setSchool(school);
        this.setAlias(alias);
        this.setWand(wand);
        this.setBoggart(boggart);
        this.setPatronus(patronus);
        this.setV(v);
        this.setMinistryOfMagic(ministryOfMagic);
        this.setOrderOfThePhoenix(orderOfThePhoenix);
        this.setDumbledoresArmy(dumbledoresArmy);
        this.setDeathEater(deathEater);
        this.setBloodStatus(bloodStatus);
        this.setSpecies(species);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getWand() {
        return wand;
    }

    public void setWand(String wand) {
        this.wand = wand;
    }

    public String getBoggart() {
        return boggart;
    }

    public void setBoggart(String boggart) {
        this.boggart = boggart;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Boolean getMinistryOfMagic() {
        return ministryOfMagic;
    }

    public void setMinistryOfMagic(Boolean ministryOfMagic) {
        this.ministryOfMagic = ministryOfMagic;
    }

    public Boolean getOrderOfThePhoenix() {
        return orderOfThePhoenix;
    }

    public void setOrderOfThePhoenix(Boolean orderOfThePhoenix) {
        this.orderOfThePhoenix = orderOfThePhoenix;
    }

    public Boolean getDumbledoresArmy() {
        return dumbledoresArmy;
    }

    public void setDumbledoresArmy(Boolean dumbledoresArmy) {
        this.dumbledoresArmy = dumbledoresArmy;
    }

    public Boolean getDeathEater() {
        return deathEater;
    }

    public void setDeathEater(Boolean deathEater) {
        this.deathEater = deathEater;
    }

    public String getBloodStatus() {
        return bloodStatus;
    }

    public void setBloodStatus(String bloodStatus) {
        this.bloodStatus = bloodStatus;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

}
