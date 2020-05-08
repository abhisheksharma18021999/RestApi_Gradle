package nearpe.service;


import nearpe.model.AreaInfo;
import nearpe.repository.AreaInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AreaInfoService {


    @Autowired
    private AreaInfoRepository areaInfoRepository;

    @Transactional
    public List<AreaInfo> findByZipy(Integer zipcode){
        return areaInfoRepository.findByZipcode(zipcode);
    }


    public void saveRecord(AreaInfo areaInfo) {
         areaInfoRepository.save(areaInfo);
    }


    public void updateRecord(AreaInfo areaInfo) {
        areaInfoRepository.save(areaInfo);
    }




    public List<AreaInfo> findAll(){
        List<AreaInfo> bes = (List<AreaInfo>)areaInfoRepository.findAll();
        return bes;
    }


    @Transactional
    public void deleteByZip(Integer zipcode) {
        areaInfoRepository.deleteByZipcode(zipcode);
    }

    public void deleteById(long id) {
        areaInfoRepository.deleteById(id);
    }

}
