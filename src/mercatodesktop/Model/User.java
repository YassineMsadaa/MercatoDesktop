/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.Model;

import java.sql.Date;

/**
 *
 * @author PC-Yassine
 */
public class User {
    int id;
    private String username;
    private String roles;
    private String email;
    private String password;
    private String name;
    private String lastName;
    private Date birthDate;
    private String birthPlace;
    private String gender;
    private String profile_pic;
    private String sponsorship;
    private int balance;
    private String sport;
    private String jobStatus;
    private String healthStatus;
    private String resume;
    private int height;
    private int weight;
    private String sportPosition;
    private Date sponsorshipDate;
    private Date spEndDate;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getSponsorship() {
        return sponsorship;
    }

    public void setSponsorship(String sponsorship) {
        this.sponsorship = sponsorship;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSportPosition() {
        return sportPosition;
    }

    public void setSportPosition(String sportPosition) {
        this.sportPosition = sportPosition;
    }

    public Date getSponsorshipDate() {
        return sponsorshipDate;
    }

    public void setSponsorshipDate(Date sponsorshipDate) {
        this.sponsorshipDate = sponsorshipDate;
    }

    public Date getSpEndDate() {
        return spEndDate;
    }

    public void setSpEndDate(Date spEndDate) {
        this.spEndDate = spEndDate;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", roles=" + roles + ", email=" + email + ", password=" + password + ", name=" + name + ", lastName=" + lastName + ", birthDate=" + birthDate + ", birthPlace=" + birthPlace + ", gender=" + gender + ", profile_pic=" + profile_pic + ", sponsorship=" + sponsorship + ", balance=" + balance + ", sport=" + sport + ", jobStatus=" + jobStatus + ", healthStatus=" + healthStatus + ", resume=" + resume + ", height=" + height + ", weight=" + weight + ", sportPosition=" + sportPosition + ", sponsorshipDate=" + sponsorshipDate + ", spEndDate=" + spEndDate + '}';
    }

    public User() {
    }

    public User(int id, String username, String roles, String email, String password, String name, String lastName, Date birthDate, String birthPlace, String gender, String profile_pic, String sponsorship, int balance, String sport, String jobStatus, String healthStatus, String resume, int height, int weight, String sportPosition, Date sponsorshipDate, Date spEndDate) {
        this.id = id;
        this.username = username;
        this.roles = roles;
        this.email = email;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.profile_pic = profile_pic;
        this.sponsorship = sponsorship;
        this.balance = balance;
        this.sport = sport;
        this.jobStatus = jobStatus;
        this.healthStatus = healthStatus;
        this.resume = resume;
        this.height = height;
        this.weight = weight;
        this.sportPosition = sportPosition;
        this.sponsorshipDate = sponsorshipDate;
        this.spEndDate = spEndDate;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
