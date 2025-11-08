package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileSearch: ImageVector
    get() {
        if (_fileSearch != null) {
            return _fileSearch!!
        }
        _fileSearch = ImageVector.Builder(
            name = "FileSearch",
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
        verticalLineTo(14f)
        curveTo(4f, 17.7712f, 4f, 19.6569f, 5.17157f, 20.8284f)
        curveTo(6.23467f, 21.8915f, 7.8857f, 21.99f, 11f, 21.9991f)
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
        moveTo(20f, 22f)
        lineTo(17.8529f, 19.8529f)
        moveTo(17.8529f, 19.8529f)
        curveTo(17.9675f, 19.7384f, 18.0739f, 19.6158f, 18.1714f, 19.486f)
        curveTo(18.602f, 18.913f, 18.8571f, 18.2006f, 18.8571f, 17.4286f)
        curveTo(18.8571f, 15.535f, 17.3221f, 14f, 15.4286f, 14f)
        curveTo(13.535f, 14f, 12f, 15.535f, 12f, 17.4286f)
        curveTo(12f, 19.3221f, 13.535f, 20.8571f, 15.4286f, 20.8571f)
        curveTo(16.3753f, 20.8571f, 17.2325f, 20.4734f, 17.8529f, 19.8529f)
        }
        }.build()

        return _fileSearch!!
    }

private var _fileSearch: ImageVector? = null
