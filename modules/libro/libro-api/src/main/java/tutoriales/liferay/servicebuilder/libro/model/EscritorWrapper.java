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
 * This class is a wrapper for {@link Escritor}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Escritor
 * @generated
 */
@ProviderType
public class EscritorWrapper implements Escritor, ModelWrapper<Escritor> {
	public EscritorWrapper(Escritor escritor) {
		_escritor = escritor;
	}

	@Override
	public Class<?> getModelClass() {
		return Escritor.class;
	}

	@Override
	public String getModelClassName() {
		return Escritor.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("escritorId", getEscritorId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nombre", getNombre());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long escritorId = (Long)attributes.get("escritorId");

		if (escritorId != null) {
			setEscritorId(escritorId);
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

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _escritor.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _escritor.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _escritor.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _escritor.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tutoriales.liferay.servicebuilder.libro.model.Escritor> toCacheModel() {
		return _escritor.toCacheModel();
	}

	@Override
	public int compareTo(
		tutoriales.liferay.servicebuilder.libro.model.Escritor escritor) {
		return _escritor.compareTo(escritor);
	}

	@Override
	public int hashCode() {
		return _escritor.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _escritor.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new EscritorWrapper((Escritor)_escritor.clone());
	}

	/**
	* Returns the nombre of this escritor.
	*
	* @return the nombre of this escritor
	*/
	@Override
	public java.lang.String getNombre() {
		return _escritor.getNombre();
	}

	/**
	* Returns the user name of this escritor.
	*
	* @return the user name of this escritor
	*/
	@Override
	public java.lang.String getUserName() {
		return _escritor.getUserName();
	}

	/**
	* Returns the user uuid of this escritor.
	*
	* @return the user uuid of this escritor
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _escritor.getUserUuid();
	}

	/**
	* Returns the uuid of this escritor.
	*
	* @return the uuid of this escritor
	*/
	@Override
	public java.lang.String getUuid() {
		return _escritor.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _escritor.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _escritor.toXmlString();
	}

	/**
	* Returns the create date of this escritor.
	*
	* @return the create date of this escritor
	*/
	@Override
	public Date getCreateDate() {
		return _escritor.getCreateDate();
	}

	/**
	* Returns the modified date of this escritor.
	*
	* @return the modified date of this escritor
	*/
	@Override
	public Date getModifiedDate() {
		return _escritor.getModifiedDate();
	}

	/**
	* Returns the company ID of this escritor.
	*
	* @return the company ID of this escritor
	*/
	@Override
	public long getCompanyId() {
		return _escritor.getCompanyId();
	}

	/**
	* Returns the escritor ID of this escritor.
	*
	* @return the escritor ID of this escritor
	*/
	@Override
	public long getEscritorId() {
		return _escritor.getEscritorId();
	}

	/**
	* Returns the group ID of this escritor.
	*
	* @return the group ID of this escritor
	*/
	@Override
	public long getGroupId() {
		return _escritor.getGroupId();
	}

	/**
	* Returns the primary key of this escritor.
	*
	* @return the primary key of this escritor
	*/
	@Override
	public long getPrimaryKey() {
		return _escritor.getPrimaryKey();
	}

	/**
	* Returns the user ID of this escritor.
	*
	* @return the user ID of this escritor
	*/
	@Override
	public long getUserId() {
		return _escritor.getUserId();
	}

	@Override
	public tutoriales.liferay.servicebuilder.libro.model.Escritor toEscapedModel() {
		return new EscritorWrapper(_escritor.toEscapedModel());
	}

	@Override
	public tutoriales.liferay.servicebuilder.libro.model.Escritor toUnescapedModel() {
		return new EscritorWrapper(_escritor.toUnescapedModel());
	}

	@Override
	public void persist() {
		_escritor.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_escritor.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this escritor.
	*
	* @param companyId the company ID of this escritor
	*/
	@Override
	public void setCompanyId(long companyId) {
		_escritor.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this escritor.
	*
	* @param createDate the create date of this escritor
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_escritor.setCreateDate(createDate);
	}

	/**
	* Sets the escritor ID of this escritor.
	*
	* @param escritorId the escritor ID of this escritor
	*/
	@Override
	public void setEscritorId(long escritorId) {
		_escritor.setEscritorId(escritorId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_escritor.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_escritor.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_escritor.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this escritor.
	*
	* @param groupId the group ID of this escritor
	*/
	@Override
	public void setGroupId(long groupId) {
		_escritor.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this escritor.
	*
	* @param modifiedDate the modified date of this escritor
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_escritor.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_escritor.setNew(n);
	}

	/**
	* Sets the nombre of this escritor.
	*
	* @param nombre the nombre of this escritor
	*/
	@Override
	public void setNombre(java.lang.String nombre) {
		_escritor.setNombre(nombre);
	}

	/**
	* Sets the primary key of this escritor.
	*
	* @param primaryKey the primary key of this escritor
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_escritor.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_escritor.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this escritor.
	*
	* @param userId the user ID of this escritor
	*/
	@Override
	public void setUserId(long userId) {
		_escritor.setUserId(userId);
	}

	/**
	* Sets the user name of this escritor.
	*
	* @param userName the user name of this escritor
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_escritor.setUserName(userName);
	}

	/**
	* Sets the user uuid of this escritor.
	*
	* @param userUuid the user uuid of this escritor
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_escritor.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this escritor.
	*
	* @param uuid the uuid of this escritor
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_escritor.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EscritorWrapper)) {
			return false;
		}

		EscritorWrapper escritorWrapper = (EscritorWrapper)obj;

		if (Objects.equals(_escritor, escritorWrapper._escritor)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _escritor.getStagedModelType();
	}

	@Override
	public Escritor getWrappedModel() {
		return _escritor;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _escritor.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _escritor.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_escritor.resetOriginalValues();
	}

	private final Escritor _escritor;
}