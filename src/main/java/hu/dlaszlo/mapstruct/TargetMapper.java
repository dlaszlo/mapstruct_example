package hu.dlaszlo.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TargetMapper {
    TargetMapper INSTANCE = Mappers.getMapper(TargetMapper.class);

    Source sourceToTarget(Target source);
}
