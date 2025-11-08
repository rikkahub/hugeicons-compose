package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Timer02: ImageVector
    get() {
        if (_timer02 != null) {
            return _timer02!!
        }
        _timer02 = ImageVector.Builder(
            name = "Timer02",
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
        moveTo(15f, 2f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 13.5f)
        curveTo(4f, 8.80558f, 7.80558f, 5f, 12.5f, 5f)
        curveTo(14.8472f, 5f, 16.9722f, 5.95139f, 18.5104f, 7.48959f)
        moveTo(18.5104f, 7.48959f)
        curveTo(20.0486f, 9.02779f, 21f, 11.1528f, 21f, 13.5f)
        curveTo(21f, 18.1944f, 17.1944f, 22f, 12.5f, 22f)
        horizontalLineTo(3f)
        moveTo(18.5104f, 7.48959f)
        lineTo(20f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 19f)
        horizontalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 16f)
        horizontalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 13.5f)
        lineTo(16f, 10f)
        }
        }.build()

        return _timer02!!
    }

private var _timer02: ImageVector? = null
