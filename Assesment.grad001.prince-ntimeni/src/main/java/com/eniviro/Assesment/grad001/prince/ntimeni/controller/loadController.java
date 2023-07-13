package com.eniviro.Assesment.grad001.prince.ntimeni.controller;

import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/load")
public class loadController {

    @Autowired
    JobLauncher jobLauncher;
    @Autowired
    Job job;

    @GetMapping

    public BatchStatus load(){


        JobParameter time = maps.put( new JobParameter(System.currentTimeMillis()));
        JobParameters parameters= new JobParameters(maps);
        JobLauncher jobExecution = jobLauncher.run(job,parameters );
        System.out.println("JobExecution "+ ((JobExecution) jobExecution).getStatus());


        return;jobExecution.getClass();




    }

}
