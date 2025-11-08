package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PasswordValidation: ImageVector
    get() {
        if (_passwordValidation != null) {
            return _passwordValidation!!
        }
        _passwordValidation = ImageVector.Builder(
            name = "PasswordValidation",
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
        moveTo(13.4082f, 16.6677f)
        curveTo(13.4082f, 16.6677f, 14.0332f, 16.6677f, 14.6582f, 18.001f)
        curveTo(14.6582f, 18.001f, 16.6435f, 14.6677f, 18.4082f, 14.001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9434f, 7.00098f)
        horizontalLineTo(16.9524f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9434f, 7.00098f)
        horizontalLineTo(11.9524f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.94336f, 7.00098f)
        horizontalLineTo(6.95234f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.89193f, 11.968f)
        horizontalLineTo(5.00845f)
        curveTo(3.34693f, 11.968f, 2f, 10.6249f, 2f, 8.96802f)
        verticalLineTo(4.99805f)
        curveTo(2f, 3.34119f, 3.34693f, 1.99805f, 5.00845f, 1.99805f)
        horizontalLineTo(18.9916f)
        curveTo(20.6531f, 1.99805f, 22f, 3.34119f, 22f, 4.99805f)
        verticalLineTo(9.12895f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.9996f, 16.001f)
        curveTo(21.9996f, 12.6873f, 19.3057f, 10.001f, 15.9827f, 10.001f)
        curveTo(12.6597f, 10.001f, 9.96582f, 12.6873f, 9.96582f, 16.001f)
        curveTo(9.96582f, 19.3147f, 12.6597f, 22.001f, 15.9827f, 22.001f)
        curveTo(19.3057f, 22.001f, 21.9996f, 19.3147f, 21.9996f, 16.001f)
        }
        }.build()

        return _passwordValidation!!
    }

private var _passwordValidation: ImageVector? = null
