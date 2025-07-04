package farm_sharing.client.model;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Builder
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    private Long id;
    @Setter
    private String name;
    @Setter
    @Column(nullable = false, unique = true)
    private String phoneNumber;
    @Column(nullable = false)
    @Setter
    private String city;
    @Setter
    @Column(nullable = false, unique = true) // Ensures email is unique and not null
    private String email;


}



