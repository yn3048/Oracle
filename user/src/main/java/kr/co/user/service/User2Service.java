package kr.co.user.service;

import kr.co.user.dto.User2DTO;
import kr.co.user.mapper.User2Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User2Service {

    private final User2Mapper user2Mapper;

    public User2Service(User2Mapper user2Mapper) {
        this.user2Mapper = user2Mapper;
    }

    public void insertUser2(User2DTO user2DTO) {
        user2Mapper.insertUser2(user2DTO);
    }

    public User2DTO selectUser2(String id) {
        return user2Mapper.selectUser2(id);
    }

    public List<User2DTO> selectUser2s() {
        return user2Mapper.selectUser2s();
    }

    public void updateUser2(User2DTO user2DTO) {
        user2Mapper.updateUser2(user2DTO);
    }

    public void deleteUser2(String id) {
        user2Mapper.deleteUser2(id);
    }
}






















