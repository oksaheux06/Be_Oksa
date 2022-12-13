package com.investment.indivara.Investment.user.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Valid
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotEmpty
    private String namaLengkap;

    @NotEmpty
    @Size(min = 8, max = 20, message = "Password harus terdiri dari minimal 8 Huruf dan maksimal 20 Huruf")
    private String password;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String nomerTelpon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String portofolioid;


}
