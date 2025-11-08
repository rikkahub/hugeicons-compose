package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Repository: ImageVector
    get() {
        if (_repository != null) {
            return _repository!!
        }
        _repository = ImageVector.Builder(
            name = "Repository",
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
        moveTo(6f, 19.6231f)
        curveTo(5.31093f, 19.4279f, 4.76772f, 19.1317f, 4.31802f, 18.682f)
        curveTo(3f, 17.364f, 3f, 15.2426f, 3f, 11f)
        curveTo(3f, 6.75736f, 3f, 4.63604f, 4.31802f, 3.31802f)
        curveTo(5.63604f, 2f, 7.75736f, 2f, 12f, 2f)
        curveTo(16.2426f, 2f, 18.364f, 2f, 19.682f, 3.31802f)
        curveTo(21f, 4.63604f, 21f, 6.75736f, 21f, 11f)
        curveTo(21f, 15.2426f, 21f, 17.364f, 19.682f, 18.682f)
        curveTo(19.2323f, 19.1317f, 18.6891f, 19.4279f, 18f, 19.6231f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 20.1928f)
        curveTo(11.5858f, 20.1928f, 11.2525f, 20.5121f, 10.5858f, 21.1508f)
        curveTo(9.93941f, 21.77f, 9.61623f, 22.0796f, 9.34374f, 21.9824f)
        curveTo(9.31027f, 21.9705f, 9.27805f, 21.9548f, 9.24763f, 21.9355f)
        curveTo(9f, 21.7786f, 9f, 21.3111f, 9f, 20.3762f)
        lineTo(9f, 17.2512f)
        curveTo(9f, 15.7186f, 9f, 14.9523f, 9.43934f, 14.4761f)
        curveTo(9.87868f, 14f, 10.5858f, 14f, 12f, 14f)
        curveTo(13.4142f, 14f, 14.1213f, 14f, 14.5607f, 14.4761f)
        curveTo(15f, 14.9523f, 15f, 15.7186f, 15f, 17.2512f)
        verticalLineTo(20.3762f)
        curveTo(15f, 21.3111f, 15f, 21.7786f, 14.7524f, 21.9355f)
        curveTo(14.7219f, 21.9548f, 14.6897f, 21.9705f, 14.6563f, 21.9824f)
        curveTo(14.3838f, 22.0796f, 14.0606f, 21.77f, 13.4142f, 21.1508f)
        curveTo(12.7475f, 20.5121f, 12.4142f, 20.1928f, 12f, 20.1928f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 10f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 6f)
        lineTo(12f, 6f)
        }
        }.build()

        return _repository!!
    }

private var _repository: ImageVector? = null
