package org.zkoss.zktest.test2.theme

import org.zkoss.zstl.ZTL4ScalaTestCase
import org.zkoss.ztl.annotation.Tags

@Tags(tags = "IOS,VisionTest")
class IVT_Listbox_Sorting_Sizable_Checkmark_Test extends ZTL4ScalaTestCase {
	def testClick() = {
		val zscript = """
<listbox fixedLayout="true" width="400px" multiple="true" checkmark="true">
	<listhead sizable="true">
		<listheader align="center" width="40px"/>
		<listheader label="Subject" sort="auto" />
		<listheader label="Received" sort="auto" />
	</listhead>
	<auxhead>
		<auxheader label="A+B (Align Right)" colspan="2" align="right"/>
		<auxheader label="C" />
	</auxhead>
	<listitem height="28px">
		<listcell/>
		<listcell label="ZK Jet 0.8.0 is released" />
		<listcell label="2008/11/17 17:41:29" />
	</listitem>
	<listitem height="28px">
		<listcell />
		<listcell
			label="URLs for iPhone-Optimized Google Sites" />
		<listcell label="2008/11/17 15:56:37" />
	</listitem>
	<listitem height="28px">
		<listcell/>
		<listcell label="Style Guide for ZK 3.5 released" />
		<listcell label="2008/11/14 13:23:07" />
	</listitem>
	<listitem height="28px">
		<listcell/>
		<listcell label="ZK Studio 0.9.0 released." />
		<listcell label="2008/11/16 10:26:37" />
	</listitem>
	<listfoot>
		<listfooter label="" />
		<listfooter label="image" image="/img/Centigrade-Widget-Icons/BookBlue-16x16.png" hoverImage="/img/Centigrade-Widget-Icons/BookGreen-16x16.png"/>
		<listfooter label="image" image="/img/Centigrade-Widget-Icons/BookBlue-16x16.png" hoverImage="/img/Centigrade-Widget-Icons/BookGreen-16x16.png"/>
	</listfoot>
</listbox>
		""";

		runZTL(zscript,
			() => {
				verifyImage();
			});
	}
}
