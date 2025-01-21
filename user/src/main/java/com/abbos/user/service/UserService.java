package com.abbos.user.service;

import com.abbos.user.dto.UserCreateDTO;
import com.abbos.user.dto.UserResponseDTO;
import com.abbos.user.entity.User;
import com.abbos.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Aliabbos Ashurov
 * @since 21/January/2025  11:31
 **/
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserResponseDTO save(UserCreateDTO dto) {
        User userNew = userRepository.save(new User().toBuilder()
                .username(dto.username())
                .fullName(dto.fullName())
                .email(dto.email())
                .password(dto.password())
                .build());
        return new UserResponseDTO(userNew.getId(), userNew.getFullName(), userNew.getUsername(), userNew.getEmail());
    }

    public UserResponseDTO findById(Long id) {
        User user = userRepository.findById(id).orElse(null);
        return new UserResponseDTO(user.getId(), user.getFullName(), user.getUsername(), user.getEmail());
    }
}
