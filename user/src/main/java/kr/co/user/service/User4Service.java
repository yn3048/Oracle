package kr.co.user.service;

import kr.co.user.dto.User4DTO;
import kr.co.user.mapper.User4Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User4Service {

    private final User4Mapper user4Mapper;

    public User4Service(User4Mapper user4Mapper) {
        this.user4Mapper = user4Mapper;
    }

    public void insertUser4(User4DTO user4DTO) {
        user4Mapper.insertUser4(user4DTO);
    }
    public User4DTO selectUser4(String name) {
        return user4Mapper.selectUser4(name);
    }
    public List<User4DTO> selectUser4s(){
        return user4Mapper.selectUser4s();
    }
    public void updateUser4(User4DTO user4DTO) {
        user4Mapper.updateUser4(user4DTO);
    }
    public void deleteUser4(String name){
        user4Mapper.deleteUser4(name);
    }
}
