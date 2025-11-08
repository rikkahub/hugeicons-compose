package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NotificationOff01: ImageVector
    get() {
        if (_notificationOff01 != null) {
            return _notificationOff01!!
        }
        _notificationOff01 = ImageVector.Builder(
            name = "NotificationOff01",
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
        moveTo(15.5f, 18f)
        curveTo(15.5f, 19.933f, 13.933f, 21.5f, 12f, 21.5f)
        curveTo(10.067f, 21.5f, 8.5f, 19.933f, 8.5f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 16.2311f)
        curveTo(21f, 15.762f, 20.8136f, 15.3121f, 20.4819f, 14.9803f)
        lineTo(19.8787f, 14.3771f)
        curveTo(19.3161f, 13.8145f, 19f, 13.0514f, 19f, 12.2558f)
        verticalLineTo(9.5f)
        curveTo(19f, 5.634f, 15.866f, 2.5f, 12f, 2.5f)
        curveTo(10.4497f, 2.5f, 9.01706f, 3.00399f, 7.85707f, 3.85707f)
        moveTo(4.76887f, 18f)
        curveTo(3.79195f, 18f, 3f, 17.208f, 3f, 16.2311f)
        curveTo(3f, 15.762f, 3.18636f, 15.3121f, 3.51809f, 14.9803f)
        lineTo(4.12132f, 14.3771f)
        curveTo(4.68393f, 13.8145f, 5f, 13.0514f, 5f, 12.2558f)
        verticalLineTo(9.5f)
        curveTo(5f, 8.20839f, 5.34981f, 6.99849f, 5.95987f, 5.95987f)
        lineTo(18f, 18f)
        horizontalLineTo(4.76887f)
        }
        }.build()

        return _notificationOff01!!
    }

private var _notificationOff01: ImageVector? = null
