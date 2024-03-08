package kr.co.user.service;

import kr.co.user.dto.User5DTO;
import kr.co.user.mapper.User5Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User5Service {

    private final User5Mapper user5Mapper;

    public User5Service(User5Mapper user5Mapper) {
        this.user5Mapper = user5Mapper;
    }

    public void insertUser5(User5DTO user5DTO) {
        user5Mapper.insertUser5(user5DTO);
    }

    public User5DTO selectUser5(String name) {
        return user5Mapper.selectUser5(name);
    }

    public List<User5DTO> selectUser5s(){
        return user5Mapper.selectUser5s();
    }

    public void updateUser5(User5DTO user5DTO){
        user5Mapper.updateUser5(user5DTO);
    }

    public void deleteUser5(String name){
        user5Mapper.deleteUser5(name);
    }


}










