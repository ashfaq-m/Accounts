package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(
        name = "Customer",
        description = "Name of the Customer"
)
public class CustomerDto {

    @Schema(
            description = "Schema to hold Customer and Account information",
            example = "Eazy Bytes"
    )
    @NotEmpty(message = "Name can not be null or empty")
    @Size(min = 5, max = 20)
    private String name;

    @Schema(
            description = "Email address of the customer",
            example = "tutor@eazybytes.com"
    )
    @NotEmpty(message = "Email address can not be null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Schema(
            description = "Mobile Number of the customer",
            example = "9345432123"
    )
    @Pattern(regexp = "($|[0-9]{10})", message = "Mobile number must be 10 number")
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;
}
