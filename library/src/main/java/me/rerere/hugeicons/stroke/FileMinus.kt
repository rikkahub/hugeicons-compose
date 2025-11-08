package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileMinus: ImageVector
    get() {
        if (_fileMinus != null) {
            return _fileMinus!!
        }
        _fileMinus = ImageVector.Builder(
            name = "FileMinus",
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
        moveTo(4f, 10f)
        lineTo(4f, 14.5442f)
        curveTo(4f, 17.7892f, 4f, 19.4117f, 4.88607f, 20.5107f)
        curveTo(5.06508f, 20.7327f, 5.26731f, 20.9349f, 5.48933f, 21.1139f)
        curveTo(6.58831f, 22f, 8.21082f, 22f, 11.4558f, 22f)
        curveTo(12.1614f, 22f, 12.5141f, 22f, 12.8372f, 21.886f)
        curveTo(12.9044f, 21.8623f, 12.9702f, 21.835f, 13.0345f, 21.8043f)
        curveTo(13.3436f, 21.6564f, 13.593f, 21.407f, 14.0919f, 20.9081f)
        lineTo(18.8284f, 16.1716f)
        curveTo(19.4065f, 15.5935f, 19.6955f, 15.3045f, 19.8478f, 14.9369f)
        curveTo(20f, 14.5694f, 20f, 14.1606f, 20f, 13.3431f)
        verticalLineTo(10f)
        curveTo(20f, 6.22876f, 20f, 4.34315f, 18.8284f, 3.17157f)
        curveTo(17.6569f, 2f, 15.7712f, 2f, 12f, 2f)
        moveTo(13f, 21.5f)
        verticalLineTo(21f)
        curveTo(13f, 18.1716f, 13f, 16.7574f, 13.8787f, 15.8787f)
        curveTo(14.7574f, 15f, 16.1716f, 15f, 19f, 15f)
        horizontalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6f)
        horizontalLineTo(4f)
        }
        }.build()

        return _fileMinus!!
    }

private var _fileMinus: ImageVector? = null
