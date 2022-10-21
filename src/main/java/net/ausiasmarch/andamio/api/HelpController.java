package net.ausiasmarch.andamio.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ausiasmarch.andamio.entity.HelpEntity;
import net.ausiasmarch.andamio.service.HelpService;

@RestController
@RequestMapping("/help")
public class HelpController {

    @Autowired
    HelpService oHelpService;

    @GetMapping("/{id}")
    public ResponseEntity<HelpEntity> get(@PathVariable(value = "id") Long id) {
        return new ResponseEntity<HelpEntity>(oHelpService.get(id), HttpStatus.OK);
    }
}