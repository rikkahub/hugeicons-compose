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

val HugeIcons.Metronome: ImageVector
    get() {
        if (_metronome != null) {
            return _metronome!!
        }
        _metronome = ImageVector.Builder(
            name = "Metronome",
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
            moveTo(14.0073f, 6f)
            lineTo(13.7349f, 4.91043f)
            curveTo(13.5833f, 4.30398f, 13.5075f, 4.00075f, 13.3905f, 3.74637f)
            curveTo(12.9843f, 2.86326f, 12.1754f, 2.2317f, 11.2201f, 2.05182f)
            curveTo(10.945f, 2f, 10.6324f, 2f, 10.0073f, 2f)
            curveTo(9.38217f, 2f, 9.06961f, 2f, 8.79444f, 2.05182f)
            curveTo(7.83919f, 2.2317f, 7.0303f, 2.86326f, 6.6241f, 3.74637f)
            curveTo(6.50709f, 4.00075f, 6.43129f, 4.30398f, 6.27968f, 4.91043f)
            lineTo(3.87108f, 14.5448f)
            curveTo(3.01314f, 17.9766f, 2.58416f, 19.6925f, 3.48499f, 20.8462f)
            curveTo(4.38583f, 22f, 6.15453f, 22f, 9.69194f, 22f)
            horizontalLineTo(10.3226f)
            curveTo(13.86f, 22f, 15.6287f, 22f, 16.5296f, 20.8462f)
            curveTo(17.2402f, 19.9361f, 17.1233f, 18.6761f, 16.6211f, 16.5f)
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
            moveTo(10.0078f, 13.5f)
            verticalLineTo(6f)
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
            moveTo(10.0078f, 18f)
            lineTo(17.0078f, 11f)
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
            moveTo(20.5078f, 9.5f)
            arcTo(2f, 2f, 0f, true, false, 16.5078f, 9.5f)
            arcTo(2f, 2f, 0f, true, false, 20.5078f, 9.5f)
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
            moveTo(20.0078f, 8f)
            lineTo(21.0078f, 7f)
        }
        }.build()

        return _metronome!!
    }

private var _metronome: ImageVector? = null
