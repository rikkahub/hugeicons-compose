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

val HugeIcons.MapPlus: ImageVector
    get() {
        if (_mapPlus != null) {
            return _mapPlus!!
        }
        _mapPlus = ImageVector.Builder(
            name = "MapPlus",
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
            moveTo(21.9953f, 17.5f)
            horizontalLineTo(18.4953f)
            moveTo(18.4953f, 17.5f)
            horizontalLineTo(14.9953f)
            moveTo(18.4953f, 17.5f)
            verticalLineTo(14f)
            moveTo(18.4953f, 17.5f)
            verticalLineTo(21f)
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
            moveTo(21.9953f, 11.75f)
            curveTo(21.9953f, 10.2654f, 21.9953f, 9.0173f, 21.9953f, 7.2042f)
            curveTo(21.9953f, 5.11828f, 21.9953f, 4.07531f, 21.321f, 3.62401f)
            curveTo(20.6468f, 3.17271f, 19.7024f, 3.58355f, 17.8135f, 4.40524f)
            lineTo(16.571f, 4.94579f)
            curveTo(15.7942f, 5.2837f, 15.4058f, 5.45266f, 14.9953f, 5.45266f)
            curveTo(14.5848f, 5.45266f, 14.1964f, 5.2837f, 13.4196f, 4.94579f)
            lineTo(11.4057f, 4.06967f)
            curveTo(9.72816f, 3.3399f, 8.88939f, 2.97502f, 8.00732f, 3.00133f)
            curveTo(7.12525f, 3.02764f, 6.30904f, 3.44189f, 4.67663f, 4.27039f)
            lineTo(4.20645f, 4.50902f)
            curveTo(3.13061f, 5.05504f, 2.5927f, 5.32805f, 2.294f, 5.81863f)
            curveTo(1.9953f, 6.30922f, 1.9953f, 6.91968f, 1.9953f, 8.14062f)
            verticalLineTo(15.6171f)
            curveTo(1.9953f, 17.5451f, 1.9953f, 18.5091f, 2.61823f, 18.9648f)
            curveTo(3.24117f, 19.4206f, 4.14212f, 19.1157f, 5.94398f, 18.5061f)
            lineTo(6.55255f, 18.3001f)
            curveTo(7.26581f, 18.0588f, 7.62244f, 17.9381f, 7.9895f, 17.9536f)
            curveTo(8.35655f, 17.9691f, 8.70208f, 18.1195f, 9.39313f, 18.4201f)
            lineTo(11.8439f, 19.4862f)
            curveTo(11.8952f, 19.5086f, 11.9457f, 19.5305f, 11.9953f, 19.5521f)
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
            moveTo(7.9953f, 3.09375f)
            curveTo(7.9953f, 8.84164f, 7.9953f, 12.0643f, 7.9953f, 17.8121f)
            moveTo(14.9953f, 11.75f)
            verticalLineTo(5.63141f)
        }
        }.build()

        return _mapPlus!!
    }

private var _mapPlus: ImageVector? = null
