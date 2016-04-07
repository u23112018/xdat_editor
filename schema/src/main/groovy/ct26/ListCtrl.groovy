package ct26

import acmi.l2.clientmod.l2resources.Sysstr
import acmi.l2.clientmod.util.IOEntity
import acmi.l2.clientmod.util.IOUtil
import acmi.l2.clientmod.util.Type
import acmi.l2.clientmod.util.defaultio.DefaultIO
import groovy.transform.CompileStatic

@DefaultIO
@CompileStatic
class ListCtrl extends DefaultProperty {
    int maxRow
    int showRow
    Boolean useVScroll
    int contentsHeight
    int headerHeight
    @Type(ListElement.class)
    List<ListElement> values = []

    @DefaultIO
    static class ListElement implements IOEntity {
        @Sysstr
        int textStringId
        int width
        boolean bAscend
        boolean bClickEnable
        boolean bNumber

        @Override
        String toString() {
            return getClass().simpleName
        }

        // @formatter:off
        @Deprecated boolean getUnk108() { bAscend }
        @Deprecated void setUnk108(boolean unk108) { this.bAscend = unk108 }

        @Deprecated boolean getUnk109() { bClickEnable }
        @Deprecated void setUnk109(boolean unk109) { this.bClickEnable = unk109  }

        @Deprecated boolean getUnk110() { bNumber }
        @Deprecated void setUnk110(boolean unk110) { this.bNumber = unk110 }
        // @formatter:on
    }

    // @formatter:off
    @Deprecated int getUnk100() { maxRow }
    @Deprecated void setUnk100(int unk100) { this.maxRow = unk100 }

    @Deprecated int getUnk101() { showRow }
    @Deprecated void setUnk101(int unk101) { this.showRow = unk101 }

    @Deprecated int getUnk102() { IOUtil.boolToInt(useVScroll) }
    @Deprecated void setUnk102(int unk102) { this.useVScroll = IOUtil.intToBool(unk102) }

    @Deprecated int getUnk103() { contentsHeight }
    @Deprecated void setUnk103(int unk103) { this.contentsHeight = unk103 }

    @Deprecated int getUnk104() { headerHeight }
    @Deprecated void setUnk104(int unk104) { this.headerHeight = unk104 }
    // @formatter:on
}
