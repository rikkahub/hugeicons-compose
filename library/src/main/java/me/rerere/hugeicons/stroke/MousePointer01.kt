package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MousePointer01: ImageVector
    get() {
        if (_mousePointer01 != null) {
            return _mousePointer01!!
        }
        _mousePointer01 = ImageVector.Builder(
            name = "MousePointer01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.79495f, 4.62973f)
            lineTo(15.8285f, 6.99069f)
            curveTo(19.3085f, 8.35243f, 21.0485f, 9.03329f, 20.9908f, 10.1133f)
            curveTo(20.9331f, 11.1934f, 19.1172f, 11.6886f, 15.4855f, 12.6791f)
            curveTo(14.4041f, 12.974f, 13.8634f, 13.1215f, 13.4885f, 13.4963f)
            curveTo(13.1137f, 13.8712f, 12.9662f, 14.4119f, 12.6713f, 15.4933f)
            curveTo(11.6808f, 19.125f, 11.1855f, 20.9409f, 10.1055f, 20.9986f)
            curveTo(9.02548f, 21.0563f, 8.34461f, 19.3163f, 6.98288f, 15.8363f)
            lineTo(4.62192f, 9.80276f)
            curveTo(3.19624f, 6.15934f, 2.48339f, 4.33764f, 3.40661f, 3.41442f)
            curveTo(4.32982f, 2.49121f, 6.15153f, 3.20405f, 9.79495f, 4.62973f)
            close()
        }
        }.build()

        return _mousePointer01!!
    }

private var _mousePointer01: ImageVector? = null
