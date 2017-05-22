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

package tutoriales.liferay.servicebuilder.libro.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Libro. This utility wraps
 * {@link tutoriales.liferay.servicebuilder.libro.service.impl.LibroLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LibroLocalService
 * @see tutoriales.liferay.servicebuilder.libro.service.base.LibroLocalServiceBaseImpl
 * @see tutoriales.liferay.servicebuilder.libro.service.impl.LibroLocalServiceImpl
 * @generated
 */
@ProviderType
public class LibroLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tutoriales.liferay.servicebuilder.libro.service.impl.LibroLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of libros.
	*
	* @return the number of libros
	*/
	public static int getLibrosCount() {
		return getService().getLibrosCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tutoriales.liferay.servicebuilder.libro.model.impl.LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tutoriales.liferay.servicebuilder.libro.model.impl.LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the libros.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tutoriales.liferay.servicebuilder.libro.model.impl.LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @return the range of libros
	*/
	public static java.util.List<tutoriales.liferay.servicebuilder.libro.model.Libro> getLibros(
		int start, int end) {
		return getService().getLibros(start, end);
	}

	/**
	* Returns all the libros matching the UUID and company.
	*
	* @param uuid the UUID of the libros
	* @param companyId the primary key of the company
	* @return the matching libros, or an empty list if no matches were found
	*/
	public static java.util.List<tutoriales.liferay.servicebuilder.libro.model.Libro> getLibrosByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getLibrosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of libros matching the UUID and company.
	*
	* @param uuid the UUID of the libros
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of libros
	* @param end the upper bound of the range of libros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching libros, or an empty list if no matches were found
	*/
	public static java.util.List<tutoriales.liferay.servicebuilder.libro.model.Libro> getLibrosByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<tutoriales.liferay.servicebuilder.libro.model.Libro> orderByComparator) {
		return getService()
				   .getLibrosByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the libro to the database. Also notifies the appropriate model listeners.
	*
	* @param libro the libro
	* @return the libro that was added
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Libro addLibro(
		tutoriales.liferay.servicebuilder.libro.model.Libro libro) {
		return getService().addLibro(libro);
	}

	/**
	* Creates a new libro with the primary key. Does not add the libro to the database.
	*
	* @param libroId the primary key for the new libro
	* @return the new libro
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Libro createLibro(
		long libroId) {
		return getService().createLibro(libroId);
	}

	/**
	* Deletes the libro with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param libroId the primary key of the libro
	* @return the libro that was removed
	* @throws PortalException if a libro with the primary key could not be found
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Libro deleteLibro(
		long libroId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteLibro(libroId);
	}

	/**
	* Deletes the libro from the database. Also notifies the appropriate model listeners.
	*
	* @param libro the libro
	* @return the libro that was removed
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Libro deleteLibro(
		tutoriales.liferay.servicebuilder.libro.model.Libro libro) {
		return getService().deleteLibro(libro);
	}

	public static tutoriales.liferay.servicebuilder.libro.model.Libro fetchLibro(
		long libroId) {
		return getService().fetchLibro(libroId);
	}

	/**
	* Returns the libro matching the UUID and group.
	*
	* @param uuid the libro's UUID
	* @param groupId the primary key of the group
	* @return the matching libro, or <code>null</code> if a matching libro could not be found
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Libro fetchLibroByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchLibroByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the libro with the primary key.
	*
	* @param libroId the primary key of the libro
	* @return the libro
	* @throws PortalException if a libro with the primary key could not be found
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Libro getLibro(
		long libroId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getLibro(libroId);
	}

	/**
	* Returns the libro matching the UUID and group.
	*
	* @param uuid the libro's UUID
	* @param groupId the primary key of the group
	* @return the matching libro
	* @throws PortalException if a matching libro could not be found
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Libro getLibroByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getLibroByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the libro in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param libro the libro
	* @return the libro that was updated
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Libro updateLibro(
		tutoriales.liferay.servicebuilder.libro.model.Libro libro) {
		return getService().updateLibro(libro);
	}

	public static LibroLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LibroLocalService, LibroLocalService> _serviceTracker =
		ServiceTrackerFactory.open(LibroLocalService.class);
}