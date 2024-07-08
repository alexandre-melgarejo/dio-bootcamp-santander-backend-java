package me.dio.controller;

import me.dio.domain.dto.UserDTO;
import me.dio.domain.model.User;
import me.dio.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<Iterable<UserDTO>> findAll() {
        return ResponseEntity.ok(UserDTO.UserDTOList(userService.findAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
       UserDTO userDTO = new UserDTO(userService.findById(id));
       return ResponseEntity.ok(userDTO);
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody User userToCreate) {
        User userCreated = userService.create(userToCreate);
        return ResponseEntity.status(HttpStatus.CREATED).body(new UserDTO(userCreated));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id ) {
        userService.delete(id);
        return ResponseEntity.noContent().build();

    }

    //TODO Descobrir como implementar metodo PUT para alterar o user

}
