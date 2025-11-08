package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FilePin: ImageVector
    get() {
        if (_filePin != null) {
            return _filePin!!
        }
        _filePin = ImageVector.Builder(
            name = "FilePin",
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
        moveTo(17f, 19f)
        horizontalLineTo(15.5754f)
        curveTo(14.6713f, 19f, 14.2192f, 19f, 14.0534f, 18.7463f)
        curveTo(13.8875f, 18.4927f, 14.1201f, 18.157f, 14.5853f, 17.4855f)
        lineTo(15.0384f, 16.8315f)
        curveTo(15.1519f, 16.6677f, 15.2086f, 16.5858f, 15.227f, 16.4938f)
        curveTo(15.2454f, 16.4019f, 15.2238f, 16.3083f, 15.1805f, 16.1209f)
        lineTo(14.9669f, 15.1961f)
        curveTo(14.8391f, 14.6427f, 14.7753f, 14.366f, 14.9485f, 14.183f)
        curveTo(15.1217f, 14f, 15.4475f, 14f, 16.0992f, 14f)
        horizontalLineTo(17.9008f)
        curveTo(18.5525f, 14f, 18.8783f, 14f, 19.0515f, 14.183f)
        curveTo(19.2248f, 14.366f, 19.1609f, 14.6427f, 19.0331f, 15.1961f)
        lineTo(18.8195f, 16.1209f)
        curveTo(18.7762f, 16.3083f, 18.7546f, 16.4019f, 18.773f, 16.4938f)
        curveTo(18.7914f, 16.5858f, 18.8481f, 16.6677f, 18.9616f, 16.8315f)
        lineTo(19.4147f, 17.4855f)
        curveTo(19.8799f, 18.157f, 20.1125f, 18.4927f, 19.9466f, 18.7463f)
        curveTo(19.7808f, 19f, 19.3287f, 19f, 18.4246f, 19f)
        horizontalLineTo(17f)
        moveTo(17f, 19f)
        verticalLineTo(22f)
        }
        }.build()

        return _filePin!!
    }

private var _filePin: ImageVector? = null
