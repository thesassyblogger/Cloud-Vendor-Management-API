
package com.JavaProject.rest_demo.controller;

import com.JavaProject.rest_demo.model.CloudVendor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
   CloudVendor cloudVendor;

   @GetMapping("{vendorId}")
   public CloudVendor getCloudVendorDetails(String vendorId) {
      return cloudVendor;
      // return new CloudVendor("C1", "Mansi", "address 1", "xxxx");
   }

   @PostMapping
   public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
      this.cloudVendor = cloudVendor;
      return "Cloud Vendor Created successfully";
   }

   @PutMapping
   public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
      this.cloudVendor = cloudVendor;
      return "Cloud Vendor Updated successfully";
   }

   @DeleteMapping("{vendorId}")
   public String deleteCloudVendorDetails(String vendoeId){
      this.cloudVendor = null;
      return "Cloud Vendor Deleted successfully";
   }

}
