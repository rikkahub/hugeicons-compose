package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Gps01: ImageVector
    get() {
        if (_gps01 != null) {
            return _gps01!!
        }
        _gps01 = ImageVector.Builder(
            name = "Gps01",
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
        moveTo(20.5137f, 12f)
        curveTo(20.5137f, 16.6944f, 16.7081f, 20.5f, 12.0137f, 20.5f)
        curveTo(7.31925f, 20.5f, 3.51367f, 16.6944f, 3.51367f, 12f)
        curveTo(3.51367f, 7.30558f, 7.31925f, 3.5f, 12.0137f, 3.5f)
        curveTo(16.7081f, 3.5f, 20.5137f, 7.30558f, 20.5137f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22.5f, 12f)
        horizontalLineTo(20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 12f)
        horizontalLineTo(1.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 1.5f)
        lineTo(12f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 20.5f)
        verticalLineTo(22.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12f)
        curveTo(15f, 13.6569f, 13.6568f, 15f, 12f, 15f)
        curveTo(10.3431f, 15f, 8.99995f, 13.6569f, 8.99995f, 12f)
        curveTo(8.99995f, 10.3431f, 10.3431f, 9f, 12f, 9f)
        curveTo(13.6568f, 9f, 15f, 10.3431f, 15f, 12f)
        }
        }.build()

        return _gps01!!
    }

private var _gps01: ImageVector? = null
