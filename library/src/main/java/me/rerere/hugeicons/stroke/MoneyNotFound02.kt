package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoneyNotFound02: ImageVector
    get() {
        if (_moneyNotFound02 != null) {
            return _moneyNotFound02!!
        }
        _moneyNotFound02 = ImageVector.Builder(
            name = "MoneyNotFound02",
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
        moveTo(18.5f, 12f)
        horizontalLineTo(18.51f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 12f)
        horizontalLineTo(5.51f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.87868f, 9.87866f)
        curveTo(9.33579f, 10.4216f, 9f, 11.1716f, 9f, 12f)
        curveTo(9f, 13.6568f, 10.3431f, 15f, 12f, 15f)
        curveTo(12.8284f, 15f, 13.5784f, 14.6642f, 14.1213f, 14.1213f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 3f)
        lineTo(21f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.541f, 17.541f)
        curveTo(22f, 16.6386f, 22f, 15.278f, 22f, 13f)
        verticalLineTo(11f)
        curveTo(22f, 8.17157f, 22f, 6.75736f, 21.1213f, 5.87868f)
        curveTo(20.2426f, 5f, 18.8284f, 5f, 16f, 5f)
        horizontalLineTo(9f)
        moveTo(18.9305f, 18.9305f)
        curveTo(18.168f, 19f, 17.2143f, 19f, 16f, 19f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 19f, 3.75736f, 19f, 2.87868f, 18.1213f)
        curveTo(2f, 17.2426f, 2f, 15.8284f, 2f, 13f)
        verticalLineTo(11f)
        curveTo(2f, 8.17157f, 2f, 6.75736f, 2.87868f, 5.87868f)
        curveTo(3.38012f, 5.37724f, 4.05597f, 5.16196f, 5.06953f, 5.06953f)
        }
        }.build()

        return _moneyNotFound02!!
    }

private var _moneyNotFound02: ImageVector? = null
