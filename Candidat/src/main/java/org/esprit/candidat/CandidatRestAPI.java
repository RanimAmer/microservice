package org.esprit.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidats")
public class CandidatRestAPI {
    @Autowired
    CandidatService candidatService;

    @PostMapping("/ajout")
    public ResponseEntity<Candidat> createCandidat(@RequestBody Candidat candidat) {
        return new ResponseEntity<Candidat>(candidatService.addcandidat(candidat), HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Candidat>> getall() {
        return new ResponseEntity<List<Candidat>>(candidatService.getAllCandidat(), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Candidat> updateCandidat(@PathVariable(value = "id") int id, @RequestBody Candidat candidat) {
        return new ResponseEntity<Candidat>(candidatService.updatecandidat(id, candidat), HttpStatus.OK);
    }

    @DeleteMapping("/del/{id}")
    public ResponseEntity<String> deleteCandidat(@PathVariable(value = "id") int id) {
        return new ResponseEntity<String>(candidatService.deleteCandidat(id), HttpStatus.OK);
    }
}
