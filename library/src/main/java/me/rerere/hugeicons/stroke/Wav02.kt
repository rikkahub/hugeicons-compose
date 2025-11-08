package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wav02: ImageVector
    get() {
        if (_wav02 != null) {
            return _wav02!!
        }
        _wav02 = ImageVector.Builder(
            name = "Wav02",
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
        moveTo(18f, 11f)
        curveTo(18f, 10.1825f, 18f, 9.4306f, 17.8478f, 9.06306f)
        curveTo(17.6955f, 8.69552f, 17.4065f, 8.40649f, 16.8284f, 7.82843f)
        lineTo(12.0919f, 3.09188f)
        curveTo(11.593f, 2.593f, 11.3436f, 2.34355f, 11.0345f, 2.19575f)
        curveTo(10.9702f, 2.165f, 10.9044f, 2.13772f, 10.8372f, 2.11401f)
        curveTo(10.5141f, 2f, 10.1614f, 2f, 9.45584f, 2f)
        curveTo(6.21082f, 2f, 4.58831f, 2f, 3.48933f, 2.88607f)
        curveTo(3.26731f, 3.06508f, 3.06508f, 3.26731f, 2.88607f, 3.48933f)
        curveTo(2f, 4.58831f, 2f, 6.21082f, 2f, 9.45584f)
        verticalLineTo(14f)
        curveTo(2f, 17.7712f, 2f, 19.6569f, 3.17157f, 20.8284f)
        curveTo(4.34315f, 22f, 6.22876f, 22f, 10f, 22f)
        horizontalLineTo(18f)
        moveTo(11f, 2.5f)
        verticalLineTo(3f)
        curveTo(11f, 5.82843f, 11f, 7.24264f, 11.8787f, 8.12132f)
        curveTo(12.7574f, 9f, 14.1716f, 9f, 17f, 9f)
        horizontalLineTo(17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 14f)
        verticalLineTo(19f)
        lineTo(8f, 16.5f)
        lineTo(10f, 19f)
        verticalLineTo(14f)
        moveTo(12.5f, 19f)
        lineTo(14.25f, 14f)
        horizontalLineTo(14.75f)
        lineTo(16.5f, 19f)
        moveTo(13.5f, 17.5f)
        horizontalLineTo(15.5f)
        moveTo(18f, 14f)
        lineTo(19.75f, 19f)
        horizontalLineTo(20.25f)
        lineTo(22f, 14f)
        }
        }.build()

        return _wav02!!
    }

private var _wav02: ImageVector? = null
