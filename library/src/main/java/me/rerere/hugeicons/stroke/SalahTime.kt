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
        moveTo(15.0092f, 5.00159f)
        curveTo(13.7435f, 3.18742f, 11.3856f, 2.00044f, 9.00543f, 2.00044f)
        curveTo(5.13698f, 2.00044f, 2.00098f, 5.13565f, 2.00098f, 9.00311f)
        curveTo(2.00098f, 12.7024f, 4.87016f, 15.7493f, 8.50511f, 16.0058f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.00486f, 7.00244f)
        verticalLineTo(9.5034f)
        lineTo(7.50391f, 10.5038f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.6148f, 15.5486f)
        curveTo(11.2537f, 13.8925f, 11.0215f, 12.2295f, 12.969f, 10.2102f)
        curveTo(15.0149f, 8.38506f, 16.1931f, 7.52188f, 16.507f, 7.00244f)
        curveTo(16.8209f, 7.52188f, 18.0182f, 8.38506f, 20.0641f, 10.2102f)
        curveTo(21.9183f, 11.8643f, 21.8017f, 13.8925f, 20.4405f, 15.5486f)
        moveTo(12.6148f, 15.5486f)
        horizontalLineTo(12.0923f)
        moveTo(12.6148f, 15.5486f)
        horizontalLineTo(20.4405f)
        moveTo(20.4405f, 15.5486f)
        horizontalLineTo(20.9009f)
        moveTo(11.0215f, 15.5486f)
        horizontalLineTo(12.0923f)
        moveTo(12.0923f, 15.5486f)
        verticalLineTo(21.0934f)
        curveTo(12.1323f, 21.7611f, 12.0923f, 22.0727f, 13.3035f, 21.9852f)
        horizontalLineTo(16.4881f)
        moveTo(20.9009f, 15.5486f)
        horizontalLineTo(22.0001f)
        moveTo(20.9009f, 15.5486f)
        verticalLineTo(21.1949f)
        curveTo(21.0177f, 22.1018f, 20.2956f, 21.9427f, 19.8338f, 21.9852f)
        horizontalLineTo(16.4881f)
        moveTo(16.4881f, 21.9852f)
        lineTo(16.5235f, 19.8507f)
        }
        }.build()

        return _salahTime!!
    }

private var _salahTime: ImageVector? = null
