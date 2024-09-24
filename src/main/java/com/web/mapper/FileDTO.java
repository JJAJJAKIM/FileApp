package com.web.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FileDTO {

	private int no; // PK
	private String nm1; // 기존 파일명
	private String nm2; // 서버에 저장할 새로운 파일명.
	private String extension; // 파일 확장자명.
	private String path; // 저장경로
	private String type; // 이미지 타입
	private boolean del;
	
}
