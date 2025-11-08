package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Zip02: ImageVector
    get() {
        if (_zip02 != null) {
            return _zip02!!
        }
        _zip02 = ImageVector.Builder(
            name = "Zip02",
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
        moveTo(19.5f, 11f)
        curveTo(19.5f, 10.1825f, 19.5f, 9.4306f, 19.3478f, 9.06306f)
        curveTo(19.1955f, 8.69552f, 18.9065f, 8.40649f, 18.3284f, 7.82843f)
        lineTo(13.5919f, 3.09188f)
        curveTo(13.093f, 2.593f, 12.8436f, 2.34355f, 12.5345f, 2.19575f)
        curveTo(12.4702f, 2.165f, 12.4044f, 2.13772f, 12.3372f, 2.11401f)
        curveTo(12.0141f, 2f, 11.6614f, 2f, 10.9558f, 2f)
        curveTo(7.71082f, 2f, 6.08831f, 2f, 4.98933f, 2.88607f)
        curveTo(4.76731f, 3.06508f, 4.56508f, 3.26731f, 4.38607f, 3.48933f)
        curveTo(3.5f, 4.58831f, 3.5f, 6.21082f, 3.5f, 9.45584f)
        verticalLineTo(14f)
        curveTo(3.5f, 17.7712f, 3.5f, 19.6569f, 4.67157f, 20.8284f)
        curveTo(5.84315f, 22f, 7.72876f, 22f, 11.5f, 22f)
        horizontalLineTo(19.5f)
        moveTo(12.5f, 2.5f)
        verticalLineTo(3f)
        curveTo(12.5f, 5.82843f, 12.5f, 7.24264f, 13.3787f, 8.12132f)
        curveTo(14.2574f, 9f, 15.6716f, 9f, 18.5f, 9f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 13.9989f)
        verticalLineTo(18.9991f)
        moveTo(12f, 18.9991f)
        horizontalLineTo(9f)
        lineTo(12f, 13.9989f)
        horizontalLineTo(9f)
        moveTo(17f, 16.9989f)
        verticalLineTo(13.9989f)
        horizontalLineTo(19f)
        curveTo(19.8284f, 13.9989f, 20.5f, 14.6705f, 20.5f, 15.4989f)
        curveTo(20.5f, 16.3273f, 19.8284f, 16.9989f, 19f, 16.9989f)
        horizontalLineTo(17f)
        moveTo(17f, 16.9989f)
        verticalLineTo(18.9989f)
        }
        }.build()

        return _zip02!!
    }

private var _zip02: ImageVector? = null
