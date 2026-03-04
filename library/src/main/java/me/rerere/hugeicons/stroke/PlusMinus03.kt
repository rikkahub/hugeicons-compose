package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PlusMinus03: ImageVector
    get() {
        if (_plusMinus03 != null) {
            return _plusMinus03!!
        }
        _plusMinus03 = ImageVector.Builder(
            name = "PlusMinus03",
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
        moveTo(9f, 19f)
        horizontalLineTo(15f)
        curveTo(16.8613f, 19f, 17.7919f, 19f, 18.5451f, 18.7553f)
        curveTo(20.0673f, 18.2607f, 21.2607f, 17.0673f, 21.7553f, 15.5451f)
        curveTo(22f, 14.7919f, 22f, 13.8613f, 22f, 12f)
        curveTo(22f, 10.1387f, 22f, 9.20808f, 21.7553f, 8.45492f)
        curveTo(21.2607f, 6.93273f, 20.0673f, 5.73931f, 18.5451f, 5.24472f)
        curveTo(17.7919f, 5f, 16.8613f, 5f, 15f, 5f)
        horizontalLineTo(9f)
        curveTo(7.13872f, 5f, 6.20808f, 5f, 5.45492f, 5.24472f)
        curveTo(3.93273f, 5.73931f, 2.73931f, 6.93273f, 2.24472f, 8.45492f)
        curveTo(2f, 9.20808f, 2f, 10.1387f, 2f, 12f)
        curveTo(2f, 13.8613f, 2f, 14.7919f, 2.24472f, 15.5451f)
        curveTo(2.73931f, 17.0673f, 3.93273f, 18.2607f, 5.45492f, 18.7553f)
        curveTo(6.20808f, 19f, 7.13872f, 19f, 9f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 9.5f)
        verticalLineTo(14.5f)
        moveTo(11f, 12f)
        horizontalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12f)
        horizontalLineTo(18f)
        }
        }.build()

        return _plusMinus03!!
    }

private var _plusMinus03: ImageVector? = null
