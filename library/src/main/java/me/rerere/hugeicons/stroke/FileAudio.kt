package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) {
            return _fileAudio!!
        }
        _fileAudio = ImageVector.Builder(
            name = "FileAudio",
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
        moveTo(20f, 11f)
        curveTo(20f, 11f, 20f, 9.4306f, 19.8478f, 9.06306f)
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
        curveTo(6.34315f, 22f, 8.22876f, 22f, 12f, 22f)
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
        moveTo(19.9998f, 19.4068f)
        verticalLineTo(16.5932f)
        curveTo(19.9998f, 15.0206f, 19.9998f, 14.2343f, 19.46f, 14.0386f)
        curveTo(18.9201f, 13.843f, 18.2848f, 14.399f, 17.0141f, 15.511f)
        lineTo(16.5f, 16f)
        horizontalLineTo(15.0039f)
        curveTo(14.0611f, 16f, 13.5897f, 16f, 13.2968f, 16.2929f)
        curveTo(13.0039f, 16.5858f, 13.0039f, 17.0572f, 13.0039f, 18f)
        curveTo(13.0039f, 18.9428f, 13.0039f, 19.4142f, 13.2968f, 19.7071f)
        curveTo(13.5897f, 20f, 14.0611f, 20f, 15.0039f, 20f)
        horizontalLineTo(16.5f)
        lineTo(17.0141f, 20.489f)
        curveTo(18.2848f, 21.601f, 18.9201f, 22.157f, 19.46f, 21.9614f)
        curveTo(19.9998f, 21.7657f, 19.9998f, 20.9794f, 19.9998f, 19.4068f)
        }
        }.build()

        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
