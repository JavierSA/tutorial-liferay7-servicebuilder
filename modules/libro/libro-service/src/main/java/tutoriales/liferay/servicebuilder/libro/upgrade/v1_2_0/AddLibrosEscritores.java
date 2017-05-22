package tutoriales.liferay.servicebuilder.libro.upgrade.v1_2_0;

import com.liferay.portal.kernel.upgrade.UpgradeProcess;

public class AddLibrosEscritores extends UpgradeProcess {

    @Override
    protected void doUpgrade() throws Exception {
        runSQL("CREATE TABLE LIBRO_Libros_Escritores (" +
                "companyId LONG NOT NULL," +
                "escritorId LONG NOT NULL," +
                "libroId LONG NOT NULL," +
                "PRIMARY KEY (escritorId, libroId)" +
                ");");
    }

}
