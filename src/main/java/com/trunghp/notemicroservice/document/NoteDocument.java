package com.trunghp.notemicroservice.document;

import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.trunghp.notemicroservice.domain.Note;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(indexName = "note")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NoteDocument {

	@Id
	@Field(fielddata = true)
	private String id;
	
	@Field(type = FieldType.Text)
	private String content;
	
	@Field(type = FieldType.Text)
	private String type;
	
	@Field(type = FieldType.Text)
	private String subject;

	public NoteDocument(Note source) {
		BeanUtils.copyProperties(source, this);
	}
}
