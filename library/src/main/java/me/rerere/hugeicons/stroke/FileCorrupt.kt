package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileCorrupt: ImageVector
    get() {
        if (_fileCorrupt != null) {
            return _fileCorrupt!!
        }
        _fileCorrupt = ImageVector.Builder(
            name = "FileCorrupt",
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
        moveTo(13f, 2.5f)
        verticalLineTo(3f)
        curveTo(13f, 5.82843f, 13f, 7.24264f, 13.8787f, 8.12132f)
        curveTo(14.7574f, 9f, 16.1716f, 9f, 19f, 9f)
        horizontalLineTo(19.5f)
        moveTo(15f, 21.965f)
        curveTo(16.8723f, 21.8873f, 18.0203f, 21.6366f, 18.8284f, 20.8284f)
        curveTo(20f, 19.6569f, 20f, 17.7712f, 20f, 14f)
        verticalLineTo(10.6569f)
        curveTo(20f, 9.83935f, 20f, 9.4306f, 19.8478f, 9.06306f)
        curveTo(19.6955f, 8.69552f, 19.4065f, 8.40649f, 18.8284f, 7.82843f)
        lineTo(14.0919f, 3.09188f)
        curveTo(13.593f, 2.593f, 13.3436f, 2.34355f, 13.0345f, 2.19575f)
        curveTo(12.6252f, 2f, 12.1614f, 2f, 11.4558f, 2f)
        curveTo(8.21082f, 2f, 6.58831f, 2f, 5.48933f, 2.88607f)
        curveTo(5.26731f, 3.06508f, 5.06508f, 3.26731f, 4.88607f, 3.48933f)
        curveTo(4f, 4.58831f, 4f, 6.21082f, 4f, 9.45584f)
        verticalLineTo(14.5f)
        curveTo(4f, 17.7875f, 4f, 19.4312f, 4.90796f, 20.5376f)
        curveTo(5.07418f, 20.7401f, 5.25989f, 20.9258f, 5.46243f, 21.092f)
        curveTo(6.56878f, 22f, 8.21252f, 22f, 11.5f, 22f)
        lineTo(13.5f, 19f)
        lineTo(11.5f, 16.5f)
        lineTo(13.5f, 14f)
        lineTo(12f, 12f)
        }
        }.build()

        return _fileCorrupt!!
    }

private var _fileCorrupt: ImageVector? = null
