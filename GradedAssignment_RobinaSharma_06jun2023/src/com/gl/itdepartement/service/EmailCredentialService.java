package com.gl.itdepartement.service;

import com.gl.itdepartement.model.Employee;

public interface EmailCredentialService {

     public String generateEmailAddress(Employee emp, String departement);
     
     public String generatepassword();
     
     public void showCredentials(Employee emp, String departement);

}
