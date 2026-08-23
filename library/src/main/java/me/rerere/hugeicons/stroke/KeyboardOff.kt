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

val HugeIcons.KeyboardOff: ImageVector
    get() {
        if (_keyboardOff != null) {
            return _keyboardOff!!
        }
        _keyboardOff = ImageVector.Builder(
            name = "KeyboardOff",
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
            moveTo(6.9986f, 12f)
            lineTo(7.9986f, 12f)
            moveTo(11.4986f, 12f)
            lineTo(11.9986f, 12f)
            moveTo(15.9986f, 12f)
            lineTo(16.9986f, 12f)
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
            moveTo(6.9986f, 17f)
            lineTo(16.9986f, 17f)
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
            moveTo(1.9986f, 2f)
            lineTo(21.9986f, 22f)
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
            moveTo(20.5362f, 21.092f)
            curveTo(19.4298f, 21.9999f, 17.7861f, 21.9999f, 14.4986f, 21.9999f)
            horizontalLineTo(9.4986f)
            curveTo(6.21111f, 21.9999f, 4.56737f, 21.9999f, 3.46102f, 21.092f)
            curveTo(3.25849f, 20.9257f, 3.07277f, 20.74f, 2.90655f, 20.5375f)
            curveTo(1.9986f, 19.4311f, 1.9986f, 17.7874f, 1.9986f, 14.4999f)
            curveTo(1.9986f, 11.2124f, 1.9986f, 9.5687f, 2.90655f, 8.46235f)
            curveTo(3.07277f, 8.25981f, 3.25849f, 8.0741f, 3.46102f, 7.90788f)
            curveTo(4.24233f, 7.26668f, 5.29163f, 7.0783f, 6.9986f, 7.02295f)
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
            moveTo(21.9756f, 17f)
            curveTo(21.9986f, 16.2898f, 21.9986f, 15.4659f, 21.9986f, 14.5f)
            curveTo(21.9986f, 11.2125f, 21.9986f, 9.56878f, 21.0906f, 8.46243f)
            curveTo(20.9244f, 8.25989f, 20.7387f, 8.07418f, 20.5362f, 7.90796f)
            curveTo(19.4298f, 7f, 17.7861f, 7f, 14.4986f, 7f)
            horizontalLineTo(11.9986f)
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
            moveTo(11.9986f, 7f)
            verticalLineTo(5f)
            curveTo(11.9986f, 4.44772f, 12.4463f, 4f, 12.9986f, 4f)
            curveTo(13.5509f, 4f, 13.9986f, 3.55228f, 13.9986f, 3f)
            verticalLineTo(2f)
        }
        }.build()

        return _keyboardOff!!
    }

private var _keyboardOff: ImageVector? = null
