package org.esprit.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatService {
    @Autowired
    private CandidatRepository candidatRepository;

    public Candidat addcandidat(Candidat candidat){
        return candidatRepository.save(candidat);
    }
    public List<Candidat> getAllCandidat(){
        return candidatRepository.findAll();
    }
    public Candidat updatecandidat(int id,Candidat c){
        if(candidatRepository.findById(id).isPresent()){
           Candidat existingcandidat = candidatRepository.findById(id).get();
              existingcandidat.setNom(c.getNom());
              existingcandidat.setPrenom(c.getPrenom());
              existingcandidat.setEmail(c.getEmail());
            return candidatRepository.save(existingcandidat);

        }
       else
           return null;
    }
    public String deleteCandidat(int id){
        if(candidatRepository.findById(id).isPresent()){
            candidatRepository.deleteById(id);
            return "Candidat supprimer";
        }
        else
            return "Candidat non supprimer";
    }
}
