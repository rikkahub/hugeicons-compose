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

val HugeIcons.TicketPercent: ImageVector
    get() {
        if (_ticketPercent != null) {
            return _ticketPercent!!
        }
        _ticketPercent = ImageVector.Builder(
            name = "TicketPercent",
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
            moveTo(18f, 9f)
            lineTo(12f, 15f)
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
            moveTo(12.375f, 9.25f)
            horizontalLineTo(12.25f)
            moveTo(12.5f, 9.25f)
            curveTo(12.5f, 9.38807f, 12.3881f, 9.5f, 12.25f, 9.5f)
            curveTo(12.1119f, 9.5f, 12f, 9.38807f, 12f, 9.25f)
            curveTo(12f, 9.11193f, 12.1119f, 9f, 12.25f, 9f)
            curveTo(12.3881f, 9f, 12.5f, 9.11193f, 12.5f, 9.25f)
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
            moveTo(17.875f, 14.75f)
            horizontalLineTo(17.75f)
            moveTo(18f, 14.75f)
            curveTo(18f, 14.8881f, 17.8881f, 15f, 17.75f, 15f)
            curveTo(17.6119f, 15f, 17.5f, 14.8881f, 17.5f, 14.75f)
            curveTo(17.5f, 14.6119f, 17.6119f, 14.5f, 17.75f, 14.5f)
            curveTo(17.8881f, 14.5f, 18f, 14.6119f, 18f, 14.75f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(22.0039f, 8.87895f)
            curveTo(21.937f, 7.33687f, 21.7495f, 6.33298f, 21.2242f, 5.53884f)
            curveTo(20.922f, 5.08196f, 20.5467f, 4.68459f, 20.1151f, 4.36468f)
            curveTo(18.9486f, 3.5f, 17.3029f, 3.5f, 14.0117f, 3.5f)
            horizontalLineTo(9.99696f)
            curveTo(6.70569f, 3.5f, 5.06005f, 3.5f, 3.89353f, 4.36468f)
            curveTo(3.46195f, 4.68459f, 3.08657f, 5.08196f, 2.78438f, 5.53884f)
            curveTo(2.25916f, 6.33289f, 2.07167f, 7.33665f, 2.00473f, 8.87843f)
            curveTo(1.99329f, 9.14208f, 2.22038f, 9.34375f, 2.46921f, 9.34375f)
            curveTo(3.855f, 9.34375f, 4.97839f, 10.533f, 4.97839f, 12f)
            curveTo(4.97839f, 13.467f, 3.855f, 14.6562f, 2.46921f, 14.6562f)
            curveTo(2.22038f, 14.6562f, 1.99329f, 14.8579f, 2.00473f, 15.1216f)
            curveTo(2.07167f, 16.6634f, 2.25916f, 17.6671f, 2.78438f, 18.4612f)
            curveTo(3.08657f, 18.918f, 3.46195f, 19.3154f, 3.89353f, 19.6353f)
            curveTo(5.06005f, 20.5f, 6.70569f, 20.5f, 9.99696f, 20.5f)
            horizontalLineTo(14.0117f)
            curveTo(17.3029f, 20.5f, 18.9486f, 20.5f, 20.1151f, 19.6353f)
            curveTo(20.5467f, 19.3154f, 20.922f, 18.918f, 21.2242f, 18.4612f)
            curveTo(21.7495f, 17.667f, 21.937f, 16.6631f, 22.0039f, 15.1211f)
            verticalLineTo(8.87895f)
            close()
        }
        }.build()

        return _ticketPercent!!
    }

private var _ticketPercent: ImageVector? = null
