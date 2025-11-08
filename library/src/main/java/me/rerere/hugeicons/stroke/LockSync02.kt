package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LockSync02: ImageVector
    get() {
        if (_lockSync02 != null) {
            return _lockSync02!!
        }
        _lockSync02 = ImageVector.Builder(
            name = "LockSync02",
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
        moveTo(20f, 11f)
        horizontalLineTo(22f)
        curveTo(21.497f, 5.94668f, 17.2229f, 2f, 12.0247f, 2f)
        curveTo(6.48823f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.48823f, 22f, 12.0247f, 22f)
        curveTo(16.1355f, 22f, 19.6684f, 19.5318f, 21.2154f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.25f, 10.9824f)
        verticalLineTo(9.1905f)
        curveTo(14.25f, 7.98072f, 13.2426f, 7f, 12f, 7f)
        curveTo(10.7574f, 7f, 9.75f, 7.98072f, 9.75f, 9.1905f)
        verticalLineTo(10.9824f)
        moveTo(12f, 17f)
        curveTo(10.067f, 17f, 8.5f, 15.4744f, 8.5f, 13.5926f)
        curveTo(8.5f, 11.7107f, 10.067f, 10.1851f, 12f, 10.1851f)
        curveTo(13.933f, 10.1851f, 15.5f, 11.7107f, 15.5f, 13.5926f)
        curveTo(15.5f, 15.4744f, 13.933f, 17f, 12f, 17f)
        }
        }.build()

        return _lockSync02!!
    }

private var _lockSync02: ImageVector? = null
