package kr.co.user.service;

import kr.co.user.dto.User3DTO;
import kr.co.user.mapper.User3Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User3Service {

    private final User3Mapper user3Mapper;

    public User3Service(User3Mapper user3Mapper) {
        this.user3Mapper = user3Mapper;
    }

    public void insertUser3(User3DTO user3DTO) {
        user3Mapper.insertUser3(user3DTO);
    }

    public User3DTO selectUser3(String id) {
        return user3Mapper.selectUser3(id);
    }

    public List<User3DTO> selectUser3s(){
        return user3Mapper.selectUser3s();
    }

    public void updateUser3(User3DTO user3DTO) {
        user3Mapper.updateUser3(user3DTO);
    }

    public void deleteUser3(String id){
        user3Mapper.deleteUser3(id);
    }
}














