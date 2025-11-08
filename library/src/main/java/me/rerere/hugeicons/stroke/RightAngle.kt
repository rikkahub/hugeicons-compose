package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RightAngle: ImageVector
    get() {
        if (_rightAngle != null) {
            return _rightAngle!!
        }
        _rightAngle = ImageVector.Builder(
            name = "RightAngle",
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
        moveTo(3f, 5f)
        curveTo(3.39322f, 4.59544f, 4.43982f, 3f, 5f, 3f)
        curveTo(5.56018f, 3f, 6.60678f, 4.59544f, 7f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 17f)
        curveTo(19.4046f, 17.3932f, 21f, 18.4398f, 21f, 19f)
        curveTo(21f, 19.5602f, 19.4046f, 20.6068f, 19f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 12f)
        horizontalLineTo(6f)
        curveTo(8.82843f, 12f, 10.2426f, 12f, 11.1213f, 12.8787f)
        curveTo(12f, 13.7574f, 12f, 15.1716f, 12f, 18f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 19f)
        horizontalLineTo(11f)
        curveTo(8.17157f, 19f, 6.75736f, 19f, 5.87868f, 18.1213f)
        curveTo(5f, 17.2426f, 5f, 15.8284f, 5f, 13f)
        lineTo(5f, 3f)
        }
        }.build()

        return _rightAngle!!
    }

private var _rightAngle: ImageVector? = null
