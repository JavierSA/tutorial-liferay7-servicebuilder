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

package tutoriales.liferay.servicebuilder.libro.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tutoriales.liferay.servicebuilder.libro.model.Libro;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Libro in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Libro
 * @generated
 */
@ProviderType
public class LibroCacheModel implements CacheModel<Libro>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LibroCacheModel)) {
			return false;
		}

		LibroCacheModel libroCacheModel = (LibroCacheModel)obj;

		if (libroId == libroCacheModel.libroId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, libroId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", libroId=");
		sb.append(libroId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", titulo=");
		sb.append(titulo);
		sb.append(", escritor=");
		sb.append(escritor);
		sb.append(", publicacion=");
		sb.append(publicacion);
		sb.append(", genero=");
		sb.append(genero);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Libro toEntityModel() {
		LibroImpl libroImpl = new LibroImpl();

		if (uuid == null) {
			libroImpl.setUuid(StringPool.BLANK);
		}
		else {
			libroImpl.setUuid(uuid);
		}

		libroImpl.setLibroId(libroId);
		libroImpl.setGroupId(groupId);
		libroImpl.setCompanyId(companyId);
		libroImpl.setUserId(userId);

		if (userName == null) {
			libroImpl.setUserName(StringPool.BLANK);
		}
		else {
			libroImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			libroImpl.setCreateDate(null);
		}
		else {
			libroImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			libroImpl.setModifiedDate(null);
		}
		else {
			libroImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (titulo == null) {
			libroImpl.setTitulo(StringPool.BLANK);
		}
		else {
			libroImpl.setTitulo(titulo);
		}

		if (escritor == null) {
			libroImpl.setEscritor(StringPool.BLANK);
		}
		else {
			libroImpl.setEscritor(escritor);
		}

		if (publicacion == Long.MIN_VALUE) {
			libroImpl.setPublicacion(null);
		}
		else {
			libroImpl.setPublicacion(new Date(publicacion));
		}

		if (genero == null) {
			libroImpl.setGenero(StringPool.BLANK);
		}
		else {
			libroImpl.setGenero(genero);
		}

		libroImpl.resetOriginalValues();

		return libroImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		libroId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		titulo = objectInput.readUTF();
		escritor = objectInput.readUTF();
		publicacion = objectInput.readLong();
		genero = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(libroId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (titulo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(titulo);
		}

		if (escritor == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(escritor);
		}

		objectOutput.writeLong(publicacion);

		if (genero == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(genero);
		}
	}

	public String uuid;
	public long libroId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String titulo;
	public String escritor;
	public long publicacion;
	public String genero;
}