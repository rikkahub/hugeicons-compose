package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ContentWriting: ImageVector
    get() {
        if (_contentWriting != null) {
            return _contentWriting!!
        }
        _contentWriting = ImageVector.Builder(
            name = "ContentWriting",
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
        moveTo(10f, 19.5f)
        curveTo(6.22876f, 19.5f, 4.34315f, 19.5f, 3.17157f, 18.3284f)
        curveTo(2f, 17.1569f, 2f, 15.2712f, 2f, 11.5f)
        verticalLineTo(10.5f)
        curveTo(2f, 6.72876f, 2f, 4.84315f, 3.17157f, 3.67157f)
        curveTo(4.34315f, 2.5f, 6.22876f, 2.5f, 10f, 2.5f)
        horizontalLineTo(13.5f)
        curveTo(16.7875f, 2.5f, 18.4312f, 2.5f, 19.5376f, 3.40796f)
        curveTo(19.7401f, 3.57418f, 19.9258f, 3.75989f, 20.092f, 3.96243f)
        curveTo(21f, 5.06878f, 21f, 6.71252f, 21f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8.5f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 5.5f)
        horizontalLineTo(5.50998f)
        moveTo(9.49002f, 5.5f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.6716f, 21.5f)
        horizontalLineTo(13f)
        verticalLineTo(19.8284f)
        curveTo(13f, 19.298f, 13.2107f, 18.7893f, 13.5858f, 18.4142f)
        lineTo(19.0616f, 12.9393f)
        curveTo(19.6474f, 12.3536f, 20.5972f, 12.3536f, 21.183f, 12.9393f)
        lineTo(21.5616f, 13.318f)
        curveTo(22.1474f, 13.9038f, 22.1474f, 14.8536f, 21.5616f, 15.4393f)
        lineTo(16.0858f, 20.9142f)
        curveTo(15.7107f, 21.2893f, 15.202f, 21.5f, 14.6716f, 21.5f)
        }
        }.build()

        return _contentWriting!!
    }

private var _contentWriting: ImageVector? = null
