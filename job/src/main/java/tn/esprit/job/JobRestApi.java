package tn.esprit.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobRestApi {
    @Autowired
    JobService jobService;

    @PostMapping("/ajout")
    public ResponseEntity<Job> createJob(@RequestBody Job job) {
        return new ResponseEntity<Job>(jobService.addcjob(job), HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Job>> getall() {
        return new ResponseEntity<List<Job>>(jobService.getAlljob(), HttpStatus.OK);
    }

    @PutMapping(value = "update")
    public void updateJob(@RequestParam int id,@RequestParam boolean etat) {
     jobService.updateEtat(id,etat);
    }

    @DeleteMapping("/del/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable(value = "id") int id) {
        return new ResponseEntity<String>(jobService.deletejob(id), HttpStatus.OK);
    }
}
