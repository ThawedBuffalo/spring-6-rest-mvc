package tbs.spring6restmvc.mappers;

import org.mapstruct.Mapper;
import tbs.spring6restmvc.entities.Beer;
import tbs.spring6restmvc.model.BeerDTO;

@Mapper
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDTO dto);
    BeerDTO beerToBeerDto(Beer beer);
}
