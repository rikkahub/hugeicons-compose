package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chemistry02: ImageVector
    get() {
        if (_chemistry02 != null) {
            return _chemistry02!!
        }
        _chemistry02 = ImageVector.Builder(
            name = "Chemistry02",
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
        moveTo(5f, 3f)
        verticalLineTo(13f)
        curveTo(5f, 16.7712f, 5f, 18.6569f, 6.17157f, 19.8284f)
        curveTo(7.34315f, 21f, 9.22876f, 21f, 13f, 21f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 9f)
        lineTo(11f, 9f)
        moveTo(20f, 9f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.2466f, 4f)
        verticalLineTo(6.55767f)
        curveTo(15.2466f, 7.69966f, 15.2466f, 8.27065f, 15.3937f, 8.8188f)
        curveTo(15.5408f, 9.36696f, 15.8292f, 9.87028f, 16.4059f, 10.8769f)
        lineTo(17.1873f, 12.241f)
        curveTo(18.6568f, 14.8062f, 19.3916f, 16.0888f, 18.7888f, 17.0396f)
        lineTo(18.7795f, 17.0541f)
        curveTo(18.1679f, 18f, 16.6119f, 18f, 13.5f, 18f)
        curveTo(10.3881f, 18f, 8.83212f, 18f, 8.22055f, 17.0541f)
        lineTo(8.21123f, 17.0396f)
        curveTo(7.60843f, 16.0888f, 8.34319f, 14.8062f, 9.8127f, 12.241f)
        lineTo(10.5941f, 10.8769f)
        curveTo(11.1708f, 9.87028f, 11.4592f, 9.36696f, 11.6063f, 8.8188f)
        curveTo(11.7534f, 8.27065f, 11.7534f, 7.69966f, 11.7534f, 6.55767f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 4f)
        lineTo(16.5f, 4f)
        }
        }.build()

        return _chemistry02!!
    }

private var _chemistry02: ImageVector? = null
