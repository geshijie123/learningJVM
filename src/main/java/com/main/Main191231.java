package com.main;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.HexUtil;
import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.XmlUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.google.gson.internal.$Gson$Preconditions;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.List;

public class Main191231 {
    public static void main(String[] args) {
//        System.out.println(0x08 +"-"+0x1c);
//
//        System.out.println("0x"+Integer.toHexString(28));
//
//        System.out.println(Integer.parseInt(Integer.toHexString(28),16));


//        private static $_strUserId = '88888888-3333-3333-8888-888888888888';
//        private static $_strMd5Key = '4309a0b130c9b6e103e08353e5d1095d';
//        $hashCode = md5(self::$_strMd5Key . self::$_strUserId . $orderId . $posOrderDate . $functionId);

        System.out.println(SecureUtil.md5("4309a0b130c9b6e103e08353e5d1095d" + "88888888-3333-3333-8888-888888888888" + "aaabbbccc002" + "2020-01-02" + "GetPosOrders"));


        JSONObject jsonObject = JSONUtil.parseFromXml("<?xml version=\"1.0\" encoding=\"utf-8\" ?><string xmlns=\"http://tempuri.org/\"><LKG_CARDAPI_RETURN_HEADER><OrderID>aaabbbccc001</OrderID><HashCode>8c8ca19b4a69192a987a64119bec6a34</HashCode></LKG_CARDAPI_RETURN_HEADER><Datas><PosOrders><CardTNumber>95360079212</CardTNumber><CinemaName>石家庄金棕榈世纪影城</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T09:36:37+08:00</PosOrderTime><PosID>50280083</PosID><SerialNumber>035427</SerialNumber><PosOrderID>ba5fafc5-d20e-4926-9bea-607afc134e16</PosOrderID><CID>845e40ea-b2f9-42b5-8d54-2a6906e950d2</CID></PosOrders><PosOrders><CardTNumber>95340283769</CardTNumber><CinemaName>天津幸福蓝海影城</CinemaName><PosOrderPurchaseKind>3D</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T10:00:46+08:00</PosOrderTime><PosID>01211802298</PosID><SerialNumber>001549</SerialNumber><PosOrderID>59515c9a-6a59-4859-8488-e74df7316a1b</PosOrderID><CID>4da6b36e-6bbd-47f4-b2b7-9b88e3166fce</CID></PosOrders><PosOrders><CardTNumber>95360164933</CardTNumber><CinemaName>石家庄中都影城（西王悦享天地店）</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>30</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T10:07:31+08:00</PosOrderTime><PosID>50609561</PosID><SerialNumber>004067</SerialNumber><PosOrderID>0a784764-6863-4fe4-a57d-b52a0ee8838e</PosOrderID><CID>13de05fb-1118-4af7-8ae4-031a2329d356</CID></PosOrders><PosOrders><CardTNumber>95360105652</CardTNumber><CinemaName>石家庄UME影城</CinemaName><PosOrderPurchaseKind>白场VIP</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>25</PosOrderCount><CinemaPrice>25</CinemaPrice><PosOrderTime>2020-01-02T10:13:56+08:00</PosOrderTime><PosID>50283165</PosID><SerialNumber>013935</SerialNumber><PosOrderID>346e2b97-e6ee-4d03-904a-23bcf7f09e01</PosOrderID><CID>aec84b0f-09b6-42cc-8798-3f933c4b8201</CID></PosOrders><PosOrders><CardTNumber>95340258474</CardTNumber><CinemaName>天津幸福蓝海影城</CinemaName><PosOrderPurchaseKind>3D</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>30</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T10:24:27+08:00</PosOrderTime><PosID>01211802298</PosID><SerialNumber>001551</SerialNumber><PosOrderID>860c0c93-2c94-4a64-8017-875db68752ae</PosOrderID><CID>4da6b36e-6bbd-47f4-b2b7-9b88e3166fce</CID></PosOrders><PosOrders><CardTNumber>95340286849</CardTNumber><CinemaName>天津星典汇影城</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>70</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T10:30:02+08:00</PosOrderTime><PosID>01211802079</PosID><SerialNumber>004313</SerialNumber><PosOrderID>5bc005b5-7d7a-409f-8a8c-dad3a4929c08</PosOrderID><CID>be88c83d-1723-4a35-81c6-18b092ebf125</CID></PosOrders><PosOrders><CardTNumber>95031044206</CardTNumber><CinemaName>北京万达国际影城天通苑店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>80</PosOrderCount><CinemaPrice>40</CinemaPrice><PosOrderTime>2020-01-02T10:55:17+08:00</PosOrderTime><PosID>11799788</PosID><SerialNumber>018801</SerialNumber><PosOrderID>722ba5ff-8f98-45cf-83c4-958915919a2e</PosOrderID><CID>e8e3e131-e859-4f0c-834b-57c4023c1bba</CID></PosOrders><PosOrders><CardTNumber>95340288293</CardTNumber><CinemaName>金逸国际影城天津大悦城IMAX店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>70</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T11:04:07+08:00</PosOrderTime><PosID>01231800490</PosID><SerialNumber>003760</SerialNumber><PosOrderID>dc050ba0-bc7a-46fb-93d4-dc5f18826d8c</PosOrderID><CID>7a78684b-a1f9-49c6-a154-57d1f3cba38b</CID></PosOrders><PosOrders><CardTNumber>95340380771</CardTNumber><CinemaName>CGV星聚汇影城天津梅江店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T11:14:04+08:00</PosOrderTime><PosID>01211800948</PosID><SerialNumber>009445</SerialNumber><PosOrderID>b84011c1-a01e-469a-98f3-0cfba6cfb829</PosOrderID><CID>ba0a411d-f5ec-4ead-8bef-88facfaf82cf</CID></PosOrders><PosOrders><CardTNumber>95340389674</CardTNumber><CinemaName>塘沽大剧院</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T11:14:32+08:00</PosOrderTime><PosID>27213359</PosID><SerialNumber>049499</SerialNumber><PosOrderID>d77ac9da-3ca6-4f4f-bc5a-21d8702e8365</PosOrderID><CID>be3188eb-2907-4424-8844-ee21084257cd</CID></PosOrders><PosOrders><CardTNumber>95345018036</CardTNumber><CinemaName>济南万达国际影城高新区店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>70</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T11:19:22+08:00</PosOrderTime><PosID>01211801266</PosID><SerialNumber>006828</SerialNumber><PosOrderID>315958ee-597c-4b45-a8ea-e5bd599d452a</PosOrderID><CID>942552a8-a6da-4b57-9f3b-560bcc8eaf01</CID></PosOrders><PosOrders><CardTNumber>95340359038</CardTNumber><CinemaName>CGV星聚汇影城天津黄河道店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T11:20:26+08:00</PosOrderTime><PosID>01211800940</PosID><SerialNumber>004243</SerialNumber><PosOrderID>3f825022-fdd5-47ea-8764-ee4bc22b2b59</PosOrderID><CID>287707d1-d02a-447a-966c-a3088cf7c077</CID></PosOrders><PosOrders><CardTNumber>95340256115</CardTNumber><CinemaName>天津橙天嘉禾银河影城</CinemaName><PosOrderPurchaseKind>限价</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T11:27:03+08:00</PosOrderTime><PosID>27211198</PosID><SerialNumber>129919</SerialNumber><PosOrderID>ad83f681-5904-4af8-bfeb-b3dd9934a102</PosOrderID><CID>3d350b10-a325-4c3e-b3ba-dbc0f923e833</CID></PosOrders><PosOrders><CardTNumber>95031040339</CardTNumber><CinemaName>北京嘉华国际影城学清路店</CinemaName><PosOrderPurchaseKind>3D</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>60</CinemaPrice><PosOrderTime>2020-01-02T11:34:34+08:00</PosOrderTime><PosID>16081511</PosID><SerialNumber>096110</SerialNumber><PosOrderID>87cc0970-a3e4-447b-b2bc-6d13237476e4</PosOrderID><CID>6823b170-aa36-46fc-981f-3dab718d3503</CID></PosOrders><PosOrders><CardTNumber>95031038036</CardTNumber><CinemaName>北京嘉华国际影城学清路店</CinemaName><PosOrderPurchaseKind>3D</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>60</CinemaPrice><PosOrderTime>2020-01-02T11:41:16+08:00</PosOrderTime><PosID>16081511</PosID><SerialNumber>096112</SerialNumber><PosOrderID>989f39f0-0671-4be8-8358-f00ac7d3fc9f</PosOrderID><CID>6823b170-aa36-46fc-981f-3dab718d3503</CID></PosOrders><PosOrders><CardTNumber>95340358300</CardTNumber><CinemaName>金逸国际影城天津西岸店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>70</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T12:07:43+08:00</PosOrderTime><PosID>27231539</PosID><SerialNumber>031352</SerialNumber><PosOrderID>4eae396e-d6bf-4918-9c52-4356dc8841f3</PosOrderID><CID>c6d65b79-8b3b-47a4-a3bb-bdbfcee89e28</CID></PosOrders><PosOrders><CardTNumber>95340287858</CardTNumber><CinemaName>天津鸿泰国际影城</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>40</PosOrderCount><CinemaPrice>40</CinemaPrice><PosOrderTime>2020-01-02T12:12:40+08:00</PosOrderTime><PosID>01211800305</PosID><SerialNumber>003174</SerialNumber><PosOrderID>a83ec25f-ff15-4846-8c92-5a1aeb091c9e</PosOrderID><CID>051247c7-f479-4768-bb47-151315502811</CID></PosOrders><PosOrders><CardTNumber>95031039473</CardTNumber><CinemaName>北京耀莱成龙国际影城（慈云寺店）</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>40</PosOrderCount><CinemaPrice>40</CinemaPrice><PosOrderTime>2020-01-02T12:21:33+08:00</PosOrderTime><PosID>16491858</PosID><SerialNumber>025228</SerialNumber><PosOrderID>5094ffba-41f7-4e0a-812f-e2f99db37f13</PosOrderID><CID>dabf567c-01c8-4782-b989-50b69c13806f</CID></PosOrders><PosOrders><CardTNumber>95031039473</CardTNumber><CinemaName>北京耀莱成龙国际影城（慈云寺店）</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>40</PosOrderCount><CinemaPrice>40</CinemaPrice><PosOrderTime>2020-01-02T12:22:39+08:00</PosOrderTime><PosID>16491858</PosID><SerialNumber>025229</SerialNumber><PosOrderID>fb302a24-d098-40dd-8679-7044740c5e8f</PosOrderID><CID>dabf567c-01c8-4782-b989-50b69c13806f</CID></PosOrders><PosOrders><CardTNumber>95360185793</CardTNumber><CinemaName>石家庄博纳国际影城</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T12:24:35+08:00</PosOrderTime><PosID>50283617</PosID><SerialNumber>031839</SerialNumber><PosOrderID>34c07df0-f2aa-4880-866a-e16c0501d18c</PosOrderID><CID>7fb084fa-d7e7-4cb2-bc14-c327fe7583c8</CID></PosOrders><PosOrders><CardTNumber>95340319020</CardTNumber><CinemaName>天津幸福蓝海影城</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>25</PosOrderCount><CinemaPrice>25</CinemaPrice><PosOrderTime>2020-01-02T12:45:06+08:00</PosOrderTime><PosID>01211802298</PosID><SerialNumber>001554</SerialNumber><PosOrderID>5836fcb5-6e16-41b3-bf80-c1bac42785b5</PosOrderID><CID>4da6b36e-6bbd-47f4-b2b7-9b88e3166fce</CID></PosOrders><PosOrders><CardTNumber>95345024950</CardTNumber><CinemaName>鲁信影城济南家乐福店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>30</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T12:52:13+08:00</PosOrderTime><PosID>01231800706</PosID><SerialNumber>001356</SerialNumber><PosOrderID>b3032092-510d-45f7-a7b2-52301eca57e8</PosOrderID><CID>a0f8b0f5-37c5-4ad3-98f9-1d1a93fd7417</CID></PosOrders><PosOrders><CardTNumber>95630022057</CardTNumber><CinemaName>哈尔滨左岸蛋糕店(会展店)</CinemaName><PosOrderPurchaseKind>48</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>48</PosOrderCount><CinemaPrice>48</CinemaPrice><PosOrderTime>2020-01-02T12:57:39+08:00</PosOrderTime><PosID>1077000092</PosID><SerialNumber>000418</SerialNumber><PosOrderID>1d8ba7d5-e2fd-4af4-9b72-652b5f511081</PosOrderID><CID>6ee607ed-0f82-4669-b0f1-556e1a6cfe78</CID></PosOrders><PosOrders><CardTNumber>95340372278</CardTNumber><CinemaName>大地数字影院-天津渔夫码头店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T13:09:14+08:00</PosOrderTime><PosID>01231800179</PosID><SerialNumber>000443</SerialNumber><PosOrderID>59ea1972-c748-4714-8f14-a9dcf68e0445</PosOrderID><CID>5e9ee8bb-2709-4bdd-a182-5ae9ee9adb15</CID></PosOrders><PosOrders><CardTNumber>95630021723</CardTNumber><CinemaName>哈尔滨左岸蛋糕店(宏伟店)</CinemaName><PosOrderPurchaseKind>41</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>41</PosOrderCount><CinemaPrice>41</CinemaPrice><PosOrderTime>2020-01-02T13:17:23+08:00</PosOrderTime><PosID>1077000079</PosID><SerialNumber>000039</SerialNumber><PosOrderID>1468f141-94e8-4609-b50f-161b6bc3e8eb</PosOrderID><CID>f45d0237-bb48-430b-9190-4e24bce90528</CID></PosOrders><PosOrders><CardTNumber>95349013703</CardTNumber><CinemaName>金逸国际影城天津大悦城IMAX店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T13:18:35+08:00</PosOrderTime><PosID>01231800490</PosID><SerialNumber>003767</SerialNumber><PosOrderID>bf00b937-d0ef-4280-819b-135aee1d0d69</PosOrderID><CID>7a78684b-a1f9-49c6-a154-57d1f3cba38b</CID></PosOrders><PosOrders><CardTNumber>95345029451</CardTNumber><CinemaName>莱芜万达影城茂业广场店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T13:30:30+08:00</PosOrderTime><PosID>01211800048</PosID><SerialNumber>000262</SerialNumber><PosOrderID>ea073af3-4505-411b-b5e1-58a1fc570e69</PosOrderID><CID>feb7f442-7201-4cc6-8463-d10538347a30</CID></PosOrders><PosOrders><CardTNumber>95340272932</CardTNumber><CinemaName>天津沃美影院</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>70</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T13:38:24+08:00</PosOrderTime><PosID>01211800894</PosID><SerialNumber>005146</SerialNumber><PosOrderID>61004997-36bc-4c38-a5bb-b07411eaf645</PosOrderID><CID>b4c1e35e-a963-4840-b83d-1ae0f999bc02</CID></PosOrders><PosOrders><CardTNumber>95680006688</CardTNumber><CinemaName>长春完美世界影城新天地店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T13:39:37+08:00</PosOrderTime><PosID>27453709</PosID><SerialNumber>011162</SerialNumber><PosOrderID>52c55c38-afa6-4e46-ae62-aaababb1fba5</PosOrderID><CID>3db35b16-02e4-4936-938f-1a29c56abe8e</CID></PosOrders><PosOrders><CardTNumber>95360180756</CardTNumber><CinemaName>石家庄华夏影城弘基店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>25</PosOrderCount><CinemaPrice>25</CinemaPrice><PosOrderTime>2020-01-02T13:41:14+08:00</PosOrderTime><PosID>50609563</PosID><SerialNumber>002375</SerialNumber><PosOrderID>7f6d2af8-0cd0-49b1-b9e5-f47914d6353c</PosOrderID><CID>3c24a9f7-7121-4215-96ae-818cd5be3bc8</CID></PosOrders><PosOrders><CardTNumber>95345015374</CardTNumber><CinemaName>鲁信影城济南体育中心店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T13:46:04+08:00</PosOrderTime><PosID>95332561</PosID><SerialNumber>003708</SerialNumber><PosOrderID>a9133cdd-c680-4b6b-b3bc-66d8594f5f49</PosOrderID><CID>4e2bc2a2-7d9f-4f98-b4a7-db928c9ba4d3</CID></PosOrders><PosOrders><CardTNumber>95340379164</CardTNumber><CinemaName>天津农垦博纳国际影城</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T13:46:52+08:00</PosOrderTime><PosID>01011700685</PosID><SerialNumber>014034</SerialNumber><PosOrderID>598dcb49-497e-4a81-b183-7b2a6fdfbbd2</PosOrderID><CID>27e11bfc-3f0f-495b-a15e-55230212ff82</CID></PosOrders><PosOrders><CardTNumber>95345030848</CardTNumber><CinemaName>济南金逸影城印象城店</CinemaName><PosOrderPurchaseKind>白场普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>30</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T13:48:57+08:00</PosOrderTime><PosID>01211800593</PosID><SerialNumber>000733</SerialNumber><PosOrderID>b2b99993-4463-4df9-b805-e8bcb14fc1a2</PosOrderID><CID>3c4784b0-b96f-4fdc-a029-a30648f4cd21</CID></PosOrders><PosOrders><CardTNumber>95630021723</CardTNumber><CinemaName>哈尔滨左岸蛋糕店(宏伟店)</CinemaName><PosOrderPurchaseKind>41</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>41</PosOrderCount><CinemaPrice>41</CinemaPrice><PosOrderTime>2020-01-02T13:50:00+08:00</PosOrderTime><PosID>1077000079</PosID><SerialNumber>000040</SerialNumber><PosOrderID>6f8ee3c2-a165-421a-accb-228f34807480</PosOrderID><CID>f45d0237-bb48-430b-9190-4e24bce90528</CID></PosOrders><PosOrders><CardTNumber>95360184471</CardTNumber><CinemaName>石家庄奥斯卡乐汇城影城</CinemaName><PosOrderPurchaseKind>3D</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>30</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T14:16:22+08:00</PosOrderTime><PosID>50286003</PosID><SerialNumber>017104</SerialNumber><PosOrderID>9939b453-16f7-4cdf-acae-94c337e1f0ef</PosOrderID><CID>23d63a10-bf5c-4ae3-a8e1-03b6d709852f</CID></PosOrders><PosOrders><CardTNumber>95360173699</CardTNumber><CinemaName>石家庄万象影城IMAX店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>70</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T14:28:19+08:00</PosOrderTime><PosID>50283168</PosID><SerialNumber>012412</SerialNumber><PosOrderID>f9aa6995-5db5-48bd-a821-2d17292154a6</PosOrderID><CID>c3d85459-75fe-4d8a-826e-855ec75d5d27</CID></PosOrders><PosOrders><CardTNumber>95360187657</CardTNumber><CinemaName>石家庄金熊国际影城益友店</CinemaName><PosOrderPurchaseKind>3D</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T14:29:15+08:00</PosOrderTime><PosID>50289875</PosID><SerialNumber>027581</SerialNumber><PosOrderID>a2ac10dc-038d-4c50-874c-d72ffc53f927</PosOrderID><CID>e628dbd2-eecf-4ad9-aa5b-1ca1c3ea9bf5</CID></PosOrders><PosOrders><CardTNumber>95340314022</CardTNumber><CinemaName>天津金逸国际影城大港店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>70</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T14:39:45+08:00</PosOrderTime><PosID>01231800310</PosID><SerialNumber>001065</SerialNumber><PosOrderID>2aba0186-5be7-44d9-a71a-fc2012aec20b</PosOrderID><CID>2310cd9a-dea5-4c28-bf80-1d15d725a232</CID></PosOrders><PosOrders><CardTNumber>95345026697</CardTNumber><CinemaName>泰安万达国际影城万达广场店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>30</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T14:41:13+08:00</PosOrderTime><PosID>01211800094</PosID><SerialNumber>000153</SerialNumber><PosOrderID>cb815699-95dd-445a-b755-3ecc345451df</PosOrderID><CID>b2336b58-70af-44df-a8d8-c243135a5fc0</CID></PosOrders><PosOrders><CardTNumber>95349006858</CardTNumber><CinemaName>滨州万达影城万达广场店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>30</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T14:52:08+08:00</PosOrderTime><PosID>95118339</PosID><SerialNumber>001598</SerialNumber><PosOrderID>930cbe3a-985d-4e96-b17c-9f456b9dc490</PosOrderID><CID>c9eca506-646e-4125-8513-ecf36e8b0b42</CID></PosOrders><PosOrders><CardTNumber>95630021994</CardTNumber><CinemaName>哈尔滨左岸蛋糕店(会展店)</CinemaName><PosOrderPurchaseKind>35</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T15:01:12+08:00</PosOrderTime><PosID>1077000092</PosID><SerialNumber>000419</SerialNumber><PosOrderID>2947a458-cc31-4661-a613-bdc0e5501df8</PosOrderID><CID>6ee607ed-0f82-4669-b0f1-556e1a6cfe78</CID></PosOrders><PosOrders><CardTNumber>95340391399</CardTNumber><CinemaName>CGV星星国际影城天津滨海店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>40</PosOrderCount><CinemaPrice>40</CinemaPrice><PosOrderTime>2020-01-02T15:03:38+08:00</PosOrderTime><PosID>01231800354</PosID><SerialNumber>001722</SerialNumber><PosOrderID>d30b68b3-8b2f-493c-8c6e-92cf6a000ff1</PosOrderID><CID>70a37963-a38c-4f7a-b0e3-defc791accad</CID></PosOrders><PosOrders><CardTNumber>95340391399</CardTNumber><CinemaName>CGV星星国际影城天津滨海店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>40</PosOrderCount><CinemaPrice>40</CinemaPrice><PosOrderTime>2020-01-02T15:03:50+08:00</PosOrderTime><PosID>01231800354</PosID><SerialNumber>001723</SerialNumber><PosOrderID>5ccc06ed-7273-4e4a-be1a-a70a7eb5f1b8</PosOrderID><CID>70a37963-a38c-4f7a-b0e3-defc791accad</CID></PosOrders><PosOrders><CardTNumber>95340394293</CardTNumber><CinemaName>天津晟嘉亨隆电影</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T15:14:44+08:00</PosOrderTime><PosID>01011700179</PosID><SerialNumber>007394</SerialNumber><PosOrderID>88c744ff-d234-458b-9e59-70fb3a3dd74e</PosOrderID><CID>8006db6d-d01d-466a-b6bf-afc1b3cb3267</CID></PosOrders><PosOrders><CardTNumber>95340389969</CardTNumber><CinemaName>大地数字影院-天津渔夫码头店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T16:05:08+08:00</PosOrderTime><PosID>01231800179</PosID><SerialNumber>000444</SerialNumber><PosOrderID>5a4d9c87-ed47-407b-a8ec-a761a908f8f9</PosOrderID><CID>5e9ee8bb-2709-4bdd-a182-5ae9ee9adb15</CID></PosOrders><PosOrders><CardTNumber>95610011713</CardTNumber><CinemaName>1加X电影生活空间今典花园店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>80</PosOrderCount><CinemaPrice>40</CinemaPrice><PosOrderTime>2020-01-02T16:06:52+08:00</PosOrderTime><PosID>01231800062</PosID><SerialNumber>000020</SerialNumber><PosOrderID>471318c8-b9cd-461e-878c-17e3bbace535</PosOrderID><CID>9a2ba1b3-6fed-4435-a534-58907103d322</CID></PosOrders><PosOrders><CardTNumber>95360171571</CardTNumber><CinemaName>石家庄金棕榈世纪影城</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T16:20:59+08:00</PosOrderTime><PosID>50280083</PosID><SerialNumber>035433</SerialNumber><PosOrderID>6db1fded-1ea9-4260-9362-e760fbc8ebde</PosOrderID><CID>845e40ea-b2f9-42b5-8d54-2a6906e950d2</CID></PosOrders><PosOrders><CardTNumber>95360185284</CardTNumber><CinemaName>石家庄耀莱成龙国际影城（北国商城店）</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T16:30:13+08:00</PosOrderTime><PosID>50289860</PosID><SerialNumber>085752</SerialNumber><PosOrderID>b0b4e645-5ca6-4e27-8204-91defe1fb694</PosOrderID><CID>a44aaa99-369e-4927-a2e8-6363b059935a</CID></PosOrders><PosOrders><CardTNumber>95340358331</CardTNumber><CinemaName>天津百丽宫影城</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>80</PosOrderCount><CinemaPrice>40</CinemaPrice><PosOrderTime>2020-01-02T16:30:38+08:00</PosOrderTime><PosID>01231800701</PosID><SerialNumber>001931</SerialNumber><PosOrderID>6bab7c62-bcdc-40ff-9936-c2f6b880a3e6</PosOrderID><CID>387b5195-92ee-4cee-b952-1c47e5188a8c</CID></PosOrders><PosOrders><CardTNumber>95360178398</CardTNumber><CinemaName>大地数字影院-石家庄东方明珠店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T16:58:13+08:00</PosOrderTime><PosID>50289913</PosID><SerialNumber>003454</SerialNumber><PosOrderID>e9c8ac06-fd40-494c-ba53-58eb5c1a693f</PosOrderID><CID>a0693f79-cf32-4deb-9d6b-e7e89dc4afb1</CID></PosOrders><PosOrders><CardTNumber>95350091955</CardTNumber><CinemaName>呼和浩特中影星美国际影城(凯元广场店)</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>28</PosOrderCount><CinemaPrice>28</CinemaPrice><PosOrderTime>2020-01-02T17:00:43+08:00</PosOrderTime><PosID>50061362</PosID><SerialNumber>043958</SerialNumber><PosOrderID>17a948cb-2de9-44a4-907b-b70b96726625</PosOrderID><CID>fbfabe0d-9725-471f-8d9c-48269b626962</CID></PosOrders><PosOrders><CardTNumber>95610012406</CardTNumber><CinemaName>北京新华国际影城大钟寺店</CinemaName><PosOrderPurchaseKind>限价</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>80</PosOrderCount><CinemaPrice>40</CinemaPrice><PosOrderTime>2020-01-02T17:30:05+08:00</PosOrderTime><PosID>16095692</PosID><SerialNumber>039420</SerialNumber><PosOrderID>3a5070ba-aa6f-4f39-85de-681780d6efaa</PosOrderID><CID>2babb0c6-f1fe-4ffc-8dc9-215c6aaee16c</CID></PosOrders><PosOrders><CardTNumber>95345027029</CardTNumber><CinemaName>济南幸福蓝海影城IMAX店</CinemaName><PosOrderPurchaseKind>限价</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>120</PosOrderCount><CinemaPrice>60</CinemaPrice><PosOrderTime>2020-01-02T17:36:54+08:00</PosOrderTime><PosID>01211800422</PosID><SerialNumber>001687</SerialNumber><PosOrderID>d980623a-03de-4e22-8e05-437b4e31cbb7</PosOrderID><CID>885079d8-2982-4e30-92ca-fe142ad84359</CID></PosOrders><PosOrders><CardTNumber>95031030401</CardTNumber><CinemaName>北京金鸡百花影院</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>40</PosOrderCount><CinemaPrice>40</CinemaPrice><PosOrderTime>2020-01-02T17:38:49+08:00</PosOrderTime><PosID>23595631</PosID><SerialNumber>079934</SerialNumber><PosOrderID>5bcc3309-26e7-4761-b7ec-674639ef4fa1</PosOrderID><CID>2d4c5288-fa0f-40c8-8f0b-fb838ca9aa45</CID></PosOrders><PosOrders><CardTNumber>95340282863</CardTNumber><CinemaName>天津龙云商厦影城</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>25</PosOrderCount><CinemaPrice>25</CinemaPrice><PosOrderTime>2020-01-02T17:47:59+08:00</PosOrderTime><PosID>27216815</PosID><SerialNumber>007593</SerialNumber><PosOrderID>8086a848-dadb-4de1-b9b7-f401e47c0d62</PosOrderID><CID>46fcc7c8-317c-44a5-95af-eb131b14f90f</CID></PosOrders><PosOrders><CardTNumber>95360176435</CardTNumber><CinemaName>保定华隶影城(童梦店)</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T17:55:45+08:00</PosOrderTime><PosID>16079255</PosID><SerialNumber>001485</SerialNumber><PosOrderID>84dc1a25-de6e-4ae2-b718-f298b9df57ad</PosOrderID><CID>a87db14a-99d6-4491-b283-6c038e16b762</CID></PosOrders><PosOrders><CardTNumber>95360182729</CardTNumber><CinemaName>保定金棕榈影城</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>3</PosOrderPurchaseCount><PosOrderCount>75</PosOrderCount><CinemaPrice>25</CinemaPrice><PosOrderTime>2020-01-02T17:56:21+08:00</PosOrderTime><PosID>16078612</PosID><SerialNumber>004898</SerialNumber><PosOrderID>06ee4f68-8ef4-4466-8cc7-5bb89ec99250</PosOrderID><CID>614ae565-645b-4b41-99a7-363d3a30f194</CID></PosOrders><PosOrders><CardTNumber>95630021851</CardTNumber><CinemaName>哈尔滨左岸蛋糕店(安隆店)</CinemaName><PosOrderPurchaseKind>60</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>60</CinemaPrice><PosOrderTime>2020-01-02T18:21:19+08:00</PosOrderTime><PosID>1077000081</PosID><SerialNumber>000273</SerialNumber><PosOrderID>70c9cf39-7804-499f-a003-41c071181240</PosOrderID><CID>5d94bdd8-b656-4076-91e6-081d608164b3</CID></PosOrders><PosOrders><CardTNumber>95340394208</CardTNumber><CinemaName>天津SFC上影影城天河城店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>70</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T18:24:07+08:00</PosOrderTime><PosID>01011700576</PosID><SerialNumber>007140</SerialNumber><PosOrderID>b0f2154c-043e-47a9-9e57-c0fe00bbbfef</PosOrderID><CID>3925fe96-1a4e-473b-9e0d-05318638161d</CID></PosOrders><PosOrders><CardTNumber>95360132468</CardTNumber><CinemaName>石家庄UME影城</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T18:25:16+08:00</PosOrderTime><PosID>50283165</PosID><SerialNumber>013943</SerialNumber><PosOrderID>de661960-3ad7-4ec0-b56e-1c04ea440167</PosOrderID><CID>aec84b0f-09b6-42cc-8798-3f933c4b8201</CID></PosOrders><PosOrders><CardTNumber>95360201110</CardTNumber><CinemaName>石家庄UME影城</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T18:25:33+08:00</PosOrderTime><PosID>50283165</PosID><SerialNumber>013945</SerialNumber><PosOrderID>e9c4c100-1dd6-4024-8aa5-c874fbcd4761</PosOrderID><CID>aec84b0f-09b6-42cc-8798-3f933c4b8201</CID></PosOrders><PosOrders><CardTNumber>95360181309</CardTNumber><CinemaName>石家庄金熊国际影城益庄店</CinemaName><PosOrderPurchaseKind>3D</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T18:53:53+08:00</PosOrderTime><PosID>50289871</PosID><SerialNumber>080036</SerialNumber><PosOrderID>8b195bc0-caf4-4195-84da-be0eac5f0066</PosOrderID><CID>263c4c8a-7af8-482d-b752-af90e4f607a8</CID></PosOrders><PosOrders><CardTNumber>95360181031</CardTNumber><CinemaName>石家庄金棕榈和平影城</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>30</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T18:57:23+08:00</PosOrderTime><PosID>50280535</PosID><SerialNumber>008318</SerialNumber><PosOrderID>75d9b04c-9b57-4a20-bfd7-ec64b61eacac</PosOrderID><CID>9e4d7a29-abeb-4491-ac55-35e0907f645e</CID></PosOrders><PosOrders><CardTNumber>95360165436</CardTNumber><CinemaName>石家庄金棕榈世纪影城</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T19:06:08+08:00</PosOrderTime><PosID>50280083</PosID><SerialNumber>035435</SerialNumber><PosOrderID>6bc68e88-6b94-4363-9612-f70b089011e5</PosOrderID><CID>845e40ea-b2f9-42b5-8d54-2a6906e950d2</CID></PosOrders><PosOrders><CardTNumber>95610011670</CardTNumber><CinemaName>北京耀莱成龙国际影城（临河里店）</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>80</PosOrderCount><CinemaPrice>40</CinemaPrice><PosOrderTime>2020-01-02T19:10:20+08:00</PosOrderTime><PosID>16491009</PosID><SerialNumber>007618</SerialNumber><PosOrderID>7875f7d8-4264-4357-81c8-81bee6cde026</PosOrderID><CID>ce4f2010-8016-4453-b1a4-2b4126f1577b</CID></PosOrders><PosOrders><CardTNumber>95031040372</CardTNumber><CinemaName>北京西宫电影院</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>30</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T19:14:44+08:00</PosOrderTime><PosID>16978531</PosID><SerialNumber>080305</SerialNumber><PosOrderID>2837da41-f1fc-46ef-8ab2-54b69c89c8c3</PosOrderID><CID>9a74138d-be0d-4aee-a410-c64023c0b0cd</CID></PosOrders><PosOrders><CardTNumber>95031040372</CardTNumber><CinemaName>北京西宫电影院</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>30</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T19:15:18+08:00</PosOrderTime><PosID>16978531</PosID><SerialNumber>080306</SerialNumber><PosOrderID>40b4bc76-7293-46f5-962c-84c2aa0bbc72</PosOrderID><CID>9a74138d-be0d-4aee-a410-c64023c0b0cd</CID></PosOrders><PosOrders><CardTNumber>95340287536</CardTNumber><CinemaName>天津大地自由人影城SM滨海城市广场店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>40</PosOrderCount><CinemaPrice>40</CinemaPrice><PosOrderTime>2020-01-02T19:16:15+08:00</PosOrderTime><PosID>01231800416</PosID><SerialNumber>000924</SerialNumber><PosOrderID>d805e109-0f6d-4cca-8b6d-e1297b3ef2f2</PosOrderID><CID>8500f948-237c-4bba-9a54-7e8f8f3b56ec</CID></PosOrders><PosOrders><CardTNumber>95340287536</CardTNumber><CinemaName>天津大地自由人影城SM滨海城市广场店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>40</PosOrderCount><CinemaPrice>40</CinemaPrice><PosOrderTime>2020-01-02T19:16:33+08:00</PosOrderTime><PosID>01231800416</PosID><SerialNumber>000925</SerialNumber><PosOrderID>a67677d4-3941-486d-908c-835001349f94</PosOrderID><CID>8500f948-237c-4bba-9a54-7e8f8f3b56ec</CID></PosOrders><PosOrders><CardTNumber>95340392030</CardTNumber><CinemaName>天津UME国际影城</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>80</PosOrderCount><CinemaPrice>40</CinemaPrice><PosOrderTime>2020-01-02T19:19:00+08:00</PosOrderTime><PosID>27276901</PosID><SerialNumber>995513</SerialNumber><PosOrderID>037b5be7-3459-4b02-a90e-3322a45aed15</PosOrderID><CID>edf5e7cd-a16e-413e-a533-644837e4e06e</CID></PosOrders><PosOrders><CardTNumber>95360178431</CardTNumber><CinemaName>石家庄威丽斯激光影城蓝山国际店</CinemaName><PosOrderPurchaseKind>限价</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T19:20:59+08:00</PosOrderTime><PosID>50609277</PosID><SerialNumber>006563</SerialNumber><PosOrderID>defcaf98-4ec6-47a8-8c76-212dd05209a4</PosOrderID><CID>2505af02-6e07-4237-8929-383033bc3030</CID></PosOrders><PosOrders><CardTNumber>95360147255</CardTNumber><CinemaName>石家庄中都影城(荣鼎店)</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>30</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T19:25:54+08:00</PosOrderTime><PosID>50280326</PosID><SerialNumber>007505</SerialNumber><PosOrderID>92819376-a03a-4aa2-981f-111287dbd8b6</PosOrderID><CID>6eaccf05-044e-423b-9f4a-18cac9411ce6</CID></PosOrders><PosOrders><CardTNumber>95360183020</CardTNumber><CinemaName>保定金棕榈影城</CinemaName><PosOrderPurchaseKind>3D</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T19:35:36+08:00</PosOrderTime><PosID>16078612</PosID><SerialNumber>004900</SerialNumber><PosOrderID>1ccdfe4f-5678-4eba-8218-7ae5dad2e874</PosOrderID><CID>614ae565-645b-4b41-99a7-363d3a30f194</CID></PosOrders><PosOrders><CardTNumber>95350061898</CardTNumber><CinemaName>大地数字影院-呼和浩特金游城店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T19:52:55+08:00</PosOrderTime><PosID>50060837</PosID><SerialNumber>006729</SerialNumber><PosOrderID>0a6ac43e-0ab3-4863-a437-ac707e7472c2</PosOrderID><CID>cfbdcc91-5f92-421b-9983-d4b35e089d76</CID></PosOrders><PosOrders><CardTNumber>95340391848</CardTNumber><CinemaName>天津SFC上影影城滨海文化中心店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T20:07:39+08:00</PosOrderTime><PosID>01211800420</PosID><SerialNumber>003507</SerialNumber><PosOrderID>9abf19cc-d95b-480d-8ff8-d5b738cbdc45</PosOrderID><CID>bac88d7a-faae-455e-a9dc-4480efac2976</CID></PosOrders><PosOrders><CardTNumber>95340391848</CardTNumber><CinemaName>天津SFC上影影城滨海文化中心店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T20:07:55+08:00</PosOrderTime><PosID>01211800420</PosID><SerialNumber>003508</SerialNumber><PosOrderID>6265d7a0-cdfd-433d-897a-f4893aa6053e</PosOrderID><CID>bac88d7a-faae-455e-a9dc-4480efac2976</CID></PosOrders><PosOrders><CardTNumber>95340356361</CardTNumber><CinemaName>天津万达滨海新区万达广场店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T20:10:54+08:00</PosOrderTime><PosID>01211802605</PosID><SerialNumber>001941</SerialNumber><PosOrderID>e84ee904-4ae2-4302-a029-d5642cd49c4e</PosOrderID><CID>e5889cd7-fe9e-4ef0-b345-4749b323ce7f</CID></PosOrders><PosOrders><CardTNumber>95360173923</CardTNumber><CinemaName>石家庄中都先天下店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>2</PosOrderPurchaseCount><PosOrderCount>60</PosOrderCount><CinemaPrice>30</CinemaPrice><PosOrderTime>2020-01-02T20:27:33+08:00</PosOrderTime><PosID>00011850448</PosID><SerialNumber>002594</SerialNumber><PosOrderID>ae0c5d01-844a-4978-9c41-8b197c33721a</PosOrderID><CID>a1591a52-2c57-4af4-921e-5f3fb2a7c84a</CID></PosOrders><PosOrders><CardTNumber>95345009417</CardTNumber><CinemaName>济南万达国际影城世贸广场店</CinemaName><PosOrderPurchaseKind>普通</PosOrderPurchaseKind><PosOrderPurchaseCount>1</PosOrderPurchaseCount><PosOrderCount>35</PosOrderCount><CinemaPrice>35</CinemaPrice><PosOrderTime>2020-01-02T21:21:25+08:00</PosOrderTime><PosID>01211801220</PosID><SerialNumber>002248</SerialNumber><PosOrderID>c415823c-05a2-4e5e-bf8a-3f83ab8d67c4</PosOrderID><CID>176b7623-bce8-4258-89ba-a87e3890c545</CID></PosOrders></Datas></string>");
        JSONObject string = jsonObject.getJSONObject("string");

        JSONObject LKG_CARDAPI_RETURN_HEADER = string.getJSONObject("LKG_CARDAPI_RETURN_HEADER");
        System.out.println( LKG_CARDAPI_RETURN_HEADER.get("OrderID"));

        JSONArray PosOrders = string.getJSONObject("Datas").getJSONArray("PosOrders");
        System.out.println(PosOrders.size());
        PosOrders.stream().forEach(one->{
            System.out.println(new JSONObject(one).getStr("CinemaName"));
            System.out.println(DateUtil.parse(new JSONObject(one).getStr("PosOrderTime"),"yyyy-MM-dd'T'HH:mm:ssXXX"));
        });

    }


}
