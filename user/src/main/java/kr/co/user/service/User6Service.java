package kr.co.user.service;

import kr.co.user.dto.User6DTO;
import kr.co.user.mapper.User6Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User6Service {

    private final User6Mapper user6Mapper;

    public User6Service(User6Mapper user6Mapper) {
        this.user6Mapper = user6Mapper;
    }

    public void insertUser6(User6DTO user6DTO) {
        user6Mapper.insertUser6(user6DTO);
    }
    public User6DTO selectUser6(int seq){
        return user6Mapper.selectUser6(seq);
    }
    public List<User6DTO> selectUser6s(){
        return user6Mapper.selectUser6s();
    }
    public void updateUser6(User6DTO user6DTO) {
        user6Mapper.updateUser6(user6DTO);
    }
    public void deleteUser6(int seq){
        user6Mapper.deleteUser6(seq);
    }
}
