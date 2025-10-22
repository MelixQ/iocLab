package ru.kuznetsovMD.iocLab.task8;

import org.springframework.beans.factory.annotation.Autowired;

public class XmlUserService {
    private XmlUserRepository xmlUserRepository;

    @Autowired
    public void setXmlUserRepository(XmlUserRepository xmlUserRepository) {
        this.xmlUserRepository = xmlUserRepository;
    }

    public String getUser() {
        return "User data from XML config";
    }
}