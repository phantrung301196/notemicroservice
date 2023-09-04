package com.trunghp.notemicroservice.service.DTO;

import org.springframework.beans.BeanUtils;

import com.trunghp.notemicroservice.anotation.Required;
import com.trunghp.notemicroservice.domain.Note;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NoteDTO {
	private String id;

	@Required
	private String content;
	private String type;

	public NoteDTO(Note sourece) {
		BeanUtils.copyProperties(sourece, this);
	}
}
