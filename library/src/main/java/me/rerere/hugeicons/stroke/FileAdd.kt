package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileAdd: ImageVector
    get() {
        if (_fileAdd != null) {
            return _fileAdd!!
        }
        _fileAdd = ImageVector.Builder(
            name = "FileAdd",
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
        moveTo(4f, 12.0005f)
        lineTo(4f, 14.5446f)
        curveTo(4f, 17.7896f, 4f, 19.4122f, 4.88607f, 20.5111f)
        curveTo(5.06508f, 20.7331f, 5.26731f, 20.9354f, 5.48933f, 21.1144f)
        curveTo(6.58831f, 22.0005f, 8.21082f, 22.0005f, 11.4558f, 22.0005f)
        curveTo(12.1614f, 22.0005f, 12.5141f, 22.0005f, 12.8372f, 21.8865f)
        curveTo(12.9044f, 21.8627f, 12.9702f, 21.8355f, 13.0345f, 21.8047f)
        curveTo(13.3436f, 21.6569f, 13.593f, 21.4075f, 14.0919f, 20.9086f)
        lineTo(18.8284f, 16.172f)
        curveTo(19.4065f, 15.594f, 19.6955f, 15.3049f, 19.8478f, 14.9374f)
        curveTo(20f, 14.5699f, 20f, 14.1611f, 20f, 13.3436f)
        verticalLineTo(10.0005f)
        curveTo(20f, 6.22922f, 20f, 4.34361f, 18.8284f, 3.17203f)
        curveTo(17.7693f, 2.11287f, 16.1265f, 2.01125f, 13.0345f, 2.0015f)
        moveTo(13f, 21.5005f)
        verticalLineTo(21.0005f)
        curveTo(13f, 18.172f, 13f, 16.7578f, 13.8787f, 15.8791f)
        curveTo(14.7574f, 15.0005f, 16.1716f, 15.0005f, 19f, 15.0005f)
        horizontalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5.99954f)
        horizontalLineTo(4f)
        moveTo(8f, 1.99954f)
        verticalLineTo(9.99954f)
        }
        }.build()

        return _fileAdd!!
    }

private var _fileAdd: ImageVector? = null
