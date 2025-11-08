package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AirplaneSeat02: ImageVector
    get() {
        if (_airplaneSeat02 != null) {
            return _airplaneSeat02!!
        }
        _airplaneSeat02 = ImageVector.Builder(
            name = "AirplaneSeat02",
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
        moveTo(19.5f, 7f)
        horizontalLineTo(4.5f)
        curveTo(5.08771f, 4.64917f, 7.19993f, 3f, 9.62311f, 3f)
        horizontalLineTo(14.3769f)
        curveTo(16.8001f, 3f, 18.9123f, 4.64917f, 19.5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 16.5f)
        verticalLineTo(7f)
        horizontalLineTo(20f)
        curveTo(20.5523f, 7f, 21f, 7.44772f, 21f, 8f)
        verticalLineTo(16.5f)
        curveTo(21f, 17.3284f, 20.3284f, 18f, 19.5f, 18f)
        curveTo(18.6716f, 18f, 18f, 17.3284f, 18f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 19f)
        verticalLineTo(7f)
        horizontalLineTo(18f)
        verticalLineTo(19f)
        curveTo(18f, 20.1046f, 17.1046f, 21f, 16f, 21f)
        horizontalLineTo(8f)
        curveTo(6.89543f, 21f, 6f, 20.1046f, 6f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 16.5f)
        verticalLineTo(8f)
        curveTo(3f, 7.44772f, 3.44772f, 7f, 4f, 7f)
        horizontalLineTo(6f)
        verticalLineTo(16.5f)
        curveTo(6f, 17.3284f, 5.32843f, 18f, 4.5f, 18f)
        curveTo(3.67157f, 18f, 3f, 17.3284f, 3f, 16.5f)
        }
        }.build()

        return _airplaneSeat02!!
    }

private var _airplaneSeat02: ImageVector? = null
