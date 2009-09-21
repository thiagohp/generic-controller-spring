// Copyright 2008-2009 Thiago H. de Paula Figueiredo
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package br.com.arsmachina.controller.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.arsmachina.dao.ReadableDAO;
import br.com.arsmachina.dao.SortCriterion;

/**
 * Abstract class that extends {@link ReadableControllerImpl} to annotate with {@link Transactional}
 * <code>(readOnly=true) all methods that read from the object store.
 * 
 * @author Thiago H. de Paula Figueiredo
 * @param <T> the entity class related to this controller.
 * @param <K> the type of the field that represents the entity class' primary key.
 */
public abstract class SpringReadableControllerImpl<T, K extends Serializable> extends
		ReadableControllerImpl<T, K> {

	/**
	 * Single constructor of this class.
	 * 
	 * @param dao a {@link DAO<T, K>}. It cannot be <code>null</code>.
	 */
	public SpringReadableControllerImpl(ReadableDAO<T, K> dao) {
		super(dao);
	}

	@Transactional(readOnly = false)
	@Override
	public int countAll() {
		return super.countAll();
	}

	@Transactional(readOnly = false)
	@Override
	public List<T> findAll() {
		return super.findAll();
	}

	@Transactional(readOnly = false)
	@Override
	public List<T> findAll(int firstResult, int maxResults, SortCriterion... sortCriteria) {
		return super.findAll(firstResult, maxResults, sortCriteria);
	}

	@Transactional(readOnly = false)
	@Override
	public List<T> findByExample(T example) {
		return super.findByExample(example);
	}

	@Transactional(readOnly = false)
	@Override
	public T findById(K id) {
		return super.findById(id);
	}

	@Transactional(readOnly = false)
	@Override
	public List<T> findByIds(K... ids) {
		return super.findByIds(ids);
	}

	@Transactional(readOnly = false)
	@Override
	public T reattach(T object) {
		return super.reattach(object);
	}

	@Transactional(readOnly = false)
	@Override
	public void refresh(T object) {
		super.refresh(object);
	}

}
