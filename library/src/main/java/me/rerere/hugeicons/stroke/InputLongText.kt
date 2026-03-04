package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InputLongText: ImageVector
    get() {
        if (_inputLongText != null) {
            return _inputLongText!!
        }
        _inputLongText = ImageVector.Builder(
            name = "InputLongText",
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
        moveTo(15f, 6f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 6f, 3.75736f, 6f, 2.87868f, 6.87868f)
        curveTo(2f, 7.75736f, 2f, 9.17157f, 2f, 12f)
        curveTo(2f, 14.8284f, 2f, 16.2426f, 2.87868f, 17.1213f)
        curveTo(3.75736f, 18f, 5.17157f, 18f, 8f, 18f)
        horizontalLineTo(15f)
        moveTo(21.1213f, 17.1213f)
        curveTo(22f, 16.2426f, 22f, 14.8284f, 22f, 12f)
        curveTo(22f, 9.17157f, 22f, 7.75736f, 21.1213f, 6.87868f)
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
        moveTo(13f, 12f)
        horizontalLineTo(11.5f)
        moveTo(13f, 12f)
        curveTo(13.8284f, 12f, 14.5f, 11.3284f, 14.5f, 10.5f)
        curveTo(14.5f, 9.67157f, 13.8284f, 9f, 13f, 9f)
        horizontalLineTo(11.5f)
        verticalLineTo(12f)
        moveTo(13f, 12f)
        curveTo(13.8284f, 12f, 14.5f, 12.6716f, 14.5f, 13.5f)
        curveTo(14.5f, 14.3284f, 13.8284f, 15f, 13f, 15f)
        horizontalLineTo(11.5f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 5f)
        verticalLineTo(19f)
        moveTo(18f, 5f)
        curveTo(18f, 3.89543f, 18.8954f, 3f, 20f, 3f)
        moveTo(18f, 5f)
        curveTo(18f, 3.89543f, 17.1046f, 3f, 16f, 3f)
        moveTo(18f, 19f)
        curveTo(18f, 20.1046f, 18.8954f, 21f, 20f, 21f)
        moveTo(18f, 19f)
        curveTo(18f, 20.1046f, 17.1046f, 21f, 16f, 21f)
        }
        }.build()

        return _inputLongText!!
    }

private var _inputLongText: ImageVector? = null
