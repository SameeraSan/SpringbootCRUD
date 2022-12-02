package com.sam.sample.crudsample.service;

import com.sam.sample.crudsample.dto.Merchant;
import org.springframework.stereotype.Service;

@Service
public class MerchantService {

    public Merchant createMerchant(String name, String merchantId) {

        // This will create a merchant and return it
        return new Merchant(name,merchantId);

    }

    public void deleteMerchant(String merchantId) {

        // This will delete the merchant in the database

    }
}
