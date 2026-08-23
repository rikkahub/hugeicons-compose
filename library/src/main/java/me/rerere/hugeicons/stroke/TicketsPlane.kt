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

val HugeIcons.TicketsPlane: ImageVector
    get() {
        if (_ticketsPlane != null) {
            return _ticketsPlane!!
        }
        _ticketsPlane = ImageVector.Builder(
            name = "TicketsPlane",
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
            moveTo(19.9023f, 7.25f)
            lineTo(19.409f, 5.98277f)
            curveTo(18.858f, 4.72435f, 18.3862f, 3.95201f, 17.7169f, 3.46387f)
            curveTo(17.3318f, 3.18304f, 16.9085f, 2.97545f, 16.4661f, 2.85049f)
            curveTo(15.2702f, 2.51272f, 13.9775f, 3.04892f, 11.392f, 4.12133f)
            lineTo(8.23816f, 5.42944f)
            curveTo(7.53483f, 5.72116f, 6.92717f, 5.97321f, 6.40234f, 6.20767f)
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
            moveTo(3f, 16.25f)
            curveTo(4.38071f, 16.25f, 5.5f, 15.1307f, 5.5f, 13.75f)
            curveTo(5.5f, 12.3693f, 4.38071f, 11.25f, 3f, 11.25f)
            curveTo(3f, 10.3207f, 3f, 9.85603f, 3.07686f, 9.46964f)
            curveTo(3.39249f, 7.88288f, 4.63288f, 6.64249f, 6.21964f, 6.32686f)
            curveTo(6.60603f, 6.25f, 7.07069f, 6.25f, 8f, 6.25f)
            horizontalLineTo(13.5f)
            curveTo(16.7875f, 6.25f, 18.4312f, 6.25f, 19.5376f, 7.15796f)
            curveTo(19.7401f, 7.32418f, 19.9258f, 7.50989f, 20.092f, 7.71243f)
            curveTo(21f, 8.81878f, 21f, 10.6418f, 21f, 14.288f)
            curveTo(21f, 17.2168f, 21f, 18.6812f, 20.092f, 19.7876f)
            curveTo(19.9258f, 19.9901f, 19.7401f, 20.1758f, 19.5376f, 20.342f)
            curveTo(18.4312f, 21.25f, 16.7875f, 21.25f, 13.5f, 21.25f)
            horizontalLineTo(8f)
            curveTo(7.07069f, 21.25f, 6.60603f, 21.25f, 6.21964f, 21.1731f)
            curveTo(4.63288f, 20.8575f, 3.39249f, 19.6171f, 3.07686f, 18.0304f)
            curveTo(3f, 17.644f, 3f, 17.1793f, 3f, 16.25f)
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
            moveTo(10f, 14f)
            lineTo(10.7071f, 14.7071f)
            curveTo(10.8946f, 14.8946f, 11.149f, 15f, 11.4142f, 15f)
            horizontalLineTo(16f)
            moveTo(18f, 15f)
            horizontalLineTo(16f)
            moveTo(16f, 15f)
            lineTo(13f, 12f)
        }
        }.build()

        return _ticketsPlane!!
    }

private var _ticketsPlane: ImageVector? = null
