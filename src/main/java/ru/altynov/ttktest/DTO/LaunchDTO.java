package ru.altynov.ttktest.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LaunchDTO {

    @JsonProperty("mission_name")
    private String missionName;

    @JsonProperty("launch_year")
    private String launchYear;

    private LinkDTO links;

}
