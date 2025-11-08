package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SalahTime: ImageVector
    get() {
        if (_salahTime != null) {
            return _salahTime!!
        }
        _salahTime = ImageVector.Builder(
            name = "SalahTime",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5092f, 5.00159f)
        curveTo(14.2435f, 3.18742f, 11.8856f, 2.00044f, 9.50543f, 2.00044f)
        curveTo(5.63698f, 2.00044f, 2.50098f, 5.13565f, 2.50098f, 9.00311f)
        curveTo(2.50098f, 12.7024f, 5.37016f, 15.7493f, 9.00511f, 16.0058f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.50486f, 7.00244f)
        verticalLineTo(9.5034f)
        lineTo(8.00391f, 10.5038f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.1148f, 15.5486f)
        curveTo(11.7537f, 13.8925f, 11.5215f, 12.2295f, 13.469f, 10.2102f)
        curveTo(15.5149f, 8.38506f, 16.6931f, 7.52188f, 17.007f, 7.00244f)
        curveTo(17.3209f, 7.52188f, 18.5182f, 8.38506f, 20.5641f, 10.2102f)
        curveTo(22.4183f, 11.8643f, 22.3017f, 13.8925f, 20.9405f, 15.5486f)
        moveTo(13.1148f, 15.5486f)
        horizontalLineTo(12.5923f)
        moveTo(13.1148f, 15.5486f)
        horizontalLineTo(20.9405f)
        moveTo(20.9405f, 15.5486f)
        horizontalLineTo(21.4009f)
        moveTo(11.5215f, 15.5486f)
        horizontalLineTo(12.5923f)
        moveTo(12.5923f, 15.5486f)
        verticalLineTo(21.0934f)
        curveTo(12.6323f, 21.7611f, 12.5923f, 22.0727f, 13.8035f, 21.9852f)
        horizontalLineTo(16.9881f)
        moveTo(21.4009f, 15.5486f)
        horizontalLineTo(22.5001f)
        moveTo(21.4009f, 15.5486f)
        verticalLineTo(21.1949f)
        curveTo(21.5177f, 22.1018f, 20.7956f, 21.9427f, 20.3338f, 21.9852f)
        horizontalLineTo(16.9881f)
        moveTo(16.9881f, 21.9852f)
        lineTo(17.0235f, 19.8507f)
        }
        }.build()

        return _salahTime!!
    }

private var _salahTime: ImageVector? = null
