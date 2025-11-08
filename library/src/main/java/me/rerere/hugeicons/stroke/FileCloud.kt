package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) {
            return _fileCloud!!
        }
        _fileCloud = ImageVector.Builder(
            name = "FileCloud",
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
        moveTo(4f, 11.9949f)
        lineTo(4f, 14.5404f)
        curveTo(4f, 17.7871f, 4f, 19.4104f, 4.88607f, 20.5099f)
        curveTo(5.06508f, 20.732f, 5.26731f, 20.9344f, 5.48933f, 21.1135f)
        curveTo(6.58831f, 22f, 8.21082f, 22f, 11.4558f, 22f)
        curveTo(12.1614f, 22f, 12.5141f, 22f, 12.8372f, 21.8859f)
        curveTo(12.9044f, 21.8622f, 12.9702f, 21.8349f, 13.0345f, 21.8042f)
        curveTo(13.3436f, 21.6563f, 13.593f, 21.4067f, 14.0919f, 20.9076f)
        lineTo(18.8284f, 16.1686f)
        curveTo(19.4065f, 15.5903f, 19.6955f, 15.3011f, 19.8478f, 14.9334f)
        curveTo(20f, 14.5656f, 20f, 14.1567f, 20f, 13.3388f)
        verticalLineTo(9.99394f)
        curveTo(20f, 6.2208f, 20f, 4.33423f, 18.8284f, 3.16206f)
        curveTo(17.8971f, 2.23022f, 16.5144f, 2.03917f, 14.0919f, 2f)
        moveTo(13f, 21.4997f)
        verticalLineTo(20.9995f)
        curveTo(13f, 18.1696f, 13f, 16.7547f, 13.8787f, 15.8756f)
        curveTo(14.7574f, 14.9965f, 16.1716f, 14.9965f, 19f, 14.9965f)
        horizontalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 6.66667f)
        curveTo(4f, 7.95533f, 5.00736f, 9f, 6.25f, 9f)
        horizontalLineTo(10.975f)
        curveTo(12.0934f, 9f, 13f, 8.0598f, 13f, 6.9f)
        curveTo(13f, 5.7402f, 12.0833f, 4.80003f, 10.9649f, 4.80003f)
        curveTo(11.0897f, 3.36433f, 9.97992f, 2f, 8.5f, 2f)
        curveTo(7.20546f, 2f, 6.14305f, 3.03069f, 6.03419f, 4.34393f)
        curveTo(4.89279f, 4.45657f, 4f, 5.45349f, 4f, 6.66667f)
        }
        }.build()

        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
