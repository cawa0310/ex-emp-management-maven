package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Administrator;
import com.example.repository.AdministratorRepository;

/**
 * AdministratorのServiceクラス
 * @author Kawaguchi_Ryuya
 */
@Service
@Transactional
public class AdministratorService {
    @Autowired
    private AdministratorRepository repository;

    /**
     * Administratorをinsertするメソッド
     * @param administrator
     */
    public void insert(Administrator administrator) {
        repository.insert(administrator);
    }

    /**
     * Administratorにloginするメソッド
     * @param mailAddress
     * @param password
     * @return mail_addressとpasswordが一致するAdministrator
     */
    public Administrator login(String mailAddress, String password) {
        return repository.findByMailAddressAndPassword(mailAddress, password);
    }
}
