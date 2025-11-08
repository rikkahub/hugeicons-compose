package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Radar01: ImageVector
    get() {
        if (_radar01 != null) {
            return _radar01!!
        }
        _radar01 = ImageVector.Builder(
            name = "Radar01",
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
        moveTo(16.5962f, 16.5962f)
        curveTo(14.0578f, 19.1346f, 9.94221f, 19.1346f, 7.40381f, 16.5962f)
        curveTo(4.8654f, 14.0578f, 4.8654f, 9.94221f, 7.40381f, 7.40381f)
        curveTo(8.92815f, 5.87946f, 11.0212f, 5.27051f, 13f, 5.57693f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        lineTo(16.9497f, 7.05025f)
        curveTo(17.9829f, 6.01707f, 18.4995f, 5.50048f, 18.3867f, 4.75173f)
        curveTo(18.2739f, 4.00298f, 17.7382f, 3.7198f, 16.6667f, 3.15343f)
        curveTo(15.2736f, 2.41699f, 13.6855f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 10.5778f, 21.7031f, 9.22492f, 21.1679f, 8f)
        }
        }.build()

        return _radar01!!
    }

private var _radar01: ImageVector? = null
