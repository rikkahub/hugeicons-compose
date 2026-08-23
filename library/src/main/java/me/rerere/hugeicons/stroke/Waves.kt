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

val HugeIcons.Waves: ImageVector
    get() {
        if (_waves != null) {
            return _waves!!
        }
        _waves = ImageVector.Builder(
            name = "Waves",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 12.1932f)
            curveTo(2.68524f, 13.2443f, 3.57104f, 13.2443f, 4.27299f, 12.1932f)
            curveTo(6.52985f, 8.7408f, 8.67954f, 14.6764f, 10.273f, 12.2321f)
            curveTo(12.703f, 8.56944f, 14.4508f, 14.9218f, 16.273f, 12.1932f)
            curveTo(18.6492f, 8.5582f, 20.1295f, 14.5776f, 22f, 12.5842f)
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
            moveTo(2f, 6.1932f)
            curveTo(2.68524f, 7.24434f, 3.57104f, 7.24434f, 4.27299f, 6.1932f)
            curveTo(6.52985f, 2.7408f, 8.67954f, 8.67642f, 10.273f, 6.23213f)
            curveTo(12.703f, 2.56944f, 14.4508f, 8.92184f, 16.273f, 6.1932f)
            curveTo(18.6492f, 2.5582f, 20.1295f, 8.57758f, 22f, 6.58418f)
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
            moveTo(2f, 18.1932f)
            curveTo(2.68524f, 19.2443f, 3.57104f, 19.2443f, 4.27299f, 18.1932f)
            curveTo(6.52985f, 14.7408f, 8.67954f, 20.6764f, 10.273f, 18.2321f)
            curveTo(12.703f, 14.5694f, 14.4508f, 20.9218f, 16.273f, 18.1932f)
            curveTo(18.6492f, 14.5582f, 20.1295f, 20.5776f, 22f, 18.5842f)
        }
        }.build()

        return _waves!!
    }

private var _waves: ImageVector? = null
