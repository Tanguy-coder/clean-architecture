package com.unchk.Clean_architecture.Infrastructure.Models;

import com.unchk.Clean_architecture.Domain.Enum.CommandStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Commande extends AbstractModel{
    private String numero;
    private Date date_comande;
    private Integer qty;
    private CommandStatus status;

}
