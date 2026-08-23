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

val HugeIcons.ChartLine: ImageVector
    get() {
        if (_chartLine != null) {
            return _chartLine!!
        }
        _chartLine = ImageVector.Builder(
            name = "ChartLine",
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
            moveTo(7f, 15.2461f)
            lineTo(9.87381f, 11.5319f)
            curveTo(10.1242f, 11.2082f, 10.2495f, 11.0464f, 10.3862f, 10.9354f)
            curveTo(10.7975f, 10.6017f, 11.3471f, 10.5135f, 11.8368f, 10.7026f)
            curveTo(11.9997f, 10.7654f, 12.1664f, 10.8804f, 12.5f, 11.1103f)
            curveTo(12.8336f, 11.3402f, 13.0003f, 11.4552f, 13.1632f, 11.518f)
            curveTo(13.6529f, 11.7071f, 14.2025f, 11.6189f, 14.6138f, 11.2852f)
            curveTo(14.7505f, 11.1742f, 14.8757f, 11.0124f, 15.1262f, 10.6887f)
            lineTo(15.9061f, 9.68068f)
            curveTo(16.8833f, 8.41772f, 17.3719f, 7.78624f, 18.0414f, 7.7479f)
            curveTo(18.7109f, 7.70956f, 19.264f, 8.28139f, 20.3701f, 9.42505f)
            lineTo(21f, 10.0764f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21f, 21f)
            horizontalLineTo(10f)
            curveTo(6.70017f, 21f, 5.05025f, 21f, 4.02513f, 19.9749f)
            curveTo(3f, 18.9497f, 3f, 17.2998f, 3f, 14f)
            verticalLineTo(3f)
        }
        }.build()

        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
