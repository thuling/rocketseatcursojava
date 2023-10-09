package br.com.thuliogabriel.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
  
  /*
   * String (texto)
   * Integer (int) numeros inteiros
   * Double (double) Numeros 0.00
   * Float *(float) Numeros 0.000
   * char (A C)
   * Date (data)
   * void
   */
  @PostMapping("/")
  public void create(@RequestBody UserModel userModel) {
    System.out.println(userModel.name);
  }
}
