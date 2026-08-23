package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SwitchCamera: ImageVector
    get() {
        if (_switchCamera != null) {
            return _switchCamera!!
        }
        _switchCamera = ImageVector.Builder(
            name = "SwitchCamera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13f, 8.5f)
            horizontalLineTo(11f)
            curveTo(9.59987f, 8.5f, 8.8998f, 8.5f, 8.36502f, 8.77248f)
            curveTo(7.89462f, 9.01217f, 7.51217f, 9.39462f, 7.27248f, 9.86502f)
            curveTo(7f, 10.3998f, 7f, 11.0999f, 7f, 12.5f)
            curveTo(7f, 13.9001f, 7f, 14.6002f, 7.27248f, 15.135f)
            curveTo(7.51217f, 15.6054f, 7.89462f, 15.9878f, 8.36502f, 16.2275f)
            curveTo(8.8998f, 16.5f, 9.59987f, 16.5f, 11f, 16.5f)
            horizontalLineTo(13f)
            curveTo(14.4001f, 16.5f, 15.1002f, 16.5f, 15.635f, 16.2275f)
            curveTo(16.1054f, 15.9878f, 16.4878f, 15.6054f, 16.7275f, 15.135f)
            curveTo(17f, 14.6002f, 17f, 13.9001f, 17f, 12.5f)
            curveTo(17f, 11.0999f, 17f, 10.3998f, 16.7275f, 9.86502f)
            curveTo(16.4878f, 9.39462f, 16.1054f, 9.01217f, 15.635f, 8.77248f)
            curveTo(15.1002f, 8.5f, 14.4001f, 8.5f, 13f, 8.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10f, 8.5f)
            lineTo(10.2236f, 8.05279f)
            curveTo(10.393f, 7.714f, 10.7393f, 7.5f, 11.118f, 7.5f)
            horizontalLineTo(12.882f)
            curveTo(13.2607f, 7.5f, 13.607f, 7.714f, 13.7764f, 8.05279f)
            lineTo(14f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.2001f, 4f)
            lineTo(10.2001f, 2.20004f)
            curveTo(10.8463f, 2.06886f, 11.5151f, 2f, 12.2001f, 2f)
            curveTo(17.038f, 2f, 21.0735f, 5.43552f, 22f, 10f)
            moveTo(11.8f, 20f)
            lineTo(13.8f, 21.8f)
            curveTo(13.1538f, 21.9311f, 12.4849f, 22f, 11.8f, 22f)
            curveTo(6.96208f, 22f, 2.92657f, 18.5645f, 2.00003f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 12f)
            verticalLineTo(12.5f)
            moveTo(13f, 12.5f)
            curveTo(13f, 13.0523f, 12.5523f, 13.5f, 12f, 13.5f)
            curveTo(11.4477f, 13.5f, 11f, 13.0523f, 11f, 12.5f)
            curveTo(11f, 11.9477f, 11.4477f, 11.5f, 12f, 11.5f)
            curveTo(12.5523f, 11.5f, 13f, 11.9477f, 13f, 12.5f)
            close()
        }
        }.build()

        return _switchCamera!!
    }

private var _switchCamera: ImageVector? = null
