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

val HugeIcons.FlashlightOff: ImageVector
    get() {
        if (_flashlightOff != null) {
            return _flashlightOff!!
        }
        _flashlightOff = ImageVector.Builder(
            name = "FlashlightOff",
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
            moveTo(6f, 6f)
            curveTo(6f, 7.04416f, 6.27249f, 8.07025f, 6.79054f, 8.97683f)
            lineTo(7.71665f, 10.526f)
            curveTo(7.85746f, 10.7616f, 7.92786f, 10.8793f, 7.96393f, 11.01f)
            curveTo(8f, 11.1406f, 8f, 11.2778f, 8f, 11.5522f)
            verticalLineTo(18f)
            curveTo(8f, 19.4001f, 8f, 20.1002f, 8.27248f, 20.635f)
            curveTo(8.51217f, 21.1054f, 8.89462f, 21.4878f, 9.36502f, 21.7275f)
            curveTo(9.8998f, 22f, 10.5999f, 22f, 12f, 22f)
            curveTo(13.4001f, 22f, 14.1002f, 22f, 14.635f, 21.7275f)
            curveTo(15.1054f, 21.4878f, 15.4878f, 21.1054f, 15.7275f, 20.635f)
            curveTo(16f, 20.1002f, 16f, 19.4001f, 16f, 18f)
            verticalLineTo(16f)
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
            moveTo(7f, 2.29243f)
            curveTo(7.60164f, 2f, 8.50417f, 2f, 10f, 2f)
            horizontalLineTo(14f)
            curveTo(15.8856f, 2f, 16.8284f, 2f, 17.4142f, 2.58579f)
            curveTo(18f, 3.17157f, 18f, 4.11438f, 18f, 6f)
            curveTo(18f, 7.04416f, 17.7275f, 8.07025f, 17.2095f, 8.97683f)
            lineTo(16.2834f, 10.526f)
            curveTo(16.1425f, 10.7616f, 16.0721f, 10.8793f, 16.0361f, 11.01f)
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
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
            moveTo(11f, 6f)
            lineTo(18f, 6f)
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
            verticalLineTo(15f)
        }
        }.build()

        return _flashlightOff!!
    }

private var _flashlightOff: ImageVector? = null
