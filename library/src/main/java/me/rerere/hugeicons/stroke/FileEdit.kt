package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileEdit: ImageVector
    get() {
        if (_fileEdit != null) {
            return _fileEdit!!
        }
        _fileEdit = ImageVector.Builder(
            name = "FileEdit",
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
        moveTo(13f, 20.8268f)
        verticalLineTo(22f)
        horizontalLineTo(14.1734f)
        curveTo(14.5827f, 22f, 14.7874f, 22f, 14.9715f, 21.9238f)
        curveTo(15.1555f, 21.8475f, 15.3003f, 21.7028f, 15.5897f, 21.4134f)
        lineTo(20.4133f, 16.5894f)
        curveTo(20.6864f, 16.3164f, 20.8229f, 16.1799f, 20.8959f, 16.0327f)
        curveTo(21.0347f, 15.7525f, 21.0347f, 15.4236f, 20.8959f, 15.1434f)
        curveTo(20.8229f, 14.9961f, 20.6864f, 14.8596f, 20.4133f, 14.5866f)
        curveTo(20.1403f, 14.3136f, 20.0038f, 14.1771f, 19.8565f, 14.1041f)
        curveTo(19.5763f, 13.9653f, 19.2473f, 13.9653f, 18.9671f, 14.1041f)
        curveTo(18.8198f, 14.1771f, 18.6833f, 14.3136f, 18.4103f, 14.5866f)
        lineTo(18.4103f, 14.5866f)
        lineTo(13.5867f, 19.4106f)
        curveTo(13.2972f, 19.7f, 13.1525f, 19.8447f, 13.0762f, 20.0287f)
        curveTo(13f, 20.2128f, 13f, 20.4174f, 13f, 20.8268f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 11f)
        curveTo(19f, 11f, 19f, 9.4306f, 18.8478f, 9.06306f)
        curveTo(18.6955f, 8.69552f, 18.4065f, 8.40649f, 17.8284f, 7.82843f)
        lineTo(13.0919f, 3.09188f)
        curveTo(12.593f, 2.593f, 12.3436f, 2.34355f, 12.0345f, 2.19575f)
        curveTo(11.9702f, 2.165f, 11.9044f, 2.13772f, 11.8372f, 2.11401f)
        curveTo(11.5141f, 2f, 11.1614f, 2f, 10.4558f, 2f)
        curveTo(7.21082f, 2f, 5.58831f, 2f, 4.48933f, 2.88607f)
        curveTo(4.26731f, 3.06508f, 4.06508f, 3.26731f, 3.88607f, 3.48933f)
        curveTo(3f, 4.58831f, 3f, 6.21082f, 3f, 9.45584f)
        verticalLineTo(14f)
        curveTo(3f, 17.7712f, 3f, 19.6569f, 4.17157f, 20.8284f)
        curveTo(5.23467f, 21.8915f, 6.8857f, 21.99f, 10f, 21.9991f)
        moveTo(12f, 2.5f)
        verticalLineTo(3f)
        curveTo(12f, 5.82843f, 12f, 7.24264f, 12.8787f, 8.12132f)
        curveTo(13.7574f, 9f, 15.1716f, 9f, 18f, 9f)
        horizontalLineTo(18.5f)
        }
        }.build()

        return _fileEdit!!
    }

private var _fileEdit: ImageVector? = null
