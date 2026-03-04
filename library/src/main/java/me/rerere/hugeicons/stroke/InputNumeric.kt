package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InputNumeric: ImageVector
    get() {
        if (_inputNumeric != null) {
            return _inputNumeric!!
        }
        _inputNumeric = ImageVector.Builder(
            name = "InputNumeric",
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
        moveTo(16f, 6f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 6f, 3.75736f, 6f, 2.87868f, 6.87868f)
        curveTo(2f, 7.75736f, 2f, 9.17157f, 2f, 12f)
        curveTo(2f, 14.8284f, 2f, 16.2426f, 2.87868f, 17.1213f)
        curveTo(3.75736f, 18f, 5.17157f, 18f, 8f, 18f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 18f, 20.2426f, 18f, 21.1213f, 17.1213f)
        curveTo(22f, 16.2426f, 22f, 14.8284f, 22f, 12f)
        curveTo(22f, 9.17157f, 22f, 7.75736f, 21.1213f, 6.87868f)
        curveTo(20.2426f, 6f, 18.8284f, 6f, 16f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 9f)
        horizontalLineTo(7f)
        verticalLineTo(15f)
        moveTo(6f, 15f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 9f)
        horizontalLineTo(13f)
        curveTo(13.5523f, 9f, 14f, 9.44772f, 14f, 10f)
        verticalLineTo(11f)
        curveTo(14f, 11.5523f, 13.5523f, 12f, 13f, 12f)
        horizontalLineTo(12f)
        curveTo(11.4477f, 12f, 11f, 12.4477f, 11f, 13f)
        verticalLineTo(14f)
        curveTo(11f, 14.5523f, 11.4477f, 15f, 12f, 15f)
        horizontalLineTo(14f)
        }
        }.build()

        return _inputNumeric!!
    }

private var _inputNumeric: ImageVector? = null
