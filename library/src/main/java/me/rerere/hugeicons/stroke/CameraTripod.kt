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

val HugeIcons.CameraTripod: ImageVector
    get() {
        if (_cameraTripod != null) {
            return _cameraTripod!!
        }
        _cameraTripod = ImageVector.Builder(
            name = "CameraTripod",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 10f)
            curveTo(2f, 6.49335f, 2f, 4.74003f, 2.90796f, 3.55992f)
            curveTo(3.07418f, 3.34388f, 3.25989f, 3.14579f, 3.46243f, 2.96849f)
            curveTo(4.56878f, 2f, 6.21252f, 2f, 9.5f, 2f)
            horizontalLineTo(14.5f)
            curveTo(17.7875f, 2f, 19.4312f, 2f, 20.5376f, 2.96849f)
            curveTo(20.7401f, 3.14579f, 20.9258f, 3.34388f, 21.092f, 3.55992f)
            curveTo(22f, 4.74003f, 22f, 6.49335f, 22f, 10f)
            curveTo(22f, 13.5066f, 22f, 15.26f, 21.092f, 16.4401f)
            curveTo(20.9258f, 16.6561f, 20.7401f, 16.8542f, 20.5376f, 17.0315f)
            curveTo(19.4312f, 18f, 17.7875f, 18f, 14.5f, 18f)
            horizontalLineTo(9.5f)
            curveTo(6.21252f, 18f, 4.56878f, 18f, 3.46243f, 17.0315f)
            curveTo(3.25989f, 16.8542f, 3.07418f, 16.6561f, 2.90796f, 16.4401f)
            curveTo(2f, 15.26f, 2f, 13.5066f, 2f, 10f)
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
            moveTo(17f, 22f)
            lineTo(12.8333f, 18f)
            moveTo(7f, 22f)
            lineTo(11.1667f, 18f)
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
            moveTo(12f, 18f)
            lineTo(12f, 23f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15f, 9.5f)
            arcTo(3f, 3f, 0f, true, false, 9f, 9.5f)
            arcTo(3f, 3f, 0f, true, false, 15f, 9.5f)
            close()
        }
        }.build()

        return _cameraTripod!!
    }

private var _cameraTripod: ImageVector? = null
