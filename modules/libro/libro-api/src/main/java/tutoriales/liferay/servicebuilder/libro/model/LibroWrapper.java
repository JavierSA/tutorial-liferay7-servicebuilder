/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tutoriales.liferay.servicebuilder.libro.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Libro}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Libro
 * @generated
 */
@ProviderType
public class LibroWrapper implements Libro, ModelWrapper<Libro> {
	public LibroWrapper(Libro libro) {
		_libro = libro;
	}

	@Override
	public Class<?> getModelClass() {
		return Libro.class;
	}

	@Override
	public String getModelClassName() {
		return Libro.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("libroId", getLibroId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("titulo", getTitulo());
		attributes.put("publicacion", getPublicacion());
		attributes.put("genero", getGenero());
		attributes.put("escritorId", getEscritorId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long libroId = (Long)attributes.get("libroId");

		if (libroId != null) {
			setLibroId(libroId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String titulo = (String)attributes.get("titulo");

		if (titulo != null) {
			setTitulo(titulo);
		}

		Date publicacion = (Date)attributes.get("publicacion");

		if (publicacion != null) {
			setPublicacion(publicacion);
		}

		String genero = (String)attributes.get("genero");

		if (genero != null) {
			setGenero(genero);
		}

		Long escritorId = (Long)attributes.get("escritorId");

		if (escritorId != null) {
			setEscritorId(escritorId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _libro.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _libro.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _libro.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _libro.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tutoriales.liferay.servicebuilder.libro.model.Libro> toCacheModel() {
		return _libro.toCacheModel();
	}

	@Override
	public int compareTo(
		tutoriales.liferay.servicebuilder.libro.model.Libro libro) {
		return _libro.compareTo(libro);
	}

	@Override
	public int hashCode() {
		return _libro.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _libro.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new LibroWrapper((Libro)_libro.clone());
	}

	/**
	* Returns the genero of this libro.
	*
	* @return the genero of this libro
	*/
	@Override
	public java.lang.String getGenero() {
		return _libro.getGenero();
	}

	/**
	* Returns the titulo of this libro.
	*
	* @return the titulo of this libro
	*/
	@Override
	public java.lang.String getTitulo() {
		return _libro.getTitulo();
	}

	/**
	* Returns the user name of this libro.
	*
	* @return the user name of this libro
	*/
	@Override
	public java.lang.String getUserName() {
		return _libro.getUserName();
	}

	/**
	* Returns the user uuid of this libro.
	*
	* @return the user uuid of this libro
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _libro.getUserUuid();
	}

	/**
	* Returns the uuid of this libro.
	*
	* @return the uuid of this libro
	*/
	@Override
	public java.lang.String getUuid() {
		return _libro.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _libro.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _libro.toXmlString();
	}

	/**
	* Returns the create date of this libro.
	*
	* @return the create date of this libro
	*/
	@Override
	public Date getCreateDate() {
		return _libro.getCreateDate();
	}

	/**
	* Returns the modified date of this libro.
	*
	* @return the modified date of this libro
	*/
	@Override
	public Date getModifiedDate() {
		return _libro.getModifiedDate();
	}

	/**
	* Returns the publicacion of this libro.
	*
	* @return the publicacion of this libro
	*/
	@Override
	public Date getPublicacion() {
		return _libro.getPublicacion();
	}

	/**
	* Returns the company ID of this libro.
	*
	* @return the company ID of this libro
	*/
	@Override
	public long getCompanyId() {
		return _libro.getCompanyId();
	}

	/**
	* Returns the escritor ID of this libro.
	*
	* @return the escritor ID of this libro
	*/
	@Override
	public long getEscritorId() {
		return _libro.getEscritorId();
	}

	/**
	* Returns the group ID of this libro.
	*
	* @return the group ID of this libro
	*/
	@Override
	public long getGroupId() {
		return _libro.getGroupId();
	}

	/**
	* Returns the libro ID of this libro.
	*
	* @return the libro ID of this libro
	*/
	@Override
	public long getLibroId() {
		return _libro.getLibroId();
	}

	/**
	* Returns the primary key of this libro.
	*
	* @return the primary key of this libro
	*/
	@Override
	public long getPrimaryKey() {
		return _libro.getPrimaryKey();
	}

	/**
	* Returns the user ID of this libro.
	*
	* @return the user ID of this libro
	*/
	@Override
	public long getUserId() {
		return _libro.getUserId();
	}

	@Override
	public tutoriales.liferay.servicebuilder.libro.model.Libro toEscapedModel() {
		return new LibroWrapper(_libro.toEscapedModel());
	}

	@Override
	public tutoriales.liferay.servicebuilder.libro.model.Libro toUnescapedModel() {
		return new LibroWrapper(_libro.toUnescapedModel());
	}

	@Override
	public void persist() {
		_libro.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_libro.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this libro.
	*
	* @param companyId the company ID of this libro
	*/
	@Override
	public void setCompanyId(long companyId) {
		_libro.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this libro.
	*
	* @param createDate the create date of this libro
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_libro.setCreateDate(createDate);
	}

	/**
	* Sets the escritor ID of this libro.
	*
	* @param escritorId the escritor ID of this libro
	*/
	@Override
	public void setEscritorId(long escritorId) {
		_libro.setEscritorId(escritorId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_libro.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_libro.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_libro.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the genero of this libro.
	*
	* @param genero the genero of this libro
	*/
	@Override
	public void setGenero(java.lang.String genero) {
		_libro.setGenero(genero);
	}

	/**
	* Sets the group ID of this libro.
	*
	* @param groupId the group ID of this libro
	*/
	@Override
	public void setGroupId(long groupId) {
		_libro.setGroupId(groupId);
	}

	/**
	* Sets the libro ID of this libro.
	*
	* @param libroId the libro ID of this libro
	*/
	@Override
	public void setLibroId(long libroId) {
		_libro.setLibroId(libroId);
	}

	/**
	* Sets the modified date of this libro.
	*
	* @param modifiedDate the modified date of this libro
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_libro.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_libro.setNew(n);
	}

	/**
	* Sets the primary key of this libro.
	*
	* @param primaryKey the primary key of this libro
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_libro.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_libro.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the publicacion of this libro.
	*
	* @param publicacion the publicacion of this libro
	*/
	@Override
	public void setPublicacion(Date publicacion) {
		_libro.setPublicacion(publicacion);
	}

	/**
	* Sets the titulo of this libro.
	*
	* @param titulo the titulo of this libro
	*/
	@Override
	public void setTitulo(java.lang.String titulo) {
		_libro.setTitulo(titulo);
	}

	/**
	* Sets the user ID of this libro.
	*
	* @param userId the user ID of this libro
	*/
	@Override
	public void setUserId(long userId) {
		_libro.setUserId(userId);
	}

	/**
	* Sets the user name of this libro.
	*
	* @param userName the user name of this libro
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_libro.setUserName(userName);
	}

	/**
	* Sets the user uuid of this libro.
	*
	* @param userUuid the user uuid of this libro
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_libro.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this libro.
	*
	* @param uuid the uuid of this libro
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_libro.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LibroWrapper)) {
			return false;
		}

		LibroWrapper libroWrapper = (LibroWrapper)obj;

		if (Objects.equals(_libro, libroWrapper._libro)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _libro.getStagedModelType();
	}

	@Override
	public Libro getWrappedModel() {
		return _libro;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _libro.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _libro.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_libro.resetOriginalValues();
	}

	private final Libro _libro;
}