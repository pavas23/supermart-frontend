package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Manager;
import com.example.demo.repository.ManagerRepository;

@Service
public class ManagerServiceImpl implements ManagerService{
    
    @Autowired
    ManagerRepository managerRepo;
    @Override
    public Manager saveManager(Manager manager) {
        
        return managerRepo.save(manager);
    }

    @Override
    public List<Manager> getAllManagers() {
        // TODO Auto-generated method stub
        
        return managerRepo.findAll();
    }

    @Override
    public Manager getManager(int id) {
        
        return (Manager) managerRepo.findById(id).get();
    }

    @Override
    public void deleteManager(Manager manager) {
        managerRepo.deleteById(manager.getId());
        
    }

    @Override
    public void updateManager(Manager manager) {
       List<Manager> list = this.getAllManagers();
       
       for(Manager obj: list) {
           if(manager.getId()==obj.getId()) {
               if(manager.getName()!=null) {
                   obj.setName(manager.getName());
               }
               if(manager.getEmail()!=null) {
                   obj.setEmail(manager.getEmail());
               }
               if(manager.getPassword()!=null) {
                   obj.setPassword(manager.getPassword());
               }
               
               this.saveManager(obj);
               return;
           }
       }
        
    }

}