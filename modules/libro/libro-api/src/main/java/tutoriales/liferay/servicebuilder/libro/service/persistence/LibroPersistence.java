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

package tutoriales.liferay.servicebuilder.libro.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tutoriales.liferay.servicebuilder.libro.exception.NoSuchLibroException;
import tutoriales.liferay.servicebuilder.libro.model.Libro;

/**
 * The persistence interface for the libro service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tutoriales.liferay.servicebuilder.libro.service.persistence.impl.LibroPersistenceImpl
 * @see LibroUtil
 * @generated
 */
@ProviderType
public interface LibroPersistence extends BasePersistence<Libro> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LibroUtil} to access the libro persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the libros where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching libros
	*/
	public java.util.List<Libro> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the libros where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @return the range of matching libros
	*/
	public java.util.List<Libro> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the libros where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching libros
	*/
	public java.util.List<Libro> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator);

	/**
	* Returns an ordered range of all the libros where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching libros
	*/
	public java.util.List<Libro> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first libro in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public Libro findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator)
		throws NoSuchLibroException;

	/**
	* Returns the first libro in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public Libro fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator);

	/**
	* Returns the last libro in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public Libro findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator)
		throws NoSuchLibroException;

	/**
	* Returns the last libro in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public Libro fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator);

	/**
	* Returns the libros before and after the current libro in the ordered set where uuid = &#63;.
	*
	* @param libroId the primary key of the current libro
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next libro
	* @throws NoSuchLibroException if a libro with the primary key could not be found
	*/
	public Libro[] findByUuid_PrevAndNext(long libroId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator)
		throws NoSuchLibroException;

	/**
	* Removes all the libros where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of libros where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching libros
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the libro where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchLibroException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public Libro findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchLibroException;

	/**
	* Returns the libro where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public Libro fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the libro where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public Libro fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the libro where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the libro that was removed
	*/
	public Libro removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchLibroException;

	/**
	* Returns the number of libros where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching libros
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the libros where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching libros
	*/
	public java.util.List<Libro> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the libros where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @return the range of matching libros
	*/
	public java.util.List<Libro> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the libros where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching libros
	*/
	public java.util.List<Libro> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator);

	/**
	* Returns an ordered range of all the libros where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching libros
	*/
	public java.util.List<Libro> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first libro in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public Libro findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator)
		throws NoSuchLibroException;

	/**
	* Returns the first libro in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public Libro fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator);

	/**
	* Returns the last libro in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public Libro findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator)
		throws NoSuchLibroException;

	/**
	* Returns the last libro in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public Libro fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator);

	/**
	* Returns the libros before and after the current libro in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param libroId the primary key of the current libro
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next libro
	* @throws NoSuchLibroException if a libro with the primary key could not be found
	*/
	public Libro[] findByUuid_C_PrevAndNext(long libroId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator)
		throws NoSuchLibroException;

	/**
	* Removes all the libros where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of libros where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching libros
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the libros where titulo = &#63;.
	*
	* @param titulo the titulo
	* @return the matching libros
	*/
	public java.util.List<Libro> findByTitulo(java.lang.String titulo);

	/**
	* Returns a range of all the libros where titulo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param titulo the titulo
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @return the range of matching libros
	*/
	public java.util.List<Libro> findByTitulo(java.lang.String titulo,
		int start, int end);

	/**
	* Returns an ordered range of all the libros where titulo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param titulo the titulo
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching libros
	*/
	public java.util.List<Libro> findByTitulo(java.lang.String titulo,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator);

	/**
	* Returns an ordered range of all the libros where titulo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param titulo the titulo
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching libros
	*/
	public java.util.List<Libro> findByTitulo(java.lang.String titulo,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first libro in the ordered set where titulo = &#63;.
	*
	* @param titulo the titulo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public Libro findByTitulo_First(java.lang.String titulo,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator)
		throws NoSuchLibroException;

	/**
	* Returns the first libro in the ordered set where titulo = &#63;.
	*
	* @param titulo the titulo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public Libro fetchByTitulo_First(java.lang.String titulo,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator);

	/**
	* Returns the last libro in the ordered set where titulo = &#63;.
	*
	* @param titulo the titulo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching libro
	* @throws NoSuchLibroException if a matching libro could not be found
	*/
	public Libro findByTitulo_Last(java.lang.String titulo,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator)
		throws NoSuchLibroException;

	/**
	* Returns the last libro in the ordered set where titulo = &#63;.
	*
	* @param titulo the titulo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public Libro fetchByTitulo_Last(java.lang.String titulo,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator);

	/**
	* Returns the libros before and after the current libro in the ordered set where titulo = &#63;.
	*
	* @param libroId the primary key of the current libro
	* @param titulo the titulo
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next libro
	* @throws NoSuchLibroException if a libro with the primary key could not be found
	*/
	public Libro[] findByTitulo_PrevAndNext(long libroId,
		java.lang.String titulo,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator)
		throws NoSuchLibroException;

	/**
	* Removes all the libros where titulo = &#63; from the database.
	*
	* @param titulo the titulo
	*/
	public void removeByTitulo(java.lang.String titulo);

	/**
	* Returns the number of libros where titulo = &#63;.
	*
	* @param titulo the titulo
	* @return the number of matching libros
	*/
	public int countByTitulo(java.lang.String titulo);

	/**
	* Caches the libro in the entity cache if it is enabled.
	*
	* @param libro the libro
	*/
	public void cacheResult(Libro libro);

	/**
	* Caches the libros in the entity cache if it is enabled.
	*
	* @param libros the libros
	*/
	public void cacheResult(java.util.List<Libro> libros);

	/**
	* Creates a new libro with the primary key. Does not add the libro to the database.
	*
	* @param libroId the primary key for the new libro
	* @return the new libro
	*/
	public Libro create(long libroId);

	/**
	* Removes the libro with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param libroId the primary key of the libro
	* @return the libro that was removed
	* @throws NoSuchLibroException if a libro with the primary key could not be found
	*/
	public Libro remove(long libroId) throws NoSuchLibroException;

	public Libro updateImpl(Libro libro);

	/**
	* Returns the libro with the primary key or throws a {@link NoSuchLibroException} if it could not be found.
	*
	* @param libroId the primary key of the libro
	* @return the libro
	* @throws NoSuchLibroException if a libro with the primary key could not be found
	*/
	public Libro findByPrimaryKey(long libroId) throws NoSuchLibroException;

	/**
	* Returns the libro with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param libroId the primary key of the libro
	* @return the libro, or <code>null</code> if a libro with the primary key could not be found
	*/
	public Libro fetchByPrimaryKey(long libroId);

	@Override
	public java.util.Map<java.io.Serializable, Libro> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the libros.
	*
	* @return the libros
	*/
	public java.util.List<Libro> findAll();

	/**
	* Returns a range of all the libros.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @return the range of libros
	*/
	public java.util.List<Libro> findAll(int start, int end);

	/**
	* Returns an ordered range of all the libros.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of libros
	*/
	public java.util.List<Libro> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator);

	/**
	* Returns an ordered range of all the libros.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of libros
	*/
	public java.util.List<Libro> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Libro> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the libros from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of libros.
	*
	* @return the number of libros
	*/
	public int countAll();

	/**
	* Returns the primaryKeys of escritors associated with the libro.
	*
	* @param pk the primary key of the libro
	* @return long[] of the primaryKeys of escritors associated with the libro
	*/
	public long[] getEscritorPrimaryKeys(long pk);

	/**
	* Returns all the escritors associated with the libro.
	*
	* @param pk the primary key of the libro
	* @return the escritors associated with the libro
	*/
	public java.util.List<tutoriales.liferay.servicebuilder.libro.model.Escritor> getEscritors(
		long pk);

	/**
	* Returns a range of all the escritors associated with the libro.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the libro
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @return the range of escritors associated with the libro
	*/
	public java.util.List<tutoriales.liferay.servicebuilder.libro.model.Escritor> getEscritors(
		long pk, int start, int end);

	/**
	* Returns an ordered range of all the escritors associated with the libro.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the libro
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of escritors associated with the libro
	*/
	public java.util.List<tutoriales.liferay.servicebuilder.libro.model.Escritor> getEscritors(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<tutoriales.liferay.servicebuilder.libro.model.Escritor> orderByComparator);

	/**
	* Returns the number of escritors associated with the libro.
	*
	* @param pk the primary key of the libro
	* @return the number of escritors associated with the libro
	*/
	public int getEscritorsSize(long pk);

	/**
	* Returns <code>true</code> if the escritor is associated with the libro.
	*
	* @param pk the primary key of the libro
	* @param escritorPK the primary key of the escritor
	* @return <code>true</code> if the escritor is associated with the libro; <code>false</code> otherwise
	*/
	public boolean containsEscritor(long pk, long escritorPK);

	/**
	* Returns <code>true</code> if the libro has any escritors associated with it.
	*
	* @param pk the primary key of the libro to check for associations with escritors
	* @return <code>true</code> if the libro has any escritors associated with it; <code>false</code> otherwise
	*/
	public boolean containsEscritors(long pk);

	/**
	* Adds an association between the libro and the escritor. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the libro
	* @param escritorPK the primary key of the escritor
	*/
	public void addEscritor(long pk, long escritorPK);

	/**
	* Adds an association between the libro and the escritor. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the libro
	* @param escritor the escritor
	*/
	public void addEscritor(long pk,
		tutoriales.liferay.servicebuilder.libro.model.Escritor escritor);

	/**
	* Adds an association between the libro and the escritors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the libro
	* @param escritorPKs the primary keys of the escritors
	*/
	public void addEscritors(long pk, long[] escritorPKs);

	/**
	* Adds an association between the libro and the escritors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the libro
	* @param escritors the escritors
	*/
	public void addEscritors(long pk,
		java.util.List<tutoriales.liferay.servicebuilder.libro.model.Escritor> escritors);

	/**
	* Clears all associations between the libro and its escritors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the libro to clear the associated escritors from
	*/
	public void clearEscritors(long pk);

	/**
	* Removes the association between the libro and the escritor. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the libro
	* @param escritorPK the primary key of the escritor
	*/
	public void removeEscritor(long pk, long escritorPK);

	/**
	* Removes the association between the libro and the escritor. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the libro
	* @param escritor the escritor
	*/
	public void removeEscritor(long pk,
		tutoriales.liferay.servicebuilder.libro.model.Escritor escritor);

	/**
	* Removes the association between the libro and the escritors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the libro
	* @param escritorPKs the primary keys of the escritors
	*/
	public void removeEscritors(long pk, long[] escritorPKs);

	/**
	* Removes the association between the libro and the escritors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the libro
	* @param escritors the escritors
	*/
	public void removeEscritors(long pk,
		java.util.List<tutoriales.liferay.servicebuilder.libro.model.Escritor> escritors);

	/**
	* Sets the escritors associated with the libro, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the libro
	* @param escritorPKs the primary keys of the escritors to be associated with the libro
	*/
	public void setEscritors(long pk, long[] escritorPKs);

	/**
	* Sets the escritors associated with the libro, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the libro
	* @param escritors the escritors to be associated with the libro
	*/
	public void setEscritors(long pk,
		java.util.List<tutoriales.liferay.servicebuilder.libro.model.Escritor> escritors);

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}