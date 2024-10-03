package com.example.note_collector.service.impl;

import jakarta.transaction.Transactional;
import com.example.note_collector.dao.UserDao;
import com.example.note_collector.dto.impl.UserDTO;
import com.example.note_collector.entity.impl.UserEntity;
import com.example.note_collector.service.UserService;
import com.example.note_collector.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class UserServiceIMPL implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private Mapping mapping;
    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return mapping.toUserDTO(userDao.save(mapping.toUserEntity(userDTO)));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserEntity> allUsers = userDao.findAll();
        return mapping.asUserDTOList(allUsers);
    }

    @Override
    public UserDTO getUser(String userId) {
        UserEntity selectedUser = userDao.getReferenceById(userId);
        return mapping.toUserDTO(selectedUser);
    }

    @Override
    public void deleteUser(String userId) {
        userDao.deleteById(userId);
    }

    @Override
    public void updateUser(String userId, UserDTO userDTO) {

    }
}
