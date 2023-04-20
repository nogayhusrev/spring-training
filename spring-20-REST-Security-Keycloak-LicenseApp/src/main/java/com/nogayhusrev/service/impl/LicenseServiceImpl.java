package com.nogayhusrev.service.impl;

import com.nogayhusrev.model.License;
import com.nogayhusrev.model.Organization;
import com.nogayhusrev.repository.LicenseRepository;
import com.nogayhusrev.client.OrganizationFeignClient;
import com.nogayhusrev.service.LicenseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenseServiceImpl implements LicenseService {

    private final LicenseRepository licenseRepository;
    private final OrganizationFeignClient feignClient;

    public LicenseServiceImpl(LicenseRepository licenseRepository, OrganizationFeignClient feignClient) {
        this.licenseRepository = licenseRepository;
        this.feignClient = feignClient;
    }

    public License getLicense(Long licenseId, Long organizationId) throws Exception {

        License license = licenseRepository.findById(licenseId).orElseThrow(() -> new Exception("License not found"));

        Organization organization = retrieveOrganizationInfo(organizationId);

        if (organization != null) {

            license.setOrganizationName(organization.getName());
            license.setContactName(organization.getContactName());
            license.setContactEmail(organization.getContactEmail());
            license.setContactPhone(organization.getContactPhone());

        }

        return license;

    }

    private Organization retrieveOrganizationInfo(Long organizationId) {
        return feignClient.getOrganization(organizationId);
    }

    public License createLicense(License license) {
        licenseRepository.save(license);
        return license;
    }

    public License updateLicense(License license) {
        licenseRepository.save(license);
        return license;
    }

    public String deleteLicense(Long licenseId) throws Exception {
        License license = licenseRepository.findById(licenseId).orElseThrow(() -> new Exception("License not found"));
        licenseRepository.delete(license);
        return "License deleted";
    }

    public List<License> getLicensesByOrganization(Long organizationId) {
        return licenseRepository.findByOrganizationId(organizationId);
    }

}
