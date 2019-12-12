package com.jvilaverde.beers.beerinventoryservice.web.mappers;

import com.jvilaverde.beers.beerinventoryservice.domain.BeerInventory;
import com.jvilaverde.beers.beerinventoryservice.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

@Mapper(uses = {com.jvilaverde.beers.beerinventoryservice.web.mappers.DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
