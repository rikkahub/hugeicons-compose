package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DocumentAttachment: ImageVector
    get() {
        if (_documentAttachment != null) {
            return _documentAttachment!!
        }
        _documentAttachment = ImageVector.Builder(
            name = "DocumentAttachment",
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
        moveTo(20.4999f, 10.5f)
        verticalLineTo(10f)
        curveTo(20.4999f, 6.22876f, 20.4999f, 4.34315f, 19.3284f, 3.17157f)
        curveTo(18.1568f, 2f, 16.2712f, 2f, 12.4999f, 2f)
        horizontalLineTo(11.5f)
        curveTo(7.72883f, 2f, 5.84323f, 2f, 4.67166f, 3.17156f)
        curveTo(3.50009f, 4.34312f, 3.50007f, 6.22872f, 3.50004f, 9.99993f)
        lineTo(3.5f, 14.5f)
        curveTo(3.49997f, 17.7874f, 3.49996f, 19.4312f, 4.40788f, 20.5375f)
        curveTo(4.57412f, 20.7401f, 4.75986f, 20.9258f, 4.96242f, 21.0921f)
        curveTo(6.06877f, 22f, 7.71249f, 22f, 10.9999f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 7f)
        horizontalLineTo(16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 12f)
        horizontalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 20f)
        lineTo(20.5f, 17f)
        curveTo(20.5f, 15.5706f, 19.1569f, 14f, 17.5f, 14f)
        curveTo(15.8431f, 14f, 14.5f, 15.5706f, 14.5f, 17f)
        lineTo(14.5f, 20.5f)
        curveTo(14.5f, 21.3284f, 15.1716f, 22f, 16f, 22f)
        curveTo(16.8284f, 22f, 17.5f, 21.3284f, 17.5f, 20.5f)
        verticalLineTo(17f)
        }
        }.build()

        return _documentAttachment!!
    }

private var _documentAttachment: ImageVector? = null
