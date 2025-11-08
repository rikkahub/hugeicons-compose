package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserGroup02: ImageVector
    get() {
        if (_userGroup02 != null) {
            return _userGroup02!!
        }
        _userGroup02 = ImageVector.Builder(
            name = "UserGroup02",
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
        moveTo(7.5f, 19.5f)
        curveTo(7.5f, 18.5344f, 7.82853f, 17.5576f, 8.63092f, 17.0204f)
        curveTo(9.59321f, 16.3761f, 10.7524f, 16f, 12f, 16f)
        curveTo(13.2476f, 16f, 14.4068f, 16.3761f, 15.3691f, 17.0204f)
        curveTo(16.1715f, 17.5576f, 16.5f, 18.5344f, 16.5f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 11f)
        curveTo(18.6101f, 11f, 19.6415f, 11.3769f, 20.4974f, 12.0224f)
        curveTo(21.2229f, 12.5696f, 21.5f, 13.4951f, 21.5f, 14.4038f)
        verticalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 11f)
        curveTo(5.38987f, 11f, 4.35846f, 11.3769f, 3.50256f, 12.0224f)
        curveTo(2.77706f, 12.5696f, 2.5f, 13.4951f, 2.5f, 14.4038f)
        verticalLineTo(14.5f)
        }
        }.build()

        return _userGroup02!!
    }

private var _userGroup02: ImageVector? = null
