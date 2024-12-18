package com.devil.crud.service;

import com.devil.crud.entity.Dept;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName：DeptService
 *
 * @author: Devil
 * @Date: 2024/12/18
 * @Description:
 * @version: 1.0
 */
@Service
public class DeptService {
    Map<Long,Dept> data = new ConcurrentHashMap<Long, Dept>();
    public void deleteDept(Long id){
        data.remove(id);
    }
    public void saveDept(Dept dept){
        data.put(dept.getId(),dept);
    }
    public List<Dept> getDepts(){
        return data.values().stream().toList();
    }
    public Dept getDeptById(Long id) {
        return data.get(id);
    }
}
