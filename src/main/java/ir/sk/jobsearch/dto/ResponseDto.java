package ir.sk.jobsearch.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResponseDto<K> {
    K data;
}
