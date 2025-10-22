package ru.kuznetsovMD.iocLab.task25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScanClient {
    @Autowired
    private ScannedService scannedService;

    public void useScanService() {
        System.out.println(scannedService.getScannedService());
    }
}
