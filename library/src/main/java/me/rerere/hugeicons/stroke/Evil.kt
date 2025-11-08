package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Evil: ImageVector
    get() {
        if (_evil != null) {
            return _evil!!
        }
        _evil = ImageVector.Builder(
            name = "Evil",
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
        moveTo(7f, 9.01067f)
        curveTo(7f, 9.01067f, 8.40944f, 8.88341f, 9.19588f, 9.50798f)
        moveTo(9.19588f, 9.50798f)
        lineTo(8.93275f, 10.3427f)
        curveTo(8.82896f, 10.6719f, 9.10031f, 11f, 9.4764f, 11f)
        curveTo(9.87165f, 11f, 10.1327f, 10.6434f, 9.92918f, 10.3348f)
        curveTo(9.74877f, 10.0612f, 9.50309f, 9.75196f, 9.19588f, 9.50798f)
        moveTo(17f, 9.01067f)
        curveTo(17f, 9.01067f, 15.5906f, 8.88341f, 14.8041f, 9.50798f)
        moveTo(14.8041f, 9.50798f)
        lineTo(15.0672f, 10.3427f)
        curveTo(15.171f, 10.6719f, 14.8997f, 11f, 14.5236f, 11f)
        curveTo(14.1283f, 11f, 13.8673f, 10.6434f, 14.0708f, 10.3348f)
        curveTo(14.2512f, 10.0612f, 14.4969f, 9.75196f, 14.8041f, 9.50798f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 3.93552f)
        lineTo(2f, 2f)
        lineTo(3.68554f, 7.22508f)
        curveTo(3.80276f, 7.58847f, 3.86138f, 7.77016f, 3.85636f, 7.94233f)
        curveTo(3.85135f, 8.1145f, 3.76983f, 8.32454f, 3.60679f, 8.74461f)
        curveTo(3.21495f, 9.75417f, 3f, 10.852f, 3f, 12f)
        curveTo(3f, 16.9706f, 7.02944f, 21f, 12f, 21f)
        curveTo(16.9706f, 21f, 21f, 16.9706f, 21f, 12f)
        curveTo(21f, 10.852f, 20.7851f, 9.75417f, 20.3932f, 8.74461f)
        curveTo(20.2302f, 8.32454f, 20.1486f, 8.1145f, 20.1436f, 7.94233f)
        curveTo(20.1386f, 7.77016f, 20.1972f, 7.58847f, 20.3145f, 7.22508f)
        lineTo(22f, 2f)
        lineTo(16f, 3.93552f)
        moveTo(8f, 3.93552f)
        curveTo(7.40756f, 4.22994f, 6.85215f, 4.58772f, 6.34267f, 5f)
        moveTo(8f, 3.93552f)
        curveTo(9.20496f, 3.33671f, 10.5632f, 3f, 12f, 3f)
        curveTo(13.4368f, 3f, 14.795f, 3.33671f, 16f, 3.93552f)
        moveTo(16f, 3.93552f)
        curveTo(16.5924f, 4.22994f, 17.1478f, 4.58772f, 17.6573f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 16f)
        curveTo(9.83563f, 16.6278f, 10.8744f, 16.9998f, 12f, 16.9998f)
        curveTo(13.1256f, 16.9998f, 14.1644f, 16.6278f, 15f, 16f)
        }
        }.build()

        return _evil!!
    }

private var _evil: ImageVector? = null
