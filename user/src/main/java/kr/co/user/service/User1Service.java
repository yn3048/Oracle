package kr.co.user.service;

import kr.co.user.dto.User1DTO;
import kr.co.user.mapper.User1Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User1Service {

    private final User1Mapper user1Mapper;

    public User1Service(User1Mapper user1Mapper) {
        this.user1Mapper = user1Mapper;
    }


    public void insertUser1(User1DTO user1DTO) {
        user1Mapper.insertUser1(user1DTO);
    }

    public User1DTO selectUser1(String id) {
        return user1Mapper.selectUser1(id);
    }

    public List<User1DTO> selectUser1s() {
        return user1Mapper.selectUser1s();
    }

    public void updateUser1(User1DTO user1DTO) {
        user1Mapper.updateUser1(user1DTO);
    }
    public void deleteUser1(String id) {
        user1Mapper.deleteUser1(id);
    }

}















