package tutoriales.liferay.servicebuilder.libro.upgrade.v1_0_1;

import com.liferay.portal.kernel.upgrade.UpgradeProcess;

public class UpgradeLibro extends UpgradeProcess {

    @Override
    protected void doUpgrade() throws Exception {
        runSQL("ALTER TABLE LIBRO_Libro ADD COLUMN genero VARCHAR(60) NULL");
    }

}
