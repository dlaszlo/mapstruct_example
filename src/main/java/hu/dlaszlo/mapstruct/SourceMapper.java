package hu.dlaszlo.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SourceMapper {
    SourceMapper INSTANCE = Mappers.getMapper(SourceMapper.class);

    Target sourceToTarget(Source source);
}
