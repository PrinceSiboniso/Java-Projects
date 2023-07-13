package com.eniviro.Assesment.grad001.prince.ntimeni.batch;

import com.eniviro.Assesment.grad001.prince.ntimeni.model.User;
import com.eniviro.Assesment.grad001.prince.ntimeni.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWritter implements ItemWriter<User> {

   @Autowired
   private UserRepository userRepository;
    @Override
    public void write(List<? extends User>users) throws Exception {
        System.out.println("Data saved for users"+users);
        userRepository.save(users);

    }
}
