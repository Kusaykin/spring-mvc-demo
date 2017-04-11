    package com.dinsoft.springdemo.mvc;

    import java.util.LinkedHashMap;

    /**
     * Created by din on 10.04.17.
     */

    public class Student {

        private String firstName;
        private String lastname;
        private String country;
        private String favoriteLanguage;
        private String[] operatingSystems;

//        private LinkedHashMap<String, String> countryOptions;

        public Student() {
            // populate country options: used ISO country code
            /*countryOptions = new LinkedHashMap<>();
            countryOptions.put("BR", "Brazil");
            countryOptions.put("FR", "France");
            countryOptions.put("DE", "Germany");
            countryOptions.put("IN", "India");
            countryOptions.put("US", "United States of America");*/
        }


//        public LinkedHashMap<String, String> getCountryOptions() {
//            return countryOptions;
//        }


        public String[] getOperatingSystems() {
            return operatingSystems;
        }

        public void setOperatingSystems(String[] operatingSystems) {
            this.operatingSystems = operatingSystems;
        }

        public String getFavoriteLanguage() {
            return favoriteLanguage;
        }

        public void setFavoriteLanguage(String favoriteLanguage) {
            this.favoriteLanguage = favoriteLanguage;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
    }
