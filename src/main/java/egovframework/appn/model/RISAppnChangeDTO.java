package egovframework.appn.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 예약 기준 관리 - 예약 변동 내역 DTO

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class RISAppnChangeDTO {
	private String 예외구분;
	private String 적용일자;
	private String 변동사유;
}
