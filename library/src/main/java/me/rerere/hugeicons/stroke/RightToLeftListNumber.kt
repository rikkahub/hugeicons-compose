package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RightToLeftListNumber: ImageVector
    get() {
        if (_rightToLeftListNumber != null) {
            return _rightToLeftListNumber!!
        }
        _rightToLeftListNumber = ImageVector.Builder(
            name = "RightToLeftListNumber",
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
        moveTo(3f, 6f)
        lineTo(13f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 12f)
        lineTo(13f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 18f)
        lineTo(13f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 15f)
        horizontalLineTo(19.5f)
        curveTo(19.7788f, 15f, 19.9182f, 15f, 20.0341f, 15.0231f)
        curveTo(20.5101f, 15.1177f, 20.8823f, 15.4899f, 20.9769f, 15.9659f)
        curveTo(21f, 16.0818f, 21f, 16.2212f, 21f, 16.5f)
        curveTo(21f, 16.7788f, 21f, 16.9182f, 20.9769f, 17.0341f)
        curveTo(20.8823f, 17.5101f, 20.5101f, 17.8823f, 20.0341f, 17.9769f)
        curveTo(19.9182f, 18f, 19.7788f, 18f, 19.5f, 18f)
        curveTo(19.2212f, 18f, 19.0818f, 18f, 18.9659f, 18.0231f)
        curveTo(18.4899f, 18.1177f, 18.1177f, 18.4899f, 18.0231f, 18.9659f)
        curveTo(18f, 19.0818f, 18f, 19.2212f, 18f, 19.5f)
        verticalLineTo(20.4f)
        curveTo(18f, 20.6828f, 18f, 20.8243f, 18.0879f, 20.9121f)
        curveTo(18.1757f, 21f, 18.3172f, 21f, 18.6f, 21f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 3f)
        horizontalLineTo(19.2f)
        curveTo(19.3657f, 3f, 19.5f, 3.13431f, 19.5f, 3.3f)
        verticalLineTo(9f)
        moveTo(19.5f, 9f)
        horizontalLineTo(18f)
        moveTo(19.5f, 9f)
        horizontalLineTo(21f)
        }
        }.build()

        return _rightToLeftListNumber!!
    }

private var _rightToLeftListNumber: ImageVector? = null
