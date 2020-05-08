package nearpe.model;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name="area_info_2")
public @Data class AreaInfo implements Serializable {
    private static final long serialVersionUID = -2346866669992342L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "district")
    private String district;

    @Column(name = "state")
    private String state;

    @Column(name = "zipcode")
    private Integer zipcode;



}
