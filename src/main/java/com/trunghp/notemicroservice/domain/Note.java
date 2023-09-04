package com.trunghp.notemicroservice.domain;

import com.trunghp.notemicroservice.service.DTO.NoteDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "note")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	@Column(name = "SUBJECT")
	private String subject;
	@Column(name = "CONTENT")
	private String content;
	@CreationTimestamp
	@Column(name = "CREATED_AT")
	private LocalDateTime createdAt;
	@UpdateTimestamp
	@Column(name = "LAST_MODIFIED_AT")
	private LocalDateTime lastModifiedAt;

	@ManyToOne
	@JoinColumn(name = "TYPE_ID")
	private Category category;

	public Note(NoteDTO source) {
		BeanUtils.copyProperties(source, this);
	}
}
