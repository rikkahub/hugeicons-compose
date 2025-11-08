package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileZip: ImageVector
    get() {
        if (_fileZip != null) {
            return _fileZip!!
        }
        _fileZip = ImageVector.Builder(
            name = "FileZip",
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
        moveTo(4f, 22f)
        verticalLineTo(9.45584f)
        curveTo(4f, 6.21082f, 4f, 4.58831f, 4.88607f, 3.48933f)
        curveTo(5.06508f, 3.26731f, 5.26731f, 3.06508f, 5.48933f, 2.88607f)
        curveTo(6.58831f, 2f, 8.21082f, 2f, 11.4558f, 2f)
        curveTo(12.1614f, 2f, 12.5141f, 2f, 12.8372f, 2.11401f)
        curveTo(12.9044f, 2.13772f, 12.9702f, 2.165f, 13.0345f, 2.19575f)
        curveTo(13.3436f, 2.34355f, 13.593f, 2.593f, 14.0919f, 3.09188f)
        lineTo(18.8284f, 7.82843f)
        curveTo(19.4065f, 8.40649f, 19.6955f, 8.69552f, 19.8478f, 9.06306f)
        curveTo(20f, 9.4306f, 20f, 9.83935f, 20f, 10.6569f)
        verticalLineTo(14f)
        curveTo(20f, 17.7712f, 20f, 19.6569f, 18.8284f, 20.8284f)
        curveTo(17.8971f, 21.7598f, 16.5144f, 21.9508f, 14.0919f, 21.9899f)
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
        moveTo(7.5f, 5.5f)
        horizontalLineTo(7f)
        moveTo(10f, 7.5f)
        horizontalLineTo(9.5f)
        moveTo(7.5f, 9.5f)
        horizontalLineTo(7f)
        moveTo(10f, 11.5226f)
        horizontalLineTo(9.5f)
        moveTo(7.5f, 13.5f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 22.0001f)
        verticalLineTo(19f)
        curveTo(11f, 17.8954f, 10.1046f, 17f, 9f, 17f)
        curveTo(7.89543f, 17f, 7f, 17.8954f, 7f, 19f)
        verticalLineTo(22.0001f)
        horizontalLineTo(11f)
        }
        }.build()

        return _fileZip!!
    }

private var _fileZip: ImageVector? = null
