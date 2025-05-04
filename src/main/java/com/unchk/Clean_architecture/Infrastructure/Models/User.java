package com.unchk.Clean_architecture.Infrastructure.Models;

import com.unchk.Clean_architecture.Domain.Enum.TypeUser;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends AbstractModel{

    private String nom;
    private String prenom;
    private String email;
    private String password;
    private TypeUser type;
}
