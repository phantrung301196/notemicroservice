package com.trunghp.notemicroservice.service.DTO;

import com.trunghp.notemicroservice.anotation.Required;
import com.trunghp.notemicroservice.domain.Note;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NoteDTO {
	private String id;
	@Required
	private String content;
	@Required
	private String typeId;

	public NoteDTO(Note source) {
		BeanUtils.copyProperties(source, this);
	}
}
