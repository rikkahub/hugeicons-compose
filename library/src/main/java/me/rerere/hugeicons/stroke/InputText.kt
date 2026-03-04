package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InputText: ImageVector
    get() {
        if (_inputText != null) {
            return _inputText!!
        }
        _inputText = ImageVector.Builder(
            name = "InputText",
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
        moveTo(5f, 15f)
        lineTo(6.49694f, 9.38649f)
        curveTo(6.55771f, 9.15858f, 6.76412f, 9f, 7f, 9f)
        curveTo(7.23588f, 9f, 7.44229f, 9.15858f, 7.50307f, 9.38649f)
        lineTo(9f, 15f)
        moveTo(6f, 13f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 9f)
        horizontalLineTo(12f)
        verticalLineTo(12f)
        horizontalLineTo(13.5f)
        curveTo(14.3284f, 12f, 15f, 11.3284f, 15f, 10.5f)
        curveTo(15f, 9.67157f, 14.3284f, 9f, 13.5f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 12f)
        horizontalLineTo(12f)
        verticalLineTo(15f)
        horizontalLineTo(13.5f)
        curveTo(14.3284f, 15f, 15f, 14.3284f, 15f, 13.5f)
        curveTo(15f, 12.6716f, 14.3284f, 12f, 13.5f, 12f)
        }
        }.build()

        return _inputText!!
    }

private var _inputText: ImageVector? = null
