package nearpe.repository;


import nearpe.model.AreaInfo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;


@Repository
public interface AreaInfoRepository extends CrudRepository<AreaInfo, Long> {


//    AreaInfo save(AreaInfo areaInfo);

  //  AreaInfo create(AreaInfo areaInfo);

//    List<AreaInfo> findAll();

    List<AreaInfo>  findByZipcode(Integer zipcode);

    void deleteById(long id);



    @Modifying
    @Query("delete from area_info_2 b where b.zipcode=:zipcode")
    void deleteByZipcode(@Param("zipcode") Integer zipcode);


//    @Modifying
//  //  @Query("select * from area_info b where b.zipcode=:zipcode")
//    @Query("SELECT * FROM area_info WHERE zipcode = :zipcode")
//    AreaInfo findByZipcode(@Param("zipcode") Integer zipcode);



}