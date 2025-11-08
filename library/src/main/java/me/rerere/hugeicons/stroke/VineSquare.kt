package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.VineSquare: ImageVector
    get() {
        if (_vineSquare != null) {
            return _vineSquare!!
        }
        _vineSquare = ImageVector.Builder(
            name = "VineSquare",
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
        moveTo(7f, 7.93975f)
        curveTo(7f, 10.1342f, 7.92291f, 15.0225f, 10.3867f, 17.576f)
        curveTo(10.9226f, 18.1314f, 11.766f, 18.1417f, 12.3182f, 17.6037f)
        curveTo(13.3919f, 16.5577f, 14.5354f, 14.8878f, 15.3132f, 13.1625f)
        moveTo(15.3132f, 13.1625f)
        curveTo(12.1329f, 12.3092f, 12.0286f, 9.88868f, 12.5f, 8.5545f)
        curveTo(13.6579f, 5.78927f, 16.2632f, 7.10006f, 16.2632f, 9.47648f)
        curveTo(16.2632f, 9.9135f, 16.2046f, 10.3816f, 16.0982f, 10.8667f)
        moveTo(15.3132f, 13.1625f)
        curveTo(16.0388f, 13.3571f, 16.9245f, 13.4702f, 18f, 13.4702f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }
        }.build()

        return _vineSquare!!
    }

private var _vineSquare: ImageVector? = null
