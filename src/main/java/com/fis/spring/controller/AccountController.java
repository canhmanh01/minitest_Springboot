package com.fis.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fis.spring.entity.Account;
import com.fis.spring.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	 AccountService accountService;

	@PostMapping("/save")
	@ResponseBody
	
	public ResponseEntity<?> save(@RequestBody Account account){
				
		return ResponseEntity.ok(accountService.save(account));
		
	}
	@PostMapping("/update")
    @ResponseBody
    public ResponseEntity<?> update(@RequestBody Account account){
		
        return ResponseEntity.ok( accountService.update(account));
    }
    @GetMapping ("/delete/{id}")
    @ResponseBody
    public ResponseEntity<?> delete(@PathVariable Long id){
        accountService.deleteById(id);
        return ResponseEntity.ok("Done!");
    }

    @GetMapping ("/getById/{accountId}")
    @ResponseBody
    public ResponseEntity<?> getById(@PathVariable Account id){

        return ResponseEntity.ok( accountService.save(id));
    }

	
	

}
