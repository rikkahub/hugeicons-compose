package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LogoutSquare02: ImageVector
    get() {
        if (_logoutSquare02 != null) {
            return _logoutSquare02!!
        }
        _logoutSquare02 = ImageVector.Builder(
            name = "LogoutSquare02",
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
        moveTo(19.9999f, 6.99974f)
        curveTo(19.923f, 5.58247f, 19.7124f, 4.66414f, 19.1363f, 3.96217f)
        curveTo(18.9701f, 3.75963f, 18.7844f, 3.57392f, 18.5819f, 3.4077f)
        curveTo(17.4755f, 2.49974f, 15.8318f, 2.49974f, 12.5443f, 2.49974f)
        lineTo(11.9999f, 2.4999f)
        curveTo(8.22871f, 2.4999f, 6.34309f, 2.4999f, 5.17152f, 3.67147f)
        curveTo(3.99994f, 4.84305f, 3.99994f, 6.72866f, 3.99994f, 10.4999f)
        verticalLineTo(13.4999f)
        curveTo(3.99994f, 17.2711f, 3.99994f, 19.1568f, 5.17152f, 20.3283f)
        curveTo(6.34309f, 21.4999f, 8.22871f, 21.4999f, 11.9999f, 21.4999f)
        lineTo(12.5443f, 21.4997f)
        curveTo(15.8318f, 21.4997f, 17.4755f, 21.4997f, 18.5819f, 20.5918f)
        curveTo(18.7844f, 20.4256f, 18.9701f, 20.2399f, 19.1363f, 20.0373f)
        curveTo(19.7124f, 19.3353f, 19.923f, 18.417f, 19.9999f, 16.9997f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 7.99991f)
        curveTo(16f, 7.99991f, 20f, 10.9459f, 20f, 11.9999f)
        curveTo(20f, 13.054f, 16f, 15.9999f, 16f, 15.9999f)
        moveTo(19.5f, 11.9999f)
        horizontalLineTo(9f)
        }
        }.build()

        return _logoutSquare02!!
    }

private var _logoutSquare02: ImageVector? = null
