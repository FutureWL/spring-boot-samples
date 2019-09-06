package org.sang.batch.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    JobLauncher jobLauncher;
    @Autowired
    Job job;
    @GetMapping("/hello")
    public void hello() {
        try {
            jobLauncher.run(job, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
