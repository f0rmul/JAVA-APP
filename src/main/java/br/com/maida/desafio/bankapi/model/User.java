/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.maida.desafio.bankapi.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author Gabriel Duarte
 */
public class User {

    private static final String REGEX_EMAIL = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    @NotNull(message = "Поле электронной почты отсутствует.")
    @NotEmpty(message = "Пустое поле электронной почты.")
    @Email(message = "Неверный адрес электронной почты.")
    @Pattern(regexp = REGEX_EMAIL, message = "Неверный адрес электронной почты.")
    private String email;

    @NotNull(message = "Отсутствует поле пароля.")
    @NotEmpty(message = "Пустое поле пароля.")
    @Size(min = 8, max = 20, message = "Пароль должен содержать от 8 до 20 символов.")
    @Pattern(regexp = REGEX_PASSWORD, message = "Пароль должен содержать строчные и прописные буквы, цифры и специальные символы.")
    private String password;

    @NotNull(message = "Поле имени отсутствует.")
    @NotEmpty(message = "Пустое поле имени.")
    private String name;

    public User() {

    }

    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
