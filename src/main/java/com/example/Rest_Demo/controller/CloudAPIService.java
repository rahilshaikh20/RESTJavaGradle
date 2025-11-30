package com.example.Rest_Demo.controller;

import com.example.Rest_Demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/cloudvendor")
public class CloudAPIService {

    CloudVendor cloudVendor;

    @GetMapping("{id}")
    public CloudVendor getCloudVendor(String id)
    {
        //CloudVendor cloudVendor = new CloudVendor("AWS","1","Amazon address");
        return cloudVendor;
    }

    @PostMapping
    public String addCloudVendor(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor= cloudVendor;
        return "Cloud vendor added successfully";
    }
}
