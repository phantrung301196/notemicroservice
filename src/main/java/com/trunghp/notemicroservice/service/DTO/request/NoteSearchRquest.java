package com.trunghp.notemicroservice.service.DTO.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NoteSearchRquest {
	private String subject;
	private String content;
	private String type;
}
