package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DollarSend02: ImageVector
    get() {
        if (_dollarSend02 != null) {
            return _dollarSend02!!
        }
        _dollarSend02 = ImageVector.Builder(
            name = "DollarSend02",
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
        moveTo(10.625f, 8.62963f)
        curveTo(10.625f, 6.62504f, 8.77817f, 5f, 6.5f, 5f)
        curveTo(4.22182f, 5f, 2.375f, 6.62504f, 2.375f, 8.62963f)
        curveTo(2.375f, 10.6342f, 3.5f, 11.7407f, 6.5f, 11.7407f)
        curveTo(9.5f, 11.7407f, 11f, 12.7778f, 11f, 15.3704f)
        curveTo(11f, 17.963f, 8.98528f, 19f, 6.5f, 19f)
        curveTo(4.01472f, 19f, 2f, 17.375f, 2f, 15.3704f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 3f)
        lineTo(6.5f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        horizontalLineTo(14.5f)
        moveTo(22f, 12f)
        curveTo(22f, 12.7002f, 20.0057f, 14.0085f, 19.5f, 14.5f)
        moveTo(22f, 12f)
        curveTo(22f, 11.2998f, 20.0057f, 9.99153f, 19.5f, 9.5f)
        }
        }.build()

        return _dollarSend02!!
    }

private var _dollarSend02: ImageVector? = null
