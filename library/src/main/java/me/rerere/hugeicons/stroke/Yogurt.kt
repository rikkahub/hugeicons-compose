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

val HugeIcons.Yogurt: ImageVector
    get() {
        if (_yogurt != null) {
            return _yogurt!!
        }
        _yogurt = ImageVector.Builder(
            name = "Yogurt",
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
            moveTo(15.5911f, 5.75202f)
            curveTo(17.1781f, 6.35504f, 18.2293f, 8.60237f, 16.9214f, 10.2725f)
            curveTo(16.477f, 10.8399f, 15.8249f, 11.2489f, 15.0731f, 11.3952f)
            moveTo(16.9214f, 10.2725f)
            curveTo(18.8538f, 10.2727f, 21.1104f, 12.7982f, 19.3857f, 15f)
            moveTo(9f, 10.9247f)
            curveTo(8.26918f, 10.353f, 7.34468f, 10.1719f, 6.49945f, 10.3221f)
            curveTo(4.71115f, 10.6399f, 3.08337f, 13.0641f, 4.59984f, 15f)
            moveTo(13.841f, 7.90896f)
            curveTo(14.8748f, 7.24795f, 15.4267f, 6.4945f, 15.5911f, 5.75202f)
            curveTo(16.0145f, 3.83963f, 13.8671f, 2f, 10.7606f, 2f)
            curveTo(11.5972f, 2.53491f, 11.8868f, 3.19088f, 11.858f, 3.80353f)
            curveTo(11.7071f, 7.01202f, 5.67427f, 5.23022f, 6.49945f, 10.3221f)
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
            moveTo(3f, 15f)
            lineTo(3.82811f, 17.7374f)
            curveTo(4.44939f, 19.7911f, 4.76004f, 20.8179f, 5.55635f, 21.4089f)
            curveTo(6.35266f, 22f, 7.42546f, 22f, 9.57107f, 22f)
            horizontalLineTo(14.4289f)
            curveTo(16.5745f, 22f, 17.6473f, 22f, 18.4437f, 21.4089f)
            curveTo(19.24f, 20.8179f, 19.5506f, 19.7911f, 20.1719f, 17.7374f)
            lineTo(21f, 15f)
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
            moveTo(2f, 15f)
            horizontalLineTo(22f)
        }
        }.build()

        return _yogurt!!
    }

private var _yogurt: ImageVector? = null
