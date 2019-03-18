package com.pagisoft.datafetcher.soap.client;

import com.pagisoft.datafetcher.connectors.impl.AllegroConnector;
import com.pagisoft.datafetcher.soap.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class AllegroWebApiClient {

    private static final Logger LOGGER = LogManager.getLogger(AllegroWebApiClient.class);

    //private static final String accessToken = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NTE3NTM4MTcsInVzZXJfbmFtZSI6IjM3OTA4ODU3IiwianRpIjoiNWE1Yjk5MzktYWQzZi00MmNmLTllZDctMGEzNmNmZGE1MDQ2IiwiY2xpZW50X2lkIjoiZDQ3Mzk1YjgyOWZlNDkwNWE2MzhmYTBmY2NmNDk5OTYiLCJzY29wZSI6WyJhbGxlZ3JvX2FwaSJdfQ.FR-SlhzlQtR0cwT3fNwJtTkEWUxU2INKF82nCpvPwwgxCYdUat8Z2jHjUFMGer4l3MnKoyvT7Coo7Cyu-FdTf4osC7IovsMc7KtYuAA39NvF2FYGZwwiaX5p5DX_Dq55Ayp7k08De6n2P7Bc-EtfwSy-gqWImIs6KhuZJMtDwlrgVnH8rPZWsKsMnvHIazwFir4M8vYLaNdWnomDw2UxPfldVA3RWAJhOTN6BKVBdP7BaJtsr6Nl63tL6RCDeSc-ZuutEFhUd3npk-b4CQBKTy2VlfEZsoMag82JQ7cxLUPhTh_OlO_2iH9_h56M6QylYhTstDS1nIB4AVYMk_3LcA";

    //private static final String accessToken = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NTE4MjA5NDAsInVzZXJfbmFtZSI6IjU3MDAyMDY1IiwianRpIjoiZjM0ZWZlYTYtMDJhNy00NmRjLThlOWMtZWFhOWM3NmRkNzFiIiwiY2xpZW50X2lkIjoiNjA1YWVjYTVhNDNkNDg1ZmIzNGIzOTJjNTQ0ZjBhMzIiLCJzY29wZSI6WyJhbGxlZ3JvX2FwaSJdfQ.N8HEQFpFF8B8BUW8RnK6yhs7YroU4film2D6qw4riM0UElqi5QBsJ2mWAz9Ov-28tgX9JVghvWPJ8RidKSEmDN_yw1zaNIxW9B1qruFSOh83ZMNrjHyG6l0w61ZKTrv36117kUxlWt0TCMiqLGL5ypkrrHaM-v8Zv3CMoIw_UKzu10MlScok55I5hQe6k6KKFrZglixRdjPWMaarec5VRUIkgiQpgqkjQFH5J2b5hrUXw-QV48lrPlz2V3QBk81vewAOD3gFwYXD4Pq-T3UDMXEhJ_vsPZqYKCJsJ94t7kiIvNgSDEZ91SZ0K-4D9XHph_ubYVWDFV15iF2fPK60hA";

    private static final String accessToken = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJhbGxlZ3JvX2FwaSJdLCJleHAiOjE1NTE4MjI4MDAsImp0aSI6Ijc4ZTBiZDg0LTA0YTEtNDY5Ni1iMzhiLWM1M2FlNzNjNjgyZCIsImNsaWVudF9pZCI6IjYwNWFlY2E1YTQzZDQ4NWZiMzRiMzkyYzU0NGYwYTMyIn0.riF1hGTZn3u7BrOgNYvf9tJUTjNikQ70ScSJs9dpudZWW1EnocQ8TwICXFhu_xQMRVQ4ZPwt7uVskfxlTma_TuPnakgtAsOCPTi5M1qYUKKEJjJML1ciH2O80kWA0i4cHwm4is1rz8wTrfdD5EHkNoMZbI2G8P6sjFHtt0NmSpbIXT7ZdcBOGixnTWy3HHlRwA_vjSDTCIe-K3LWEZRcoSh_6zZp7vNhACWsmIF2-JxXYu-ktYCHbxrCy_2lLk1DrscnGqb3AKWIbM7DZdzc70F_Asf-8X_AMSAyGCrmHjz8WZAxneTiyOWpZM9FSKnKcZluAUMe260pg8Y-cRioOw";

    //private static final String key1 = "d47395b829fe4905a638fa0fccf49996";
    //private static final String key2 = "vxFDeiy84IV7IIaDdenwBfMP5zxMYOGFliRhLaqeSBgWfSEM21o5Il64dP4TygUd";

    //private static final String key1 = "d47395b829fe4905a638fa0fccf49996";

    private static final String key1 = "605aeca5a43d485fb34b392c544f0a32";


    public void allegroWebApiLogin() {

        ServiceService allegroWebApiService = new ServiceServiceLocator();
        try {
            ServicePort_PortType allegro = allegroWebApiService.getservicePort();
            //String token = new AllegroConnector().getToken();

            DoQueryAllSysStatusResponse resp = allegro.doQueryAllSysStatus(new DoQueryAllSysStatusRequest(1, key1));
            Long sss = resp.getSysCountryStatus()[0].getVerKey();
            //3f831803aea7819f75efbbb8766d92018ce44728155a17//01_1
            DoLoginWithAccessTokenRequest request = new DoLoginWithAccessTokenRequest(accessToken, 1, key1);
            DoLoginWithAccessTokenResponse response = allegro.doLoginWithAccessToken(request);
            String sessionHandle = response.getSessionHandlePart();
//7799708120
            DoGetBidItem2Response re = allegro.doGetBidItem2(new DoGetBidItem2Request(sessionHandle, 7799708120L));

            //717
            String[] categories = {"5","11763"};
            FilterOptionsType[] filterOptions = {new FilterOptionsType("category", categories, null)};
            DoGetItemsListResponse r = allegro.doGetItemsList(new DoGetItemsListRequest(key1, 1, filterOptions,null, null, null, null));

            //for(int i = 0; i < r.getItemsCount(); i++) {
                //long l = r.getItemsList()[i].getItemId();
                //DoGetBidItem2Response ree = allegro.doGetBidItem2(new DoGetBidItem2Request(sessionHandle, l));
                //LOGGER.info(i);

            //}

            LOGGER.info("here: {}", r.getItemsCount());
        } catch (ServiceException e) {
            LOGGER.error(e.getMessage());
        } catch (RemoteException e) {
            LOGGER.error(e.getMessage());
        }

    }

}
