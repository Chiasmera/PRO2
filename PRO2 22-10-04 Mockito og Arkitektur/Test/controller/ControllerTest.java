package controller;

import ordination.Laegemiddel;
import ordination.Ordination;
import ordination.Patient;
import org.junit.jupiter.api.Test;
import storage.Storage;
import java.util.ArrayList;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {


    @Test
    void antalOrdinationerPrVægtPrLægemiddel() {
        //Arrange
        Laegemiddel lmMock = mock(Laegemiddel.class);
        Storage storageMock = mock(Storage.class);
        Controller controller = Controller.getController(storageMock);
        Patient patientMock  = mock(Patient.class);
        Ordination ordinationMock = mock(Ordination.class);
        ArrayList<Ordination> ordinationMockList = new ArrayList<>();
        ordinationMockList.add(ordinationMock);
        ArrayList<Patient> patientListMock = new ArrayList<>();
        patientListMock.add(patientMock);
        when(storageMock.getAllPatienter()).thenReturn(patientListMock);
        when(patientMock.getOrdinationer()).thenReturn(ordinationMockList);
        when(ordinationMock.getLaegemiddel()).thenReturn(lmMock);
        when(patientMock.getVaegt()).thenReturn(70.0);

        int vægtStart = 60;
        int vægtSlut = 80;
        int expectedResult = 1;

        //Act
        int result = controller.antalOrdinationerPrVægtPrLægemiddel(vægtStart, vægtSlut, lmMock);

        //Assert
        assertEquals(expectedResult, result);
    }
}