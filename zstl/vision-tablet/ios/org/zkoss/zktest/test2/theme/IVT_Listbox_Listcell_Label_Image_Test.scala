package org.zkoss.zktest.test2.theme

import org.zkoss.zstl.ZTL4ScalaTestCase
import org.zkoss.ztl.annotation.Tags

@Tags(tags = "IOS,VisionTest")
class IVT_Listbox_Listcell_Label_Image_Test extends ZTL4ScalaTestCase {
	def testClick() = {
		val zscript = """
<listbox fixedLayout="true">
	<listhead sizable="true">
		<listheader align="center" width="40px"
			image="/img/Centigrade-Widget-Icons/ArrowsUpDown-16x16.png" />
		<listheader align="center" width="40px" image="/img/Centigrade-Widget-Icons/Envelope-16x16.png" />
		<listheader align="center" width="40px"
			image="/img/Centigrade-Widget-Icons/PaperClip-16x16.png" />
		<listheader label="Subject" sort="auto"/>
		<listheader label="Received" sort="auto"/>
	</listhead>
	<listitem height="28px">
		<listcell image="/img/Centigrade-Widget-Icons/ArrowUpOrange-16x16.png" />
		<listcell image="/img/Centigrade-Widget-Icons/EnvelopeOpen-16x16.png" />
		<listcell image="/img/Centigrade-Widget-Icons/PaperClip-16x16.png" />
		<listcell label="ZK Jet 0.8.0 is released" />
		<listcell label="2008/11/17 17:41:29" />
	</listitem>
	<listitem height="28px">
		<listcell image="/img/Centigrade-Widget-Icons/ArrowDown-16x16.png" />
		<listcell image="/img/Centigrade-Widget-Icons/Envelope-16x16.png" />
		<listcell image="/img/Centigrade-Widget-Icons/PaperClip-16x16.png" />
		<listcell label="URLs for iPhone-Optimized Google Sites" />
		<listcell label="2008/11/17 15:56:37" />
	</listitem>
	<listitem height="28px">
		<listcell label="&#160;" />
		<listcell image="/img/Centigrade-Widget-Icons/EnvelopeOpen-16x16.png" />
		<listcell label="&#160;" />
		<listcell label="Style Guide for ZK 3.5 released" />
		<listcell label="2008/11/14 13:23:07" />
	</listitem>
	<listitem height="28px">
		<listcell image="/img/Centigrade-Widget-Icons/ArrowUpOrange-16x16.png" />
		<listcell image="/img/Centigrade-Widget-Icons/EnvelopeOpen-16x16.png" />
		<listcell label="&#160;" />
		<listcell label="ZK Studio 0.9.0 released." />
		<listcell label="2008/11/16 10:26:37" />
	</listitem>
</listbox>
		""";

		runZTL(zscript,
			() => {
				verifyImage();
			});
	}
}
