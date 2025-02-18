/* B30_1822643Test.java

	Purpose:
		
	Description:
		
	History:
		May, 30, 2018 18:42:01 PM

Copyright (C) 2018 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.zktest.test2.B30

;

import org.junit.Test
import org.zkoss.zstl.ZTL4ScalaTestCase
import org.zkoss.ztl.unit.Widget


class B30_1822643Test extends ZTL4ScalaTestCase {
  @Test
  def testTree() = {
    var zscript =
      """
<zk>
When current page is last page, call setPageSize method.
Notice: This only happens when the change pageSize is larger than current
pageSize

	<button id="btn" label="Set PageSize">
			<attribute name="onClick">
				tree.setPageSize(10);
			</attribute>
		</button>
	<tree id="tree" mold="paging" width="90%" pageSize="2">
		<treechildren>
			<treeitem label="Item 1" />
			<treeitem label="Item 2" />
			<treeitem label="Item 3" />
			<treeitem label="Item 4" />
			<treeitem label="Item 5" />
			<treeitem label="Item 6" />
			<treeitem label="Item 7" />
			<treeitem label="Item 8" />
			<treeitem label="Item 9" />
			<treeitem label="Item 10" />
			<treeitem label="Item 11" />
			<treeitem label="Item 12" />
			<treeitem label="Item 13" />
			<treeitem label="Item 14" />
			<treeitem label="Item 15">
				<treechildren>
			<treeitem label="Item 15.1" />
			<treeitem label="Item 15.2" />
			<treeitem label="Item 15.3" />
			<treeitem label="Item 15.4" />
			<treeitem label="Item 15.5" />
			<treeitem label="Item 15.6" />
			<treeitem label="Item 15.7" />
			<treeitem label="Item 15.8" />
			<treeitem label="Item 15.9" />
			<treeitem label="Item 15.10" />
			<treeitem label="Item 15.11" />
			<treeitem label="Item 15.12" />
			<treeitem label="Item 15.13" />
			<treeitem label="Item 15.14" />
			<treeitem label="Item 15.15" />
				</treechildren>
			</treeitem>
		</treechildren>
	</tree>
</zk>
		 """
    val ztl$engine = engine()
    val btn = ztl$engine.$f("btn")
    val tree = ztl$engine.$f("tree")
    runZTL(zscript, () => {
      verifyEquals("[ 1 - 2 / 30 ]", jq(".z-paging-info > span:eq(0)").text())
      verifyEquals(2, jq(".z-treechildren tr").length())
      click(btn)
      waitResponse()
      verifyEquals("[ 1 - 10 / 30 ]", jq(".z-paging-info > span:eq(0)").text())
      verifyEquals(10, jq(".z-treechildren tr").length())
    })
  }
}



