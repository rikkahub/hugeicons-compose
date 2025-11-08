package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cabinet01: ImageVector
    get() {
        if (_cabinet01 != null) {
            return _cabinet01!!
        }
        _cabinet01 = ImageVector.Builder(
            name = "Cabinet01",
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
        moveTo(6f, 18f)
        lineTo(5f, 21f)
        moveTo(18f, 18f)
        lineTo(19f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 18f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 18f, 3.75736f, 18f, 2.87868f, 17.0586f)
        curveTo(2f, 16.1171f, 2f, 14.6019f, 2f, 11.5714f)
        verticalLineTo(9.42857f)
        curveTo(2f, 6.39811f, 2f, 4.88289f, 2.87868f, 3.94144f)
        curveTo(3.75736f, 3f, 5.17157f, 3f, 8f, 3f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 3f, 20.2426f, 3f, 21.1213f, 3.94144f)
        curveTo(22f, 4.88289f, 22f, 6.39811f, 22f, 9.42857f)
        verticalLineTo(11.5714f)
        curveTo(22f, 14.6019f, 22f, 16.1171f, 21.1213f, 17.0586f)
        curveTo(20.2426f, 18f, 18.8284f, 18f, 16f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 14f)
        horizontalLineTo(21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3f)
        lineTo(12f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 9f)
        lineTo(9f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9f)
        lineTo(15f, 8f)
        }
        }.build()

        return _cabinet01!!
    }

private var _cabinet01: ImageVector? = null
