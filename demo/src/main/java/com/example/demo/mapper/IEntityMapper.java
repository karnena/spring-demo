package com.example.demo.mapper;

import java.text.ParseException;
import java.util.List;

public interface IEntityMapper<D, E> {
	D toDto(E e);

	E toEntity(D d) throws ParseException;

	List<D> toDto(List<E> eList);

	List<E> toEntity(List<D> dList) throws ParseException;
}