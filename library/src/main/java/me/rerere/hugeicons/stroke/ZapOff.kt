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

val HugeIcons.ZapOff: ImageVector
    get() {
        if (_zapOff != null) {
            return _zapOff!!
        }
        _zapOff = ImageVector.Builder(
            name = "ZapOff",
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
            moveTo(15.5f, 15.7121f)
            lineTo(11.808f, 20.6881f)
            curveTo(11.3389f, 21.3204f, 10.4595f, 20.9269f, 10.4595f, 20.0846f)
            verticalLineTo(13.8271f)
            curveTo(10.4595f, 13.3225f, 10.1147f, 12.9135f, 9.68931f, 12.9135f)
            horizontalLineTo(6.77173f)
            curveTo(6.10895f, 12.9135f, 5.75566f, 11.9866f, 6.19351f, 11.3965f)
            lineTo(8.3426f, 8.5f)
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
            moveTo(17.8065f, 12.603f)
            curveTo(18.2443f, 12.0128f, 17.891f, 11.0859f, 17.2283f, 11.0859f)
            horizontalLineTo(16f)
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
            moveTo(10.1992f, 6f)
            lineTo(12.1937f, 3.31186f)
            curveTo(12.6628f, 2.67957f, 13.5422f, 3.07311f, 13.5422f, 3.91536f)
            verticalLineTo(8.5f)
        }
        }.build()

        return _zapOff!!
    }

private var _zapOff: ImageVector? = null
