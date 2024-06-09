package gft.challenge.hotel.reservation.http.resources.mappers;

import gft.challenge.hotel.reservation.domain.Hotel;
import gft.challenge.hotel.reservation.http.resources.dto.CreateHotelDTO;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(builder = @Builder(disableBuilder = true), componentModel = "spring")
public interface ResourcesModelMapper {
  Hotel from(final CreateHotelDTO source);
}
