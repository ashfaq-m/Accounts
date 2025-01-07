package com.easybytes.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    @NotEmpty(message = "Name can not be null or empty")
    @Size(min = 5, max = 20)
    private String name;

    @NotEmpty(message = "Email address can not be null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Pattern(regexp = "($|[0-9]{10})", message = "Mobile number must be 10 number")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
