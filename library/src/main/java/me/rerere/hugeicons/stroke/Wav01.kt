package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wav01: ImageVector
    get() {
        if (_wav01 != null) {
            return _wav01!!
        }
        _wav01 = ImageVector.Builder(
            name = "Wav01",
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
        moveTo(20f, 13f)
        verticalLineTo(10.6569f)
        curveTo(20f, 9.83935f, 20f, 9.4306f, 19.8478f, 9.06306f)
        curveTo(19.6955f, 8.69552f, 19.4065f, 8.40649f, 18.8284f, 7.82843f)
        lineTo(14.0919f, 3.09188f)
        curveTo(13.593f, 2.593f, 13.3436f, 2.34355f, 13.0345f, 2.19575f)
        curveTo(12.9702f, 2.165f, 12.9044f, 2.13772f, 12.8372f, 2.11401f)
        curveTo(12.5141f, 2f, 12.1614f, 2f, 11.4558f, 2f)
        curveTo(8.21082f, 2f, 6.58831f, 2f, 5.48933f, 2.88607f)
        curveTo(5.26731f, 3.06508f, 5.06508f, 3.26731f, 4.88607f, 3.48933f)
        curveTo(4f, 4.58831f, 4f, 6.21082f, 4f, 9.45584f)
        verticalLineTo(13f)
        moveTo(13f, 2.5f)
        verticalLineTo(3f)
        curveTo(13f, 5.82843f, 13f, 7.24264f, 13.8787f, 8.12132f)
        curveTo(14.7574f, 9f, 16.1716f, 9f, 19f, 9f)
        horizontalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 16f)
        verticalLineTo(22f)
        lineTo(6.5f, 19f)
        lineTo(9f, 22f)
        verticalLineTo(16f)
        moveTo(11.25f, 22f)
        lineTo(13f, 16f)
        horizontalLineTo(13.5f)
        lineTo(15.25f, 22f)
        moveTo(12.25f, 20f)
        horizontalLineTo(14.25f)
        moveTo(16f, 16f)
        lineTo(17.75f, 22f)
        horizontalLineTo(18.25f)
        lineTo(20f, 16f)
        }
        }.build()

        return _wav01!!
    }

private var _wav01: ImageVector? = null
