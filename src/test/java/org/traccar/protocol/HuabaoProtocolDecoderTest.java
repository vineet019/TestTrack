package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class HuabaoProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        HuabaoProtocolDecoder decoder = new HuabaoProtocolDecoder(null);

        verifyNull(decoder, binary(
                "7E01000021013345678906000F002C012F373031313142534A2D4D3742203030303030303001D4C1423838383838B47E"));

        verifyPosition(decoder, binary(
                "7e020000400303000002280042000000000000000301618ab406c31ec800000000000518092116145701040000047830011031010aeb16000c00b28986011780108622216500060089ffffffffc37e"));

        verifyPosition(decoder, binary(
                "7E0200002A013833501744001900000000000000C201597FA806CC01580080000000081508180721210104000002F502020000030200009F7E"));

        verifyPositions(decoder, binary(
                "7E0704014301356777777707F5000801002600000000000000030159741206CBFD5001720000000116052709062401040000001D03020000002600000000000000030159746606CBFD50016B0000000116052709065301040000001D0302000000260000000000000003015975E406CBFE58013F0000000116052709072701040000001D0302000000260000000000000003015976DE06CBFF10012E0000000116052709075601040000001D0302000000260000000000000003015976BC06CBFED0012D0000000116052709083001040000001D0302000000260000000000000003015976FE06CBFEC001080000000116052709090001040000001D0302000000260000000000000003015976FE06CBFE7800FC0000000116052709093301040000001D0302000000260000000000000003015977A606CBFF3001080000000116052709100201040000001D030200001F7E"));

        verifyAttributes(decoder, binary(
                "7E0200002F01357888888800B60000000000000003015972B406CBF6B802230000000116061317571301040000000003020000EB0700050001016708B37E"));

        verifyPositions(decoder, binary(
                "7E070400F30303000002450064000401003A000000000000000301618AC606C31F20000000000029180514202847010400000000EB16000C00B28986061708003732585700060089FFFFFFFE003A000000000000000301618AE806C31EB800000000009F180514202917010400000000EB16000C00B28986061708003732585700060089FFFFFFFE003A000000000000000301618AE806C31EB800000000009F180514202947010400000000EB16000C00B28986061708003732585700060089FFFFFFFE003A000001000000080301618AE806C31EB800000000009F180514203006010400000000EB16000C00B28986061708003732585700060089FFFFFFFED77E"));

        verifyPosition(decoder, binary(
                "7e02000054093037612710000700000000000000010223aca000dc9dd800000000000017121417122133362a4d30302c34352c31313336393042383030313233303026303030303030303030303030263132333435363738393031323334353623897e"));

        verifyPosition(decoder, binary(
                "7e0200002c00160128561400020000000000040001005de1f7065c6cef00000000000017011710044201040000a9002a02000030011b3101030c7e"));

        verifyPosition(decoder, binary(
                "7e0200002c00160128561400030000000000040007005de13c065c6cdb00160000000017011710054201040000a9002a02000030011b310104e47e"));

        verifyNull(decoder, binary(
                "7e0100002d0141305678720024002c012f373031313142534a2d41362d424400000000000000000000003035363738373201d4c14238383838386d7e"));

        verifyNull(decoder, binary(
                "7E0100002D013511221122000500000000373031303748422D52303347424400000000000000000000003233363631303402CBD5424136383630387E"));

        verifyNull(decoder, binary(
                "7e0100002d007089994489002800000000000000000048422d523033474244000000000000000000000031393036373531024142433030303030d17e"));

        verifyNull(decoder, binary(
                "7E0102000E013511221122000661757468656E7469636174696F6E3F7E"));

        verifyPosition(decoder, binary(
                "7E02000032013511221122000700000000000C000301578CC006CA3A5C00470000000014072317201501040000000030011631010BD07E"));

        verifyNull(decoder, binary(
                "7E010200100940278494700084323031313131303831313333323139369F7E"));

        verifyNull(decoder, binary(
                "7e010000190940278494700012000000000000000000000000000000000000094027849470000a7e"));

        verifyPosition(decoder, binary(
                "7e0200002e094027587492000a000000010000000a03083db7001329f3000000140000130412164952010400000012360a0002341502cb0c20085c107e"));

        verifyPosition(decoder, binary(
                "7e020000220014012499170007000000000000400e012af16f02cbd2ba000000000000150101194257010400000077a97e"));

    }

}
