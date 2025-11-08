package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cursor02: ImageVector
    get() {
        if (_cursor02 != null) {
            return _cursor02!!
        }
        _cursor02 = ImageVector.Builder(
            name = "Cursor02",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.80282f, 4.62973f)
        lineTo(15.8364f, 6.99069f)
        curveTo(19.3164f, 8.35243f, 21.0564f, 9.03329f, 20.9987f, 10.1133f)
        curveTo(20.941f, 11.1934f, 19.1251f, 11.6886f, 15.4933f, 12.6791f)
        curveTo(14.412f, 12.974f, 13.8713f, 13.1215f, 13.4964f, 13.4963f)
        curveTo(13.1215f, 13.8712f, 12.9741f, 14.4119f, 12.6791f, 15.4933f)
        curveTo(11.6887f, 19.125f, 11.1934f, 20.9409f, 10.1134f, 20.9986f)
        curveTo(9.03335f, 21.0563f, 8.35249f, 19.3163f, 6.99075f, 15.8363f)
        lineTo(4.62979f, 9.80276f)
        curveTo(3.20411f, 6.15934f, 2.49127f, 4.33764f, 3.41448f, 3.41442f)
        curveTo(4.3377f, 2.49121f, 6.15941f, 3.20405f, 9.80282f, 4.62973f)
        }
        }.build()

        return _cursor02!!
    }

private var _cursor02: ImageVector? = null
